import java.text.NumberFormat;
public class GenProdClass 
{ // open class
	private String productName;
	private String productCode;
	private String productDescript;
	private static int productCount = 0;
	private double productPrice = 0.0;
	private double totalCost = 0.0;

	public GenProdClass(String productName, String productDescript)
	{
		if(productName == null )
		{
			throw new NullPointerException();
		}
		if(productDescript == null )
		{
		throw new NullPointerException();
		}
	}
	public GenProdClass(String productCode, String productDescript, double productPrice)
	{
		this.productName = productName;
		this.productCode = productCode;
		this.productDescript = productDescript;
		productCount++;
	}	
	public void setproductCode(String productCode) 
	{
		this.productCode = productCode;
	}
	public void setproductDescript(String productDescript)
	{ 	this.productDescript = productDescript;
	}
	public String getproductDescript()
	{
		return productDescript;
	}
	public void setproductPrice(double productPrice)
	{
		this.productPrice = productPrice;
	}
	public double getproductPrice()
	{		
		return productPrice;
	}
	public String getPriceFormatted()
	{
		String formattedPrice = NumberFormat.getCurrencyInstance().format(this.productPrice);
		return formattedPrice;
	}
	@Override
	public String toString()
	{
		return productDescript;
	}
	
	public static int getproductCount()
	{
		return productCount;
	}
	
}// close class

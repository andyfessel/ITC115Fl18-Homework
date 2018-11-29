
public class GenProdMainDemo {

	public static void main(String[] args)
	{
	GenProdClass p1 = new GenProdClass("Bananas", "tropical fruit - monkeys like them", 0.8);
	GenProdClass p2 = new GenProdClass("Apples", "one a day keeps doctor away",  0.4);
			
	p2.setproductPrice(0.5);
	
	System.out.println(p1.toString());
	System.out.println(p1.getPriceFormatted());
	System.out.println("Product count: " + p1.getproductCount());
	
	System.out.println(p2.getPriceFormatted());
}
}
	
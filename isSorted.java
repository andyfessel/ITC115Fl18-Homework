import java.util.Arrays;
public class isSorted 
{
	public static void main(String[] args) 
	{
		double[] list1 = {16.1, 12.3, 22.2, 14.4};
		double[] list2 = {1.5, 4.3, 7.0, 19.5, 25.1, 46.2};
	}
		public static void isSorted(double[] list1)
		{
				for (int i = 0; i < list1.length; i++)
				{
					for (int j = i + 1; j <= list1.length; j++)
					{
						if (list1[i] > list1[j])
						{
							System.out.println( "False");
						}		
					}	
				}
		}
		public static void isSorted2(double[] list2)
		{
				for (int i = 0; i < list2.length; i++)
				{
					for (int j = i + 1; j <= list2.length; j++)
					{
						if (list2[i] > list2[j])
						{
							System.out.println( "False");
						}		
					}	
				}
		}
}
		
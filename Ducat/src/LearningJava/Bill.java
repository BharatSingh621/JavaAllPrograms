package LearningJava;

public class Bill 

 {
	
	public int GST_Number=2187289;	
	
	public void Details() 
	{
		System.out.println("Ducat center");
		System.out.println(this.GST_Number);
		System.out.println("Secto-14 Gurgaon");
		System.out.println("Pin: 828729387");
		System.out.println("For any information Pls connect : 712398988");
		System.out.println();
	}
	

	 void Total_Bill(String product1, int price1 , String product2, int price2) 
	{
		System.out.println("The items your purchased are: ");
		System.out.println("1) "+ product1);
		System.out.println("2) "+ product2);
		int total_bill =price1+price2;
		System.out.println("The Total Bill amount is: " + total_bill);	
		System.out.println(this.GST_Number);		
		System.out.println("---------------------");	
	}

}

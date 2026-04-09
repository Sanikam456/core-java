class JuiceOrderRunner
{
	public static void main(String[] args)
	{
		
		JuiceOrder order1 = new JuiceOrder();
		double price1 = order1.getPriceByJuiceName("Orange Juice");
		System.out.println("Juice Price: " + price1);
		double totalAmount1 = order1.getTotalAmount(price1, 2);
		System.out.println("Total Price: " + totalAmount1);
		double finalAmount1 = order1.getDiscount(totalAmount1);
		System.out.println("Discount Price: " + finalAmount1);

		System.out.println("----------------------");

		
		JuiceOrder order2 = new JuiceOrder();
		double price2 = order2.getPriceByJuiceName("Mango Juice");
		System.out.println("Juice Price: " + price2);
		double totalAmount2 = order2.getTotalAmount(price2, 1);
		System.out.println("Total Price: " + totalAmount2);
		double finalAmount2 = order2.getDiscount(totalAmount2);
		System.out.println("Discount Price: " + finalAmount2);

		System.out.println("----------------------");

	
		JuiceOrder order3 = new JuiceOrder();
		double price3 = order3.getPriceByJuiceName("Apple Juice");
		System.out.println("Juice Price: " + price3);
		double totalAmount3 = order3.getTotalAmount(price3, 3);
		System.out.println("Total Price: " + totalAmount3);
		double finalAmount3 = order3.getDiscount(totalAmount3);
		System.out.println("Discount Price: " + finalAmount3);

		System.out.println("----------------------");

		
		JuiceOrder order4 = new JuiceOrder();
		double price4 = order4.getPriceByJuiceName("Pineapple Juice");
		System.out.println("Juice Price: " + price4);
		double totalAmount4 = order4.getTotalAmount(price4, 2);
		System.out.println("Total Price: " + totalAmount4);
		double finalAmount4 = order4.getDiscount(totalAmount4);
		System.out.println("Discount Price: " + finalAmount4);

		System.out.println("----------------------");

	
		JuiceOrder order5 = new JuiceOrder();
		double price5 = order5.getPriceByJuiceName("Mixed Fruit Juice");
		System.out.println("Juice Price: " + price5);
		double totalAmount5 = order5.getTotalAmount(price5, 1);
		System.out.println("Total Price: " + totalAmount5);
		double finalAmount5 = order5.getDiscount(totalAmount5);
		System.out.println("Discount Price: " + finalAmount5);
	}
}
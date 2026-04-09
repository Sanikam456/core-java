class ShoppingRunner
{
	public static void main(String[] args)
	{

		Shopping instance1 = new Shopping();
		double price1 = instance1.getPriceByProductName("Watch");
		System.out.println("Product Price: " + price1);
		double totalAmount1 = instance1.getTotalAmount(price1, 2);
		System.out.println("Total Price: " + totalAmount1);
		double finalAmount1 = instance1.getDiscount(totalAmount1);
		System.out.println("Discount Price: " + finalAmount1);

		System.out.println("----------------------");

		Shopping instance2 = new Shopping();
		double price2 = instance2.getPriceByProductName("Shirt");
		System.out.println("Product Price: " + price2);
		double totalAmount2 = instance2.getTotalAmount(price2, 1);
		System.out.println("Total Price: " + totalAmount2);
		double finalAmount2 = instance2.getDiscount(totalAmount2);
		System.out.println("Discount Price: " + finalAmount2);

		System.out.println("----------------------");

		Shopping instance3 = new Shopping();
		double price3 = instance3.getPriceByProductName("Shoes");
		System.out.println("Product Price: " + price3);
		double totalAmount3 = instance3.getTotalAmount(price3, 3);
		System.out.println("Total Price: " + totalAmount3);
		double finalAmount3 = instance3.getDiscount(totalAmount3);
		System.out.println("Discount Price: " + finalAmount3);

		System.out.println("----------------------");

		Shopping instance4 = new Shopping();
		double price4 = instance4.getPriceByProductName("Bag");
		System.out.println("Product Price: " + price4);
		double totalAmount4 = instance4.getTotalAmount(price4, 2);
		System.out.println("Total Price: " + totalAmount4);
		double finalAmount4 = instance4.getDiscount(totalAmount4);
		System.out.println("Discount Price: " + finalAmount4);

		System.out.println("----------------------");

		Shopping instance5 = new Shopping();
		double price5 = instance5.getPriceByProductName("Jeans");
		System.out.println("Product Price: " + price5);
		double totalAmount5 = instance5.getTotalAmount(price5, 2);
		System.out.println("Total Price: " + totalAmount5);
		double finalAmount5 = instance5.getDiscount(totalAmount5);
		System.out.println("Discount Price: " + finalAmount5);
	}
}
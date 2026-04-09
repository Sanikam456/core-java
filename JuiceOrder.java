class JuiceOrder
{
	public double getPriceByJuiceName(String juiceName)
	{
		System.out.println("invoking getPriceByJuiceName: " + juiceName);
		double price = 0.0;

		if("Orange Juice"==juiceName)
		{
			price = 120;
		}
		else if("Apple Juice"==juiceName)
		{
			price = 150;
		}
		else if("Mango Juice"==juiceName)
		{
			price = 180;
		}
		else if("Pineapple Juice"==juiceName)
		{
			price = 200;
		}
		else if("Watermelon Juice"==juiceName)
		{
			price = 160;
		}
		else if("Mixed Fruit Juice"==juiceName)
		{
			price = 220;
		}
		else if("Grape Juice"==juiceName)
		{
			price = 170;
		}
		else if("Pomegranate Juice"==juiceName)
		{
			price = 210;
		}
		else if("Strawberry Juice"==juiceName)
		{
			price = 190;
		}
		else if("Banana Shake"==juiceName)
		{
			price = 130;
		}
		else
		{
			price = 0.0;
		}

		System.out.println("end of getPriceByJuiceName");
		return price;
	}

	public double getTotalAmount(double price, int quantity)
	{
		System.out.println("invoking getTotalAmount");

		double total = price * quantity;

		System.out.println("end of getTotalAmount");
		return total;
	}

	public double getDiscount(double total)
	{
		System.out.println("invoking getDiscount");

		double finalAmount = total - (total * 0.05); 

		System.out.println("end of getDiscount");
		return finalAmount;
	}
}
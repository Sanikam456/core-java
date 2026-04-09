class MakeupOrder
{
	public double getPriceByProductName(String productName)
	{
		System.out.println("invoking getPriceByProductName: " + productName);
		double price = 0.0;

		if("Lipstick"==productName)
		{
			price = 500;
		}
		else if("Foundation"==productName)
		{
			price = 1200;
		}
		else if("Eyeliner"==productName)
		{
			price = 350;
		}
		else if("Mascara"==productName)
		{
			price = 600;
		}
		else if("Compact Powder"==productName)
		{
			price = 800;
		}
		else if("Blush"==productName)
		{
			price = 450;
		}
		else if("Highlighter"==productName)
		{
			price = 700;
		}
		else if("Concealer"==productName)
		{
			price = 900;
		}
		else if("Makeup Kit"==productName)
		{
			price = 2500;
		}
		else if("Nail Polish"==productName)
		{
			price = 300;
		}
		else
		{
			price = 0.0;
		}

		System.out.println("end of getPriceByProductName");
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

		double finalAmount = total - (total * 0.10); 

		System.out.println("end of getDiscount");
		return finalAmount;
	}
}
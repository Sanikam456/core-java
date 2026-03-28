class AcerLaptop {
static String brandName="Acer";
public static void getAcerLaptopBrandDetails()
{
	System.out.println("Brand Name:"+brandName);
}

public static void getAcerLaptopDetails(String storage,String modelName,float screenSize,String colour,String cpuModel)
{
	System.out.println("Invoking AcerLaptopDetails:");
	System.out.println("Storage:"+storage);
	System.out.println("Model Name:"+modelName);
	System.out.println("Screen Size:"+screenSize);
	System.out.println("Colour:"+colour);
	System.out.println("CPU Model:"+cpuModel);
}
public static void getAcerLaptopPriceDetails(int price)
{
	System.out.println("Invoking price Details:");
	System.out.println("Price:"+price);
}
}
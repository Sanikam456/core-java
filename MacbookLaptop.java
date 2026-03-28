class MacbookLaptop {
static String brandName="Macbook";
public static void getMacbookLaptopBrandDetails()
{
	System.out.println("Brand Name:"+brandName);
}

public static void getMacbookLaptopDetails(String storage,String modelName,float screenSize,String colour,String cpuModel)
{
	System.out.println("Invoking AcerLaptopDetails:");
	System.out.println("Storage:"+storage);
	System.out.println("Model Name:"+modelName);
	System.out.println("Screen Size:"+screenSize);
	System.out.println("Colour:"+colour);
	System.out.println("CPU Model:"+cpuModel);
}
public static void getMacbookLaptopPriceDetails(int price)
{
	System.out.println("Invoking price Details:");
	System.out.println("Price:"+price);
}
}
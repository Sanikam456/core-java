class LumioVision {
static String brandName="Lumio";
public static void getLumioVisionBrandDetails()
{
	System.out.println("Brand Name:"+brandName);
}
public static void getLumioVisionDetails (int screenSize,String displayTechnology,String resolution,String colour,String refreshRate)
{
	System.out.println("Invoking LumioVisionDetails:");
	System.out.println("Screen Size:"+screenSize);
	System.out.println("Display Technology:"+displayTechnology);
	System.out.println("Resolution:"+resolution);
	System.out.println("Colour:"+colour);
	System.out.println("Refresh Rate:"+refreshRate);
}
public static void getLumioVisionPriceDetails(int price)
{
	System.out.println("Invoking price Details:");
	System.out.println("Price:"+price);
}
}

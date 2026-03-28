class AmazonProduct
{
	static String productNames[]={"Redmi Note 15 5g","Haier washingmachine","Samsung Tv","iphone15","oppo A16k","Dell Loptop"};
	static float productPrice[]={29999.9f,39999.9f,25999.9f,78456.99f,20550.77f ,56999.99f};
    static int productRating[]={50, 90, 75, 95, 67,80}; 
public static void getAmazonProductName()
 {
    for (int index = 0; index < productNames.length; index++)
	{
        System.out.println("Product Name: " + productNames[index]);
        System.out.println("Product Price: " + productPrice[index]);
        System.out.println("Product Rating: " + productRating[index]);
        System.out.println("---"); 
    }
}
}

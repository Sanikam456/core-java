class IceCreamMenuRunner{
       
	 public static void main(String []food){
	 IceCreamMenu polarBear  = new IceCreamMenu();
     polarBear.getIceCreamMenuDeatils();

     IceCreamMenu ibaco = new IceCreamMenu();
     ibaco.checkIceCreamByIceCreamName ("Chocolate");
	 ibaco.checkIceCreamByIceCreamName("Blueberry Cheese");
	 ibaco.checkIceCreamByIceCreamName("Lavender");
	 ibaco.checkIceCreamByIceCreamName("Honeycomb");
	 ibaco.checkIceCreamByIceCreamName("Coffee");
	 } 
}

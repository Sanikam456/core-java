class SmartphonesRunner{
public static void main(String[] agrs){
	Smartphones ref = new Smartphones("vivo","vivoy73","ios",7,7.1,10000.00);
        ref.brand = "Apple";
        ref.modelName = "iPhone 15";
        ref.operatingSystem = "iOS";
        ref.ramGB = 8;
        ref.screenSize = 6.1;
        ref.price = 999.99;
		ref.getSmartphonesData();
 
}
}
class MobilePhonesRunner{
public static void main(String []args){
	 MobilePhones ref = new MobilePhones("vivo","vivoy73",13.0,127,899.99);
        ref.brand = "Apple";
        ref.modelName = "iPhone 13";
        ref.cameraMegapixels = 12.0;
        ref.storageGB = 128;
        ref.price = 799.99;
        ref.getMobilePhonesData();
}
}
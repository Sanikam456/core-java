class BankAccount{
	static String bankName="canara";
	static double balance=50.000;
	//method without returntype without parametar
	public static void getBankAccountDetails(){
		System.out.println("method1");
	}
	//method without returntype with parametar
	public static void getBankAccountDetails1(double balance){
		System.out.println("balance:"+balance);
	}
	//method with returntype without parametar
	public static String getBankAccountDetails2(){
		System.out.println("bankName:"+bankName);
		return bankName;
	}
	// method with returntype with parametar
	
	public static String getBankAccountDetails3(String bankName){
		System.out.println("bankName:"+bankName);
		return bankName;
	}
	
}
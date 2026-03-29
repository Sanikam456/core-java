 class Zomato {
    public static String createAccount(Long mobileNumber, String password, String address, String fullName, String userName) {
        System.out.println("Zomato registration method is started...");
        String registerStatus;

        if (mobileNumber != null && password != null && address != null && fullName != null && userName != null) {
            if (mobileNumber.toString().length() >= 10 && fullName.length() > 2) {
                registerStatus = "Account created! Delicious food is just a click away for " + fullName + ".";
            } else {
                registerStatus = "Zomato Error: Please provide a valid 10-digit mobile number.";
            }
            
        } else {
            registerStatus = "Zomato Error: Delivery address and mobile number are mandatory.";
        }

        System.out.println("Zomato registration method is ended.");
        return registerStatus;
   public static boolean validateRegisterFields(long mobileNumber,String pasw,String fullName,String userName)
{
	System.out.println("validateRegisterFields is started");
	boolean isValidate=false;
	if (mobileNumber!=0)
	{
		isValidate=true;
	}
	if(pasw!=null)
	{
		isValidate=true;
	}
	if(fullName!=null)
	{
		isValidate=true;
	}
	if(userName!=null)
	{
		isValidate=true;
	}
	System.out.println("validateRegisterFields is started");
	return isValidate;
}
}
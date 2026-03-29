class Telegram {
    public static String validateAndRegister(Long mobileNumber, String psw, String birthday, String fullName, String userName) {
        System.out.println("validateAndRegister method is started");
        String registerStatus = null;

        if (mobileNumber != null && psw != null && birthday != null && fullName != null && userName != null) {
            if (psw.length() > 4 && fullName.length() > 4 && userName.length() > 4) {
                registerStatus = "Thank you " + fullName + " Registered successfully";
            } else {
                registerStatus = "pleope check the Lenath Of PSW, FullName, userName";
            }
        } else {
            registerStatus = "Please enter the valide Data ";
        }

        System.out.println("validateAndRegister method is Ended");
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
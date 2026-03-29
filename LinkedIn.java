class LinkedIn {
    public static String validateAndRegister(Long mobileNumber, String psw, String birthday, String fullName, String userName) {
        System.out.println("LinkedIn registration method is started");
        String registerStatus = null;

        if (mobileNumber != null && psw != null && birthday != null && fullName != null && userName != null) {
            if (psw.length() > 6 && fullName.length() > 4 && userName.length() > 4) {
                registerStatus = "Congratulations " + fullName + "! Your professional profile is ready.";
            } else {
                registerStatus = "LinkedIn Error: Password or Username too short.";
            }
        } else {
            registerStatus = "LinkedIn Error: All fields are required.";
        }

        System.out.println("LinkedIn registration method is ended");
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
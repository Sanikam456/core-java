class Instagram{
public static String validateAndRegister (Long mobileNumber, String paw, String birthday, String fullName, String userName){
    System.out.println("validateAndRegister method is started");
    String registerStatus=null;
    if (mobileNumber != null && paw != null && birthday != null && fullName != null && userName != null){ // Null pointer Exception
        if (paw.length()>4 && fullName.length()>4 && userName.length()>4){
            registerStatus ="Thank you "+fullName+" Registered successfully";
        }else{
            registerStatus="pleope check the Lenath Of PSW, FullName, User Name";
        }
    }else{
        registerStatus ="Please enter the valide Data ";
    }
    System.out.println("validateAndRegister method is Ended");
    return registerStatus;
}
class WhatsappRunner{
public static void main(String[] args){
	
    System.out.println("First Line method Call");
    String sanika = Whatsapp.validateAndRegister(9686003998l, "Chandu@123", "04-11-2006", "itsmesanuu", "sanika");
    System.out.println(sanika);
	System.out.println("second Line method Call");
    String likith= Whatsapp.validateAndRegister(9844720065l, "liki@123", "13-02-2006", "likith.xyz_", "likithgowda");
    System.out.println(likith);
	System.out.println("------third time method call------");
    boolean result=Whatsapp.validateRegisterFields(9867643278l,"monisha@1234","monisha","monisha M");
    System.out.println(result);
}
}

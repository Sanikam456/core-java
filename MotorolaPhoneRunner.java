class MotorolaPhoneRunner{
public static void main(String[] args){
	  
	  System.out.println("------first time method call-------");
	  boolean Phonestatus=MotorolaPhone.onORoff();
	  System.out.println("main method Phone status:"+Phonestatus);
	  System.out.println("-------second time method call------");
	  MotorolaPhone.onORoff();
	  System.out.println("-------third time method call--------");
	  MotorolaPhone.onORoff();
	  System.out.println("-------fourth time method call--------");
	  MotorolaPhone.onORoff();
    } 
}
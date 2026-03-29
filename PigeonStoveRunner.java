class  PigeonStoveRunner{
public static void main(String[] args){
	  
	  System.out.println("------first time method call-------");
	  boolean Stove status= PigeonStove.onORoff();
	  System.out.println("main method Stove status:"+Stovestatus);
	  System.out.println("-------second time method call------");
	  PigeonStove.onORoff();
	  System.out.println("-------third time method call--------");
	  PigeonStove.onORoff();
	  System.out.println("-------fourth time method call--------");
	  PigeonStove.onORoff();
    } 
}
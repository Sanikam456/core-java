class ButterflyStoveRunner{
public static void main(String[] args){
	  
	  System.out.println("------first time method call-------");
	  boolean Stove status= ButterflyStove.onORoff();
	  System.out.println("main method Stovestatus:"+Stovestatus);
	  System.out.println("-------second time method call------");
	  ButterflyStove.onORoff();
	  System.out.println("-------third time method call--------");
	  ButterflyStove.onORoff();
	  System.out.println("-------fourth time method call--------");
	  ButterflyStove.onORoff();
    } 
}
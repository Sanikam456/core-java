class ColorbotFanRunner{
public static void main(String[] args){
	  
	  System.out.println("------first time method call-------");
	  boolean Fanstatus=ColorbotFan.onORoff();
	  System.out.println("main method Fan status:"+Fanstatus);
	  System.out.println("-------second time method call------");
	  ColorbotFan.onORoff();
	  System.out.println("-------third time method call--------");
	  ColorbotFan.onORoff();
	  System.out.println("-------fourth time method call--------");
	  ColorbotFan.onORoff();
    } 
}
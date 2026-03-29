class WhirlpoolACRunner{
public static void main(String[] args){
	  
	  System.out.println("------first time method call-------");
	  boolean ACstatus=WhirlpoolAC.onORoff();
	  System.out.println("main method AC status:"+ACstatus);
	  System.out.println("-------second time method call------");
	  WhirlpoolAC.onORoff();
	  System.out.println("-------third time method call--------");
	  WhirlpoolAC.onORoff();
	  System.out.println("-------fourth time method call--------");
	  WhirlpoolAC.onORoff();
    } 
}
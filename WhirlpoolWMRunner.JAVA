class WhirlpoolWMRunner{
public static void main(String[] args){
	  
	  System.out.println("------first time method call-------");
	  boolean WCstatus=WhirlpoolWM.onORoff();
	  System.out.println("main method WM status:"+WCstatus);
	  System.out.println("-------second time method call------");
	  WhirlpoolWM.onORoff();
	  System.out.println("-------third time method call--------");
	  WhirlpoolWM.onORoff();
	  System.out.println("-------fourth time method call--------");
	  WhirlpoolWM.onORoff();
    } 
}
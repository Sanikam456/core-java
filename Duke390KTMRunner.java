class Duke390KTMRunner{
public static void main(String[] args){
	  
	  System.out.println("------first time method call-------");
	  boolean KTMstatus=Duke390KTM.onORoff();
	  System.out.println("main method KTM status:"+KTMstatus);
	  System.out.println("-------second time method call------");
	  Duke390KTM.onORoff();
	  System.out.println("-------third time method call--------");
	  Duke390KTM.onORoff();
	  System.out.println("-------fourth time method call--------");
	  Duke390KTM.onORoff();
    } 
}
class FortunerCarRunner{
public static void main(String[] args){
	  
	  System.out.println("------first time method call-------");
	  boolean Carstatus=FortunerCar.onORoff();
	  System.out.println("main method Car status:"+Carstatus);
	  System.out.println("-------second time method call------");
	  FortunerCar.onORoff();
	  System.out.println("-------third time method call--------");
	  FortunerCar.onORoff();
	  System.out.println("-------fourth time method call--------");
	  FortunerCar.onORoff();
    } 
}
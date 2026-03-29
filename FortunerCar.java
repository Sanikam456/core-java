class FortunerCar{
    
	static boolean isSwitch;
	static int maxTemperature=5;
	static int minTemperature=0;
	static int CurrentTemperature=4;
	
	public static boolean onORoff(){
		
		System.out.println("onORoff method started");
				
		   if(isSwitch==false){;
		   isSwitch=true;
		   System.out.println("Car is on:"+isSwitch);
	        }
			else{
			isSwitch=false;
			System.out.println("Car state is off:"+isSwitch);
		    }
		    System.out.println("onORoff method ended");
		
		    return isSwitch;
	}
	    
}
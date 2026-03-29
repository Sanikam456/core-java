class PrestigeMixerRunner{
public static void main(String[] args){
	  
	  System.out.println("------first time method call-------");
	  boolean Mixerstatus=PrestigeMixer.onORoff();
	  System.out.println("main method Mixer status:"+Mixerstatus);
	  System.out.println("-------second time method call------");
	  PrestigeMixer.onORoff();
	  System.out.println("-------third time method call--------");
	  PrestigeMixer.onORoff();
	  System.out.println("-------fourth time method call--------");
	  PrestigeMixer.onORoff();PrestigeMixer
    } 
}
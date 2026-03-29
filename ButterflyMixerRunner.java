class ButterflyMixerRunner{
public static void main(String[] args){
	  
	  System.out.println("------first time method call-------");
	  boolean Mixerstatus=ButterflyMixer.onORoff();
	  System.out.println("main method Mixer status:"+Mixerstatus);
	  System.out.println("-------second time method call------");
	  ButterflyMixer.onORoff();
	  System.out.println("-------third time method call--------");
	  ButterflyMixer.onORoff();
	  System.out.println("-------fourth time method call--------");
	  ButterflyMixer.onORoff();
    } 
}
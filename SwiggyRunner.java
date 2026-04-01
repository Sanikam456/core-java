class SwiggyRunner{
  public static void main(String []search){
	  
    Swiggy iggy =new Swiggy();
   
   boolean login=iggy.login("Sanika M","Sanu@123");
   System.out.println(login);
   
   
   String login1=iggy.login("Sanika7@gmail.com","Sanu@123","abc");
   System.out.println(login1);
   
   String msg=iggy.search("Mutton Biryani ");
   System.out.println(msg);
  
   String msg1=iggy.search("Mutton Biryani ","sanu");
   System.out.println(msg1);
   
   String msg2=iggy.search("Mutton Biryani ","sanu","Amaravathi");
   System.out.println(msg2);
   
   String msg3=iggy.search("Mutton Biryani ","sanu","Amaravathi","02-04-2026");
   System.out.println(msg3);
   
   String msg4=iggy.search("Mutton Biryani ","sanu","Amaravathi","02-04-2026","Mandya");
   System.out.println(msg4);
   }
}
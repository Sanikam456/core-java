class FlipkartRunner{
  public static void main(String []search){
	  
   Flipkart kart=new Flipkart();
   
   boolean login=kart.login("Sanika M","Sanu@123");
   System.out.println(login);
   
   
   String login1=kart.login("Sanika7@gmail.com","Sanu@123","abc");
   System.out.println(login);
   
   String msg=kart.search("Samsung Smart LED TV");
   System.out.println(msg);
  
   String msg1=kart.search("Samsung Smart LED TV","Samsung");
   System.out.println(msg);
   
   String msg2=kart.search("Samsung Smart LED TV","Samsung","Youtube");
   System.out.println(msg);
   
   String msg3=kart.search("Samsung Smart LED TV","Samsung","Youtube","Black");
   System.out.println(msg);
   
   String msg4=kart.search("Samsung Smart LED TV","Samsung","Youtube","Black","1 year");
   System.out.println(msg);
   }
}
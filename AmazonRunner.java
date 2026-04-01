class AmazonRunner{
  public static void main(String []search){
	  
    Amazon zon =new Amazon();
   
   boolean login=zon.login("Sanika M","Sanu@123");
   System.out.println(login);
   
   
   String login1=zon.login("Sanika7@gmail.com","Sanu@123","abc");
   System.out.println(login1);
   
   String msg=zon.search("iPhone 17 Pro Max");
   System.out.println(msg);
  
   String msg1=zon.search("iPhone 17 Pro Max","Apple");
   System.out.println(msg1);
   
   String msg2=zon.search("iPhone 17 Pro Max","Apple","ios");
   System.out.println(msg2);
   
   String msg3=zon.search("iPhone 17 Pro Max","Apple","ios","orange");
   System.out.println(msg3);
   
   String msg4=zon.search("iPhone 17 Pro Max","Apple","ios","orange","2 TB");
   System.out.println(msg4);
   }
}
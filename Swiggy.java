class Swiggy{
	public boolean login(String userName,String psw){
		System.out.println("Invoking login using User name "+userName+" and psw:"+psw);
        String regUserName="Sanika M";
        String regPsw="Sanu@123";
        boolean isLogin=false;
		
        if(userName == regUserName && psw==regPsw){
		    isLogin=true;
        }else{
            isLogin=false;
		}
        return isLogin;	
	}
    public String login(String email,String psw,String captcha){
		System.out.println("Invoking login using email Id "+email+" and psw:"+psw);
		String regEmail="Sanika7@gmail.com";
		String regPsw="Sanu@123";
		String isLogin=null;
		
		if(email == regEmail && regPsw == psw){
			isLogin="Login Succesfully";
		}else{
			isLogin="Login Failed";
		}
		return isLogin;
  		
	}		
	public String search (String foodName){
		System.out.println("Invoking search By Food Name :"+foodName);
		String message=null;
		
		if(foodName!=null){
			message="searching food Name is Available :"+foodName;
		}
		return message;
	}
	public String search (String foodName,String customerName){
		System.out.println("Invoking search By Food Name :"+foodName+" Customer Name :"+customerName);
		String message=null;
		if(foodName!=null && customerName !=null){
			message="searching food Name is Available :"+foodName+" and :Customer Name"+customerName;
		}
		return message;
	}
	public String search (String foodName,String customerName,String hotelName){
		System.out.println("Invoking search By Food Name :"+foodName+" Customer Name  :"+customerName+" Hotel Name :"+hotelName);
		String message=null;
		if(foodName!=null && customerName!=null && hotelName!=null){
			message="searching food Name is Available :"+foodName+" and Customer Name:"+customerName+" Hotel Name :"+hotelName;
		}
		return message;
	}
	public String search (String foodName,String customerName,String hotelName,String deliveryDate){
		System.out.println("Invoking search By Food Name :"+foodName+" Customer Name  :"+customerName+" Hotel Name :"+hotelName+" Delivery Date:"+deliveryDate);
		String message=null;
		if(foodName!=null && customerName!=null && hotelName!=null&& deliveryDate!=null){
			message="searching food Name is Available :"+foodName+" and Customer Name:"+customerName+" Hotel Name :"+hotelName+" Delivery Date:"+deliveryDate;
		}
		return message;
	}
	public String search (String foodName,String customerName,String hotelName,String deliveryDate,String deliveryPlace ){
		System.out.println("Invoking search By Food Name :"+foodName+" Customer Name  :"+customerName+" Hotel Name :"+hotelName+" Delivery Date:"+deliveryDate+" Delivery Place:"+deliveryPlace );
		String message=null;
		if(foodName!=null && customerName!=null && hotelName!=null&& deliveryDate!=null&& deliveryPlace!= null){
			message="searching food Name is Available :"+foodName+" and Customer Name:"+customerName+" Hotel Name :"+hotelName+" Delivery Date:"+deliveryDate+" Delivery Place:"+deliveryPlace ;
		}
		return message;
	}
	
	
	
}

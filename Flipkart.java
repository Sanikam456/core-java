class Flipkart{
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
	public String search (String productName){
		System.out.println("Invoking search By Product Name :"+productName);
		String message=null;
		
		if(productName!=null){
			message="searching Product Name is Available :"+productName;
		}
		return message;
	}
	public String search (String productName,String productBrand){
		System.out.println("Invoking search By Product Name :"+productName+" Product Brand  :"+productBrand);
		String message=null;
		if(productName!=null && productBrand !=null){
			message="searching Product Name is Available :"+productName+" and Product Brand:"+productBrand;
		}
		return message;
	}
	public String search (String productName,String productBrand,String services){
		System.out.println("Invoking search By Product Name :"+productName+" Product Brand  :"+productBrand+" Services:"+services);
		String message=null;
		if(productName!=null && productBrand !=null && services!=null){
			message="searching Product Name is Available :"+productName+" and Product Brand:"+productBrand+"Services:"+services;
		}
		return message;
	}
	public String search (String productName,String productBrand,String services,String color){
		System.out.println("Invoking search By Product Name :"+productName+" Product Brand  :"+productBrand+" Services:"+services+" Color:"+color);
		String message=null;
		if(productName!=null && productBrand !=null && services!=null&& color!=null){
			message="searching Product Name is Available :"+productName+" and Product Brand:"+productBrand+"Services:"+services+" Color:"+color;
		}
		return message;
	}
	public String search (String productName,String productBrand,String services,String color,String Warranty){
		System.out.println("Invoking search By Product Name :"+productName+" Product Brand  :"+productBrand+" Services:"+services+" Color:"+color+" warranty:"+Warranty );
		String message=null;
		if(productName!=null && productBrand !=null && services!=null&& color!=null&& Warranty!=null){
			message="searching Product Name is Available :"+productName+" and Product Brand:"+productBrand+" Services:"+services+" Color:"+color+" warranty:"+Warranty;
		}
		return message;
	}
}

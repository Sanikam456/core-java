class Amazon{
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
	public String search (String productName,String productBrand,String operatingSystem){
		System.out.println("Invoking search By Product Name :"+productName+" Product Brand  :"+productBrand+" Operating System :"+operatingSystem);
		String message=null;
		if(productName!=null && productBrand !=null && operatingSystem!=null){
			message="searching Product Name is Available :"+productName+" and Product Brand:"+productBrand+" Operating System:"+operatingSystem;
		}
		return message;
	}
	public String search (String productName,String productBrand,String operatingSystem ,String color){
		System.out.println("Invoking search By Product Name :"+productName+" Product Brand  :"+productBrand+" Operating System:"+operatingSystem+" Color:"+color);
		String message=null;
		if(productName!=null && productBrand !=null && operatingSystem!=null&& color!=null){
			message="searching Product Name is Available :"+productName+" and Product Brand:"+productBrand+" Operating System:"+operatingSystem+" Color:"+color;
		}
		return message;
	}
	public String search (String productName,String productBrand,String operatingSystem,String color,String memoryStorageCapacity){
		System.out.println("Invoking search By Product Name :"+productName+" Product Brand  :"+productBrand+" Operating System:"+operatingSystem+" Color:"+color+" memoryStorageCapacity:"+memoryStorageCapacity);
		String message=null;
		if(productName!=null && productBrand !=null && operatingSystem!=null&& color!=null&& memoryStorageCapacity!=null){
			message="searching Product Name is Available :"+productName+" and Product Brand:"+productBrand+" Operating System:"+operatingSystem+" Color:"+color+" memoryStorageCapacity:"+memoryStorageCapacity;
		}
		return message;
	}
}

class Patient{
     static String hospitalName = "Mandya General Hospital";
     String name;           
     int patientID;         
     int age;               
     double temperature;    
     long contactNumber; 
	 
    public 	Patient(){
    }	

    public Patient(String name, int patientID, int age,double temperature,long contactNumber) {
        this.name = name;
        this.patientID = patientID;
        this.age = age;
        this.temperature = temperature;   
        this.contactNumber = contactNumber;  
    }
	public void getPatientDetails(){
		System.out.println("Hospital Name:"+hospitalName);
		System.out.println("Name:"+name);
		System.out.println("patient ID:"+patientID);
		System.out.println("Age:"+age);
		System.out.println("Temperature:"+temperature);
		System.out.println("Contact Number:"+contactNumber);
	}
}
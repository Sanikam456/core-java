class Flights {
    String flightNumber;
    String airline;
    String departureCity;
    String arrivalCity;
    int durationMinutes;
    double ticketPrice;
    public Flight(String flightNumber,String airline,String departureCity,String arrivalCity,int durationMinutes,double ticketPrice) 
	{
        System.out.println("I am the Flight constructor with parameter:"+flightNumber+","+airline+","+departureCity+","+arrivalCity+","+durationMinutes+","+ticketPrice);
    }

    
    public void getFlightData() {
        System.out.println("--- Flight Information ---");
        System.out.println("Flight No: " + flightNumber);
        System.out.println("Airline: " + airline);
        System.out.println("From: " + departureCity);
        System.out.println("To: " + arrivalCity);
        System.out.println("Duration: " + durationMinutes);
        System.out.println("Price: $" + ticketPrice);
        
    }
}
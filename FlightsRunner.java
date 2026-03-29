class FlightsRunner{
public static void main(String []agrs)
{
	Flights ref = new Flights("BA215","British Airways","London","Tokyo",840,1200.50);

        // 2. Assign values to the flight's attributes
        ref.flightNumber = "XY789";
        ref.airline = "SkyHigh Airways";
        ref.departureCity = "New York";
        ref.arrivalCity = "Paris";
        ref.durationMinutes = 450;
        ref.ticketPrice = 850.00;
        ref.getFlightsData();
}
}
 class Hotel {

    String hotelName;
    String location;
    int numberOfRooms;
    int numberOfGuests;
    String managerName;
    double roomRent;
    String hotelType;
    int establishedYear;

    static String country = "India";
    static String serviceType = "Hospitality";

    // Methods
    public String checkIn(String guestName) {
        System.out.println("Guest Checked In: " + guestName);
        return guestName;
    }

    public int addRooms(int count) {
        numberOfRooms += count;
        System.out.println("Total Rooms: " + numberOfRooms);
        return numberOfRooms;
    }

    public String assignRoom(String roomType) {
        System.out.println("Room Assigned: " + roomType);
        return roomType;
    }

    public double collectPayment(double amount) {
        System.out.println("Payment Collected: " + amount);
        return amount;
    }

    public boolean enableWifi(boolean status) {
        System.out.println("WiFi Available: " + status);
        return status;
    }

    public boolean serveFood(boolean status) {
        System.out.println("Food Service: " + status);
        return status;
    }

    public String announceOffer(String offer) {
        System.out.println("Offer Announced: " + offer);
        return offer;
    }

    public int checkoutGuests(int count) {
        numberOfGuests -= count;
        System.out.println("Remaining Guests: " + numberOfGuests);
        return numberOfGuests;
    }

    public String organizeEvent(String eventName) {
        System.out.println("Event Organized: " + eventName);
        return eventName;
    }

    public boolean maintainCleanliness(boolean status) {
        System.out.println("Cleanliness Maintained: " + status);
        return status;
    }
}
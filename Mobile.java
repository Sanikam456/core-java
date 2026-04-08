 class Mobile {
    String brand;
    String model;
    String color;
    String os;
    int storage;           
    int ram;               
    int battery;           
    int camera;            
    double price;
    boolean is5G;
    static String category = "Electronics";
    static String country = "India";

    public String makeCall(String number) {
        System.out.println("Calling: " + number);
        return number;
    }

    public String sendMessage(String number) {
        System.out.println("Message sent to: " + number);
        return number;
    }

    public void chargeBattery(int percentage) {
        System.out.println("Charged battery by " + percentage + "%");
    }

    public boolean enableWifi(boolean status) {
        System.out.println("WiFi Enabled: " + status);
        return status;
    }

    public boolean enableBluetooth(boolean status) {
        System.out.println("Bluetooth Enabled: " + status);
        return status;
    }

    public String takePhoto(String photoName) {
        System.out.println("Photo Taken: " + photoName);
        return photoName;
    }

    public void installApp(String appName) {
        System.out.println("App Installed: " + appName);
    }

    public void uninstallApp(String appName) {
        System.out.println("App Uninstalled: " + appName);
    }

    public double buyMobile(double amount) {
        System.out.println("Mobile Purchased for: " + amount);
        return amount;
    }

    public boolean enableHotspot(boolean status) {
        System.out.println("Hotspot Enabled: " + status);
        return status;
    }
}
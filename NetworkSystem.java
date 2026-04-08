class NetworkSystem {

    String networkName;
    String protocol;
    String provider;
    int devices;
    double bandwidth;
    String topology;
    boolean isSecure;
    boolean hasFirewall;
    int setupYear;
    String type;

    static String company = "NetTech";
    static String category = "Networking";

    public String connectDevice(String device) {
        System.out.println("Device Connected: " + device);
        return device;
    }

    public String disconnectDevice(String device) {
        System.out.println("Device Disconnected: " + device);
        return device;
    }

    public double measureSpeed(double speed) {
        System.out.println("Speed: " + speed);
        return speed;
    }

    public boolean enableFirewall(boolean status) {
        System.out.println("Firewall Enabled: " + status);
        return status;
    }

    public boolean secureNetwork(boolean status) {
        System.out.println("Network Secure: " + status);
        return status;
    }

    public int totalDevices(int count) {
        System.out.println("Devices: " + count);
        return count;
    }

    public String configure(String config) {
        System.out.println("Configured: " + config);
        return config;
    }

    public String monitor(String system) {
        System.out.println("Monitoring: " + system);
        return system;
    }

    public boolean start(boolean status) {
        System.out.println("Network Started: " + status);
        return status;
    }

    public boolean stop(boolean status) {
        System.out.println("Network Stopped: " + status);
        return status;
    }
}
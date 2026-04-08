class ServerSystem {

    String serverName;
    String os;
    String provider;
    int users;
    double storage;
    String location;
    boolean isActive;
    boolean hasBackup;
    int launchYear;
    String type;

    static String company = "ServerTech";
    static String category = "Server";

    public String startServer(String server) {
        System.out.println("Server Started: " + server);
        return server;
    }

    public String stopServer(String server) {
        System.out.println("Server Stopped: " + server);
        return server;
    }

    public double allocateStorage(double size) {
        System.out.println("Storage Allocated: " + size);
        return size;
    }

    public boolean backup(boolean status) {
        System.out.println("Backup: " + status);
        return status;
    }

    public boolean restore(boolean status) {
        System.out.println("Restore: " + status);
        return status;
    }

    public int totalUsers(int count) {
        System.out.println("Users: " + count);
        return count;
    }

    public String deployApp(String app) {
        System.out.println("App Deployed: " + app);
        return app;
    }

    public String monitor(String system) {
        System.out.println("Monitoring: " + system);
        return system;
    }

    public boolean secure(boolean status) {
        System.out.println("Secure: " + status);
        return status;
    }

    public String update(String version) {
        System.out.println("Updated: " + version);
        return version;
    }
}
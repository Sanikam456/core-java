class Weathers {
    String cityName;
    double temperatureCelsius;
    int humidityPercentage;
    String condition;
    double windSpeedKmh;

    public Weathers( String cityName,double temperatureCelsius,int humidityPercentage,String condition,double windSpeedKmh) {
        System.out.println("I am the Weather constructor with parameter:"+cityName+","+temperatureCelsius+","+humidityPercentage+","+condition+","+windSpeedKmh);
    }

    public void getWeathersData() {
        System.out.println("--- Current Weather Report ---");
        System.out.println("City: " + cityName);
        System.out.println("Temperature: " + temperatureCelsius );
        System.out.println("Humidity: " + humidityPercentage );
        System.out.println("Condition: " + condition);
        System.out.println("Wind Speed: " + windSpeedKmh );
       
    }
}
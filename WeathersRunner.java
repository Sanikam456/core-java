class WeathersRunner{
public static void main(String[]args)
{
	   Weathers ref = new Weathers("New York",12.0,65,"cloudy",12.4);
        ref.cityName = "San Francisco";
        ref.temperatureCelsius = 18.5;
        ref.humidityPercentage = 72;
        ref.condition = "Foggy";
        ref.windSpeedKmh = 12.4;

        ref.getWeathersData();
    }
}
}
}
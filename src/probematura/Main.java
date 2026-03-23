package probematura;

public class Main {
	public static void main(String[] args) {

        WeatherStation station = new WeatherStation();

        Observer mobile = new MobileApp();
        Observer mobile2 = new MobileApp();

        station.addObserver(mobile);
        station.addObserver(mobile2);

        station.setMeasurements(22.5f, 60f); 
    }

}

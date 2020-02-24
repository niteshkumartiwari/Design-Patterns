package ObserverPattern;

import java.util.Scanner;

class ObserverPattern {
    public static void main(String args[]) {
        WeatherStation station = new WeatherStation();
        ComputerObserver computer = new ComputerObserver(station);
        PhoneObserver phone = new PhoneObserver(station);
        station.addObservers(computer);
        station.addObservers(phone);
        while (true) {
            Scanner reader = new Scanner(System.in);
            station.setTemperature(reader.nextInt());
        }
    }
}

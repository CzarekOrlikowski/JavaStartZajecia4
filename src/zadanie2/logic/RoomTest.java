package zadanie2.logic;

import zadanie2.data.Room;

import javax.swing.*;

public class RoomTest {
    public static void main(String[] args) {

        Room room1 = new Room();
        room1.setArea(30.0);
        room1.setTemperature(28.0);
        room1.setAirCondition(true);

        System.out.println("Powierzchnia pokoju [m2]: " + room1.getArea());
        System.out.println("Aktualna temperatura [oC]: " + room1.getTemperature());
        System.out.println("Wyposażenie w klimatyzację: " + room1.getIsAirCondition());
        System.out.println();

        if (room1.setDownTemperature(26)) {
            System.out.println("Obniżona temperatura [oC]: " + room1.getTemperature());
        }

        else {
            System.out.println("Temperatura bez zmian");
        }

        if (room1.setDownTemperature(27)) {
            System.out.println("Obniżona temperatura [oC]: " + room1.getTemperature());
        }

        else {
            System.out.println("Temperatura bez zmian");
        }

    }
}

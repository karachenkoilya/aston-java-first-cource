package ru.karachenkoilya.tasks.task02.task02_01;

public class Solution {
    public static void main(String[] args) {
        Sedan sedan = new Sedan(4, 450, FuelTypes.gasoline, LuxuryLevels.Medium);

        sedan.start();
        sedan.stop();
        System.out.println("Fuel type of sedan - " + sedan.getFuelType());
        System.out.println("Luxury level of sedan - " + sedan.getLuxuryLevel());
        System.out.println("Trunk capacity of sedan = " + sedan.getTrunkCapacity() + "L");

        Truck truck = new Truck(2, 2000, FuelTypes.diesel, 1500);

        System.out.println("Max load capacity of truck = " + truck.getMaxLoadCapacity() + "kg");
    }
}

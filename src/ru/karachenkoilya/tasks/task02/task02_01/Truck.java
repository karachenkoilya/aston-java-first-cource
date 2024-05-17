package ru.karachenkoilya.tasks.task02.task02_01;

public class Truck extends Car{
    private final int numberOfDoors;
    private final int trunkCapacity;
    private final FuelTypes fuelType;
    private final int maxLoadCapacity;

    public Truck(int numberOfDoors, int trunkCapacity, FuelTypes fuelType, int maxLoadCapacity) {
        this.numberOfDoors = numberOfDoors;
        this.trunkCapacity = trunkCapacity;
        this.fuelType = fuelType;
        this.maxLoadCapacity = maxLoadCapacity;
    }

    @Override
    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    @Override
    public int getTrunkCapacity() {
        return trunkCapacity;
    }

    @Override
    public void start() {
        System.out.println("Truck started");

    }

    @Override
    public void stop() {
        System.out.println("Truck stopped");
    }

    @Override
    public String getFuelType() {
        return fuelType.toString();
    }

    public int getMaxLoadCapacity() {
        return maxLoadCapacity;
    }
}

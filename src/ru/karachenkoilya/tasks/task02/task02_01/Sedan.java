package ru.karachenkoilya.tasks.task02.task02_01;

public class Sedan extends Car{
    private final int numberOfDoors;
    private final int trunkCapacity;
    private final LuxuryLevels luxuryLevel;
    private final FuelTypes fuelType;

    public Sedan(int numberOfDoors, int trunkCapacity, FuelTypes fuelType, LuxuryLevels luxuryLevel) {
        this.numberOfDoors = numberOfDoors;
        this.trunkCapacity = trunkCapacity;
        this.luxuryLevel = luxuryLevel;
        this.fuelType = fuelType;

    }

    @Override
    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    @Override
    public int getTrunkCapacity() {
        return trunkCapacity;
    }

    public String getLuxuryLevel() {
        return luxuryLevel.toString();
    }

    @Override
    public void start() {
        System.out.println("Sedan started");
    }

    @Override
    public void stop() {
        System.out.println("Sedan stopped");
    }

    @Override
    public String getFuelType() {
        return fuelType.toString();
    }
}

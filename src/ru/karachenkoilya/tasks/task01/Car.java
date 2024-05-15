package ru.karachenkoilya.tasks.task01;

public class Car {

    /*По сути это статический блок инициализации,
    так как статические переменные и методы автоматически инициализируются при загрузке класса*/
    /**
     * Количество созданных экземпляров класса Car
     */
    public static int quantity = 0;

    //Но можно еще так:
    static {
        System.out.printf("Класс %s инициализирован, количество экземпляров - %d\n",
                Car.class.getSimpleName(), quantity);
    }

    //нестатический блок инициализации
    {
        quantity++;
        System.out.printf("Создан экземляр класса %s, теперь количество экземпляров - %d\n",
                Car.class.getSimpleName(), quantity);
    }

    /**
     * Модель автомобиля
     */
    private String model; //Это поле задаётся во всех конструкторах,
    // поэтому null как начальное значение нигде не помешает.
    /**
     * Мощность двигателя. -1 при неизвестной мощности
     */
    private int power = -1;
    /**
     * Тип привода
     */
    private DriveWheels driveWheels = DriveWheels.UNKNOWN;

    public Car(String model) {
        this.model = model;
    }

    public Car(String model, int power) {
        this.model = model;
        this.power = power;
    }


    public Car(String model, int power, DriveWheels driveWheels) {
        this.model = model;
        this.power = power;
        this.driveWheels = driveWheels;
    }

    //сеттеры и геттеры

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public DriveWheels getDriveWheels() {
        return driveWheels;
    }

    public void setDriveWheels(DriveWheels driveWheels) {
        this.driveWheels = driveWheels;
    }
}

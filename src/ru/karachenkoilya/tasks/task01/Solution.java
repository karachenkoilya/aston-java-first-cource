package ru.karachenkoilya.tasks.task01;

public class Solution {
    public static void main(String[] args) {
        //Создал экземпляр класса Car, используя конструктор со всеми полями
        Car fordFocus = new Car("Ford Focus", 145, DriveWheels.FRONT_WHEEL_DRIVE);

        //Создал экземпляр класса Car, используя конструктор только с названием модели
        Car volvoXC60 = new Car("Volvo XC60");

        //Изменил некоторые поля с помощью сеттеров
        volvoXC60.setDriveWheels(DriveWheels.ALL_WHEEL_DRIVE);
        volvoXC60.setPower(260);
        fordFocus.setPower(125);

        //Вывел все характеристики
        fordFocus.printInfo();

        //Вывел некоторые характеристики
        volvoXC60.printInfo(2);
    }
}

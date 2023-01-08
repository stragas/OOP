package OOPhw4.transport;

import OOPhw4.drivers.DriverD;

public class Bus extends Transport<DriverD> {


    public Bus(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }



    @Override
    public void startMovement() {
        System.out.println(getBrand() + " " + getModel() + " начал движение");
    }
    @Override
    public void endMovement() {
        System.out.println(getBrand() + " " + getModel() + " закончил движение");
    }


    @Override
    public void pitStop() {
        System.out.println(getBrand() + " " + getModel() + " пробыл на пит-стопе 14 секунд");
    }

    @Override
    public void bestLapTime() {
        System.out.println("Лучшее время круга у " + getBrand() + " " + getModel() + " - 4 минуты 13 секунд");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость " + getBrand() + " " + getModel() + " - 110 км/ч");
    }
    @Override
    public void info() {
        System.out.println("Водитель " + getDriverCar().getFullName() +
                " управляет автомобилем " + getBrand() + " " + getModel() +
                " и будет участовать в заезде");
    }






    @Override
    public String toString() {
        return brand + " " +
                model + ", " +
                engineVolume + " л.";

    }


}




package OOPhw4.transport;

import OOPhw4.drivers.DriverB;

public class PassengerCar<B extends DriverB> extends Transport {

    private B driverB;

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
        System.out.println(getBrand() + " " + getModel() + " пробыл на пит-стопе 5 секунд");
    }

    @Override
    public void bestLapTime() {
        System.out.println("Лучшее время круга у " + getBrand() + " " + getModel() + " - 2 минуты 7 секунд");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость " + getBrand() + " " + getModel() + " - 180 км/ч");
    }

    @Override
    public void info() {
        System.out.println("Водитель " + getDriverB().getFullName() +
                " управляет автомобилем " + getBrand() + " " + getModel() +
                " и будет участовать в заезде");
    }

    public PassengerCar(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    public B getDriverB() { return driverB; }

    public void setDriverB(B driverB) { this.driverB = driverB; }

    @Override
    public String toString() {
        return brand + " " +
                model + ", " +
                engineVolume + " л.";

    }


}

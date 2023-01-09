package OOPhw4.transport;

import OOPhw4.drivers.DriverC;
import OOPhw4.ENUM.TonnageOfTruck;

public class Truck  extends Transport<DriverC>  {
    private TonnageOfTruck tonnageOfTruck;


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
        System.out.println(getBrand() + " " + getModel() + " пробыл на пит-стопе 4 секунды");
    }

    @Override
    public void bestLapTime() {
        System.out.println("Лучшее время круга у " + getBrand() + " " + getModel() + " - 3 минуты 59 секунд");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость " + getBrand() + " " + getModel() + " - 145 км/ч");
    }

    @Override
    public void info() {
        System.out.println("Водитель " + getDriverCar().getFullName() +
                " управляет автомобилем " + getBrand() + " " + getModel() +
                " и будет участовать в заезде");
    }

    public Truck(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    public TonnageOfTruck getTonnageOfTruck() {
        return tonnageOfTruck;
    }

    public void setTonnageOfTruck(TonnageOfTruck tonnageOfTruck) {
        this.tonnageOfTruck = tonnageOfTruck;
    }

    @Override
    public String toString() {
        return brand + " " +
                model + ", " +
                engineVolume + " л.";

    }


}

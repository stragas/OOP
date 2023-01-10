package OOPhw4.transport;

import OOPhw4.drivers.DriverC;
import OOPhw4.drivers.DriverD;
import OOPhw4.ENUM.CapacityOfBus;
public class Bus extends Transport<DriverD> {

    private DriverD driverD;
    public DriverD getDriverC() { return driverD; }
    public DriverD getDriverD() { return driverD; }

    public void setDriverD(DriverD driverD) { this.driverD = driverD; }
    public Bus(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    private CapacityOfBus capacityOfBus;

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

    public CapacityOfBus getCapacityOfBus() {
        return capacityOfBus;
    }

    public void setCapacityOfBus(CapacityOfBus capacityOfBus) {
        this.capacityOfBus = capacityOfBus;
    }
    @Override
    public void printType() {
        if(capacityOfBus == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println(capacityOfBus);
        }
    }



    @Override
    public String toString() {
        return brand + " " +
                model + ", " +
                engineVolume + " л.";

    }


}




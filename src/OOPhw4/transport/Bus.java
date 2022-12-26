package OOPhw4.transport;

 // package transport;

import OOPhw4.drivers.DriverD;

public class Bus<D extends DriverD> extends Transport {

    private D driverD;

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
        System.out.println("Водитель " + getDriverD().getFullName() +
                " управляет автомобилем " + getBrand() + " " + getModel() +
                " и будет участовать в заезде");
    }


    public Bus(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    public D getDriverD() { return driverD; }

    public void setDriverD(D driverD) { this.driverD = driverD; }

    @Override
    public String toString() {
        return brand + " " +
                model + ", " +
                engineVolume + " л.";

    }


}



//                releaseYear + " год выпуска, страна сборки - " +
//                country + ", " +
//                colour +  " цвет, макс. скорость - " +
//                maxSpeed + " км/ч";
//    }
//}

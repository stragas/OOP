package OOPhw4;

import OOPhw4.drivers.DriverB;
import OOPhw4.drivers.DriverC;
import OOPhw4.drivers.DriverD;
import OOPhw4.transport.PassengerCar;
import OOPhw4.transport.Transport;
import OOPhw4.transport.Truck;
import OOPhw4.transport.Bus;
import OOPhw4.ENUM.CapacityOfBus;
import OOPhw4.ENUM.TonnageOfTruck;
import OOPhw4.ENUM.BodyTypeOfCar;
public class Main {
    public static void main(String[] args) {

        PassengerCar bmw = new PassengerCar("BMW", "X6", 2.9);
        PassengerCar audi = new PassengerCar("Audi", "Q5", 3.2);
        PassengerCar hyundai = new PassengerCar("Hyundai", "Sonata", 1.6);
        PassengerCar honda = new PassengerCar("Honda", "Civic", 1.5);

        Truck man = new Truck("MAN", "TGS 6x6", 6.5);
        Truck foton = new Truck("Foton", "Auman", 6.4);
        Truck kamaz = new Truck("Камаз", "65801", 5.9);
        Truck faw = new Truck("FAW", "J5", 5.5);


        Bus volvo = new Bus("Volvo", "FL7", 4.2);
        Bus liaz = new Bus("ЛиАЗ", "5256", 2.5);

        Bus paz = new Bus("ПАЗ", "\"Вектор Next\"", 3.2);
        Bus scania = new Bus("Scania", "Irizar i6", 3.5);

        System.out.println(bmw);
        System.out.println(foton);
        System.out.println(paz);

        man.startMovement();
        scania.endMovement();

        audi.pitStop();
        kamaz.bestLapTime();
        volvo.maxSpeed();

        DriverB oleg = new DriverB("Семенов Олег Игоревич", true, 7);
        DriverC igor = new DriverC("Петров Игорь Михайлович", true, 12);
        DriverD leha = new DriverD("Крутов Алексей Дмитриевич", false, 14);

        System.out.println(oleg);




        bmw.info();
        faw.info();
        liaz.info();

        hyundai.setBodyTypeOfCar(BodyTypeOfCar.MINIVAN);
        kamaz.setTonnageOfTruck(TonnageOfTruck.N2);
        paz.setCapacityOfBus(CapacityOfBus.MEDIUM);

        hyundai.printType();
        kamaz.printType();
        paz.printType();

    }
}

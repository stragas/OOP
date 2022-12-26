package OOPhw4;

import OOPhw4.drivers.DriverB;
import OOPhw4.drivers.DriverC;
import OOPhw4.drivers.DriverD;
import OOPhw4.transport.PassengerCar;
import OOPhw4.transport.Transport;
import OOPhw4.transport.Truck;
import OOPhw4.transport.Bus;

public class Main {
    public static void main(String[] args) {

        PassengerCar<DriverB> bmw = new PassengerCar<DriverB>("BMW", "X6", 2.9);
        PassengerCar<DriverB> audi = new PassengerCar<DriverB>("Audi", "Q5", 3.2);
        PassengerCar<DriverB> hyundai = new PassengerCar<DriverB>("Hyundai", "Sonata", 1.6);
        PassengerCar<DriverB> honda = new PassengerCar<DriverB>("Honda", "Civic", 1.5);

        Truck<DriverC> man = new Truck<DriverC>("MAN", "TGS 6x6", 6.5);
        Truck<DriverC> foton = new Truck<DriverC>("Foton", "Auman", 6.4);
        Truck<DriverC> kamaz = new Truck<DriverC>("Камаз", "65801", 5.9);
        Truck<DriverC> faw = new Truck<DriverC>("FAW", "J5", 5.5);

        Bus<DriverD> volvo = new Bus<DriverD>("Volvo", "FL7", 4.2);
        Bus<DriverD> liaz = new Bus<DriverD>("ЛиАЗ", "5256", 2.5);
        Bus<DriverD> paz = new Bus<DriverD>("ПАЗ", "\"Вектор Next\"", 3.2);
        Bus<DriverD> scania = new Bus<DriverD>("Scania", "Irizar i6", 3.5);

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

        honda.setDriverB(oleg);
        faw.setDriverC(igor);
        liaz.setDriverD(leha);

        honda.info();
        faw.info();
        liaz.info();

    }
}

package OOPhw2;

import OOPhw2.transport.Car;

public class Main {
    public static void main(String[] args) {

        Car myCar1 = new Car("Lada", "Lada Granta", 1.7, "желтый", 2015,
                "Россия","Механическая","Лифтбэк","L312",4,6 );

        Car myCar2 = new Car("Audi", "Audi A8 50 L TDI quattro", 3.0, "черный", 2020,
                "Германия","Автоматическая","Седан","A436",4,3 );

        Car myCar3 = new Car("BMW", "BMW Z8", 3.0, "черный", 2021,
                "Германия","Автоматическая","Купе","B257",2,10);

        Car myCar4 = new Car("Kia", "Kia Sportage", 2.4, "красный", 2018,
                "Ю.Корея","Автоматическая","Кроссовер","K311",5,12);

        Car myCar5 = new Car("Hyundai", "Hyundai Avante", 1.6, "оранжевый", 2016,
                "Ю.Корея","Автоматическая","Кроссовер","K322",5,1);

        System.out.println(myCar1);
        System.out.println(myCar2);
        System.out.println(myCar3);
        System.out.println(myCar4);
        System.out.println(myCar5);


    }
}
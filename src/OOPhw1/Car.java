package OOPhw1;

public class Car {
         String brand;              //марка
         String model;               //модель
         double engineVolume;          //объем двигателя в литрах
         String color;               //цвет кузова
         int productionYear;        //год производства
         String productionCountry;  //страна сборки

        public Car(String brand,String model,double engineVolume,String color,int productionYear,String productionCountry) {
                this.brand = brand;
                this.model = model;
                this.engineVolume = engineVolume;
                this.color = color;
                this.productionYear = productionYear;
                this.productionCountry = productionCountry;
        }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                ", color='" + color + '\'' +
                ", productionYear=" + productionYear +
                ", productionCountry='" + productionCountry + '\'' +
                '}';
    }
}

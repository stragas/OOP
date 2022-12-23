package OOPhw1;

public class Car {
         String brand;              //марка
         String model;               //модель
         double engineVolume;          //объем двигателя в литрах
         String color;               //цвет кузова
         int productionYear;        //год производства
         String productionCountry;  //страна сборки

        public Car(String brand,String model,double engineVolume,String color,int productionYear,String productionCountry) {
              /*  this.brand = brand;
                this.model = model;
                this.engineVolume = engineVolume;
                this.color = color;
                this.productionYear = productionYear;
                this.productionCountry = productionCountry;
                */
            if (brand == null || brand.isEmpty()) {
                this.brand = "default";
            } else {
                this.brand = brand;
            }
            if (model == null || model.isEmpty()) {
                this.model = "default";
            } else {
                this.model= model;
            }
            if (engineVolume <= 0) {
                this.engineVolume = 1.5;
            } else {
                this.engineVolume = engineVolume;
            }
            if (color == null || color.isEmpty()) {
                this.color = "белый";
            } else {
                this.color = color;
            }
            if (productionYear <= 0) {
                this.productionYear = 2000;
            } else {
                this.productionYear = productionYear;
            }
            if (productionCountry == null || productionCountry.isEmpty()) {
                this.productionCountry = "default";
            } else {
                this.productionCountry = productionCountry;
            }
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

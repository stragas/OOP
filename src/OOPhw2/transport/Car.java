package OOPhw2.transport;
import java.time.LocalDate;
import java.util.Objects;

public class Car {
        private final String brand;                // марка
        private final String model;                // модель
        private double engineVolume;               // объем двигателя в литрах
        private String color;                     // цвет кузова
        private final int productionYear;          // год производства
        private final String productionCountry;    // страна сборки
        private String transmission;               // коробка передач
        private final String bodyType;             // тип кузова
        private String registrationNumber;         // регистрационный номер
        private final int numberOfSeats;           // количество мест
        private int rubberType;                // тип резины-от месяца 1-12)
        static String changeRubber = "Лето";           // замена резины


    public static class Key {
        private final boolean remoteEngineStart;
        private final boolean keylessAccess;

        public Key(boolean remoteEngineStart, boolean keylessAccess) {
            this.remoteEngineStart = remoteEngineStart;
            this.keylessAccess = keylessAccess;
        }
        public boolean isRemoteEngineStart() {
            return remoteEngineStart;
        }
        public boolean isKeylessAccess() {
            return keylessAccess;
        }
    }
    public static class Insurance {
        private final LocalDate validityPeriod;
        private final double price;
        private final String number;
        public Insurance(LocalDate validityPeriod, double price, String number) {

            this.validityPeriod = Objects.requireNonNullElseGet(validityPeriod, LocalDate::now);

            if (price >= 0) {
                this.price = price;
            } else {
                this.price = 0;
            }
            if (number == null || number.isEmpty()) {
                this.number = "default";
            } else {
                this.number = number;
            }
        }

        public LocalDate getValidityPeriod() {
            return validityPeriod;
        }


        public double getPrice() {
            return price;
        }
        public String getNumber() {
            return number;
        }
        public void checkExpirationDate() {
            if (validityPeriod.isBefore(LocalDate.now().minusDays(365))) {
                System.out.println("Нужно срочно ехать оформлять новую страховку");
            }
        }
        public void checkNumber() {
            if (number.length() != 9) {
                System.out.println("Номер страховки некорректный!");
            }
        }
    }



    public Car(String brand, String model, double engineVolume, String color, int productionYear,
               String productionCountry, String transmission, String bodyType,
               String registrationNumber, int numberOfSeats, int rubberType) {


        if (brand == null || brand.isEmpty()) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (model == null || model.isEmpty()) {
            this.model = "default";
        } else {
            this.model = model;
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
        if (transmission == null || transmission.isEmpty()) {
            this.transmission = "Механическая";
        } else {
            this.transmission = transmission;
        }
        if (bodyType == null || bodyType.isEmpty()) {
            this.bodyType = "Седан";
        } else {
            this.bodyType = bodyType;
        }
        if (registrationNumber == null || registrationNumber.isEmpty()) {
            this.registrationNumber = "default";
        } else {
            this.registrationNumber = registrationNumber;
        }
        if (numberOfSeats <= 0) {
            this.numberOfSeats = 5;
        } else {
            this.numberOfSeats = numberOfSeats;
        }

        this.rubberType = rubberType;
    }

        public String getBrand() {
            return brand;
        }

        public String getModel() {
            return model;
        }

        public double getEngineVolume() {
            return engineVolume;
        }

        public String getColor() {
            return color;
        }

        public int getProductionYear() {
            return productionYear;
        }

        public String getProductionCountry() {
            return productionCountry;
        }

        public String getTransmission() {
            return transmission;
        }

        public String getBodyType() {
            return bodyType;
        }

        public String getRegistrationNumber() {
            return registrationNumber;
        }

        public int getNumberOfSeats() {
            return numberOfSeats;
        }

        public int getRubberType() {
            return rubberType;
        }

        public void setEngineVolume(double engineVolume) {
            this.engineVolume = engineVolume;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public void setTransmission(String transmission) {
            this.transmission = transmission;
        }

        public void setRegistrationNumber(String registrationNumber) {
            this.registrationNumber = registrationNumber;
        }

        public void setRubberType(int rubberType) {

            this.rubberType = rubberType;
        }
        public String change(){
          if (rubberType>9 || rubberType<3) {
              changeRubber = "Зима";
          } return changeRubber;
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
                ", transmission='" + transmission + '\'' +
                ", bodyType='" + bodyType + '\'' +
                ", registrationNumber='" + registrationNumber + '\'' +
                ", numberOfSeats=" + numberOfSeats +
                ", rubberType=" + change() +
                '}';
    }
}

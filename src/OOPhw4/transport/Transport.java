package OOPhw4.transport;

 // package transport;

import OOPhw4.drivers.DriverCar;


public abstract class Transport<TR extends DriverCar> implements Competing {

    abstract void startMovement();

    abstract void endMovement();

    abstract void info();

    protected final String brand;
    protected final String model;
    protected double engineVolume;

    private TR driver;


    public Transport(String brand, String model, double engineVolume) {

        if (brand == null || brand.isBlank() || brand.isEmpty()) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }


        if (model == null || model.isBlank() || model.isEmpty()) {
            this.model = "default";
        } else {
            this.model = model;
        }


        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
    }

    public String getBrand() { return brand; }

    public String getModel() { return model; }

    public double getEngineVolume() { return engineVolume; }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
    }

    public TR getDriverCar() { return driver; }

    public void setDriverCar(TR driver) { this.driver = driver; }

}

//    protected final int releaseYear;
//    protected final String country;
//    protected String colour;
//    protected int maxSpeed;
//
//    public Transport(String brand, String model, int releaseYear, String country, String colour, int maxSpeed) {
//
//        if (brand == null || brand.isBlank() || brand.isEmpty()) {
//            this.brand = "default";
//        } else {
//            this.brand = brand;
//        }
//
//
//        if (model == null || model.isBlank() || model.isEmpty()) {
//            this.model = "default";
//        } else {
//            this.model = model;
//        }
//
//
//        if (releaseYear <= 0) {
//            this.releaseYear = 2020;
//        } else {
//            this.releaseYear = releaseYear;
//        }
//
//
//        if (country == null || country.isBlank() || country.isEmpty()) {
//            this.country = "default";
//        } else {
//            this.country = country;
//        }
//
//        this.colour = colour;
//        this.maxSpeed = maxSpeed;
//
//
//        if (colour == null || colour.isBlank() || colour.isEmpty()) {
//            this.colour = "default";
//        } else {
//            this.colour = colour;
//        }
//
//
//        if (maxSpeed <= 0) {
//            this.maxSpeed = Math.abs(maxSpeed);
//        } else {
//            this.maxSpeed = maxSpeed;
//        }
//    }
//
//    public String getBrand() { return brand; }
//
//    public String getModel() { return model; }
//
//    public int getReleaseYear() { return releaseYear; }
//
//    public String getCountry() { return country; }
//
//    public String getColour() { return colour; }
//
//    public int getMaxSpeed() { return maxSpeed; }
//
//
//    public void setColour(String colour) {
//        if (colour == null || colour.isBlank() || colour.isEmpty()) {
//            this.colour = "default";
//        } else {
//            this.colour = colour;
//        }
//    }
//
//    public void setMaxSpeed(int maxSpeed) {
//        if (maxSpeed <= 0) {
//            this.maxSpeed = Math.abs(maxSpeed);
//        } else {
//            this.maxSpeed = maxSpeed;
//        }
//    }
//}
package OOPhw3.transport;
import java.time.LocalDate;
public abstract class Transport {
    private String brand;
    private String model;
    private final int productionYear;
    private final String productionCountry;
    private String color;
    private int maxSpeed;



    public Transport(String brand, String model, int releaseYear, String productionCountry, String bodyColor, int maxSpeed) {
        if (brand == null || brand.isEmpty() || brand.isBlank()) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (model == null || model.isEmpty() || model.isBlank()) {
            this.model = "default";
        } else {
            this.model = model;
        }
        if (releaseYear < 1885 && releaseYear > LocalDate.now().getYear()) {
            this.productionYear = LocalDate.now().getYear();
        } else {
            this.productionYear = releaseYear;
        }
        if (productionCountry == null || productionCountry.isEmpty() || productionCountry.isBlank()) {
            this.productionCountry = "default";
        } else {
            this.productionCountry = productionCountry;
        }
        if (bodyColor == null || bodyColor.isEmpty() || bodyColor.isBlank()) {
            this.color = "черный";
        } else {
            this.color = bodyColor;
        }
        this.maxSpeed = Math.max(maxSpeed, 0);
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        if (brand == null || brand.isEmpty() || brand.isBlank()) {
            System.out.println("Вы задали неверный параметр, попробуйте еще раз!");
        } else {
            this.brand = brand;
        }
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        if (model == null || model.isEmpty() || model.isBlank()) {
            System.out.println("Вы задали неверный параметр, попробуйте еще раз!");
        } else {
            this.model = model;
        }
    }
    public int getReleaseYear() {
        return productionYear;
    }
    public String getProductionCountry() {
        return productionCountry;
    }
    public String getBodyColor() {
        return color;
    }
    public void setBodyColor(String bodyColor) {
        if (bodyColor == null || bodyColor.isEmpty() || bodyColor.isBlank()) {
            System.out.println("Вы задали неверный параметр, попробуйте еще раз!");
        } else {
            this.color = bodyColor;
        }
    }
    public int getMaxSpeed() {
        return maxSpeed;
    }
    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed < 0) {
            System.out.println("Вы задали неверный параметр, попробуйте еще раз!");
        } else {
            this.maxSpeed = maxSpeed;
        }
    }
    @Override
    public String toString() {
        return brand + " " +
                model + ", " +
                productionYear+ " год выпуска. Страна-производитель: " +
                productionCountry + ". Цвет кузова: " +
                color + ". Максимальная скорость: " +
                maxSpeed;
    }

}

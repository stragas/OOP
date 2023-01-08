package OOPhw4.drivers;

public class DriverCar {
    protected final String fullName;
    protected boolean driverLicense;
    protected int experience;
    protected void startMovement(){
        System.out.println("Водитель " + getFullName() + " начал движение");
    };

    protected void stopMovement() {
        System.out.println("Водитель " + getFullName() + " остановился");
    };

    protected void refuel(){
        System.out.println("Водитель " + getFullName() + " поехал на заправку");
    };



    public DriverCar(String fullName, Boolean driverLicense, int experience) {

        if (fullName == null || fullName.isEmpty() || fullName.isBlank()) {
            this.fullName = "Водитель";
        } else {
            this.fullName = fullName;
        }

        if (driverLicense == null) {
            this.driverLicense = false;
        } else {
            this.driverLicense = driverLicense;
        }

        if (experience <= 0) {
            this.experience = Math.abs(experience);
        } else {
            this.experience = experience;
        }
    }

    public String getFullName() { return fullName; }

    public boolean getDriverLicense() { return driverLicense; }

    public int getExperience() { return experience; }

    public void setDriverLicense(Boolean driverLicense) {
        if (driverLicense == null) {
            this.driverLicense = false;
        } else {
            this.driverLicense = driverLicense;
        }
    }
    public void setExperience (int experience){
        if (experience <= 0) {
            this.experience = Math.abs(experience);
        } else {
            this.experience = experience;
        }
    }

    @Override
    public String toString() {
        return "Водитель - " + fullName +
                ", наличие прав - " + driverLicense +
                ", стаж - " + experience + " лет";
    }
}

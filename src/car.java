public class Car {
}
    String brand;
    String model;
    double engineVolume;
    String color;
    int productionYear;
    String productionCountry;

    @Override
    public String toString() {
        return brand + " " + model + " " + productionYear + " года выпуска, сборка в " + productionCountry + ", " + color + " цвет кузова, объем двигателя — " + engineVolume + " л.";
    }
}
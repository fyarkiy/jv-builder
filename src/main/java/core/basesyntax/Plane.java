package core.basesyntax;

/**
 * <p>Дано класс Plane. Написать класс PlaneBuilder, который реализует паттерн Builder.
 * Добавьте не менее пяти полей в класс Plain. Внести все необходимые изминения в класс Plane
 * которые могут потребоваться для реализации паттерна Builder.</p>
 */

public class Plane {
    private String brand;
    private String model;
    private int yearOfManufacturing;
    private int numberOfSeats;
    private boolean turboEngine;

    Plane(PlaneBuilder planeBuilder) {
        this.brand = planeBuilder.brand;
        this.model = planeBuilder.model;
        this.yearOfManufacturing = planeBuilder.yearOfManufacturing;
        this.numberOfSeats = planeBuilder.numberOfSeats;
        this.turboEngine = planeBuilder.turboEngine;
    }

    public static class PlaneBuilder {
        String brand;
        String model;
        int yearOfManufacturing;
        int numberOfSeats;
        boolean turboEngine;

        public PlaneBuilder(String brand, String model) {
            this.brand = brand;
            this.model = model;
        }

        public PlaneBuilder setBrand(String brand) {
            this.brand = brand;
            return this;
        }

        public PlaneBuilder setModel(String model) {
            this.model = model;
            return this;
        }

        public PlaneBuilder setYearOfManufacturing(int yearOfManufacturing) {
            this.yearOfManufacturing = yearOfManufacturing;
            return this;
        }

        public PlaneBuilder setNumberOfSeats(int numberOfSeats) {
            this.numberOfSeats = numberOfSeats;
            return this;
        }

        public PlaneBuilder setTurboEngine(boolean turboEngine) {
            this.turboEngine = turboEngine;
            return this;
        }

        public Plane build() {
            return new Plane(this);
        }
    }
}

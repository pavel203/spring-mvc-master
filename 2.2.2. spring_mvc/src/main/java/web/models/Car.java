package web.models;


import java.util.Objects;

public class Car {
    private final String model;
    private final int generation;
    private final String color;

    public Car(String model, int generation, String color) {
        this.model = model;
        this.generation = generation;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public int getGeneration() {
        return generation;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", generation=" + generation +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return generation == car.generation && model.equals(car.model) && Objects.equals(color, car.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, generation, color);
    }
}

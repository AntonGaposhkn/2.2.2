package web.model;

public class Car {
    Long id;
    String brand;
    String colour;

    public Car() {
    }

    public Car(Long id, String brand, String colour) {
        this.id = id;
        this.brand = brand;
        this.colour = colour;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", colour='" + colour + '\'' +
                '}';
    }

}
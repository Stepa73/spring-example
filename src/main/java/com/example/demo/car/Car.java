package com.example.demo.car;

public class Car {
    private String brand;
    private String model;
    private String color;
    private Double mileage;
    private Integer numberOfSeat;
    private Integer numberOdDoors;

    public Car() {
    }

    public Car(
        String brand,
        String model,
        String color,
        Double mileage,
        Integer numberOfSeat,
        Integer numberOdDoors
    ) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.mileage = mileage;
        this.numberOfSeat = numberOfSeat;
        this.numberOdDoors = numberOdDoors;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getMileage() {
        return mileage;
    }

    public void setMileage(Double mileage) {
        this.mileage = mileage;
    }

    public Integer getNumberOfSeat() {
        return numberOfSeat;
    }

    public void setNumberOfSeat(Integer numberOfSeat) {
        this.numberOfSeat = numberOfSeat;
    }

    public Integer getNumberOdDoors() {
        return numberOdDoors;
    }

    public void setNumberOdDoors(Integer numberOdDoors) {
        this.numberOdDoors = numberOdDoors;
    }
}

package com.cdk.bapb.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="car")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int carId;
    private String make;
    private String model;
    private int yearOfBuying;
    private long distanceTravelled;
    private double baseSellingPrice;
    private Date entryDate;

    public Car() {
    }

    public Car(String make, String model, int yearOfBuying, long distanceTravelled, double baseSellingPrice, Date entryDate) {
        this.make = make;
        this.model = model;
        this.yearOfBuying = yearOfBuying;
        this.distanceTravelled = distanceTravelled;
        this.baseSellingPrice = baseSellingPrice;
        this.entryDate = entryDate;
    }

    public Car(int carId, String make, String model, int yearOfBuying, long distanceTravelled, double baseSellingPrice, Date entryDate) {
        this.carId = carId;
        this.make = make;
        this.model = model;
        this.yearOfBuying = yearOfBuying;
        this.distanceTravelled = distanceTravelled;
        this.baseSellingPrice = baseSellingPrice;
        this.entryDate = entryDate;
    }

    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearOfBuying() {
        return yearOfBuying;
    }

    public void setYearOfBuying(int yearOfBuying) {
        this.yearOfBuying = yearOfBuying;
    }

    public long getDistanceTravelled() {
        return distanceTravelled;
    }

    public void setDistanceTravelled(long distanceTravelled) {
        this.distanceTravelled = distanceTravelled;
    }

    public double getBaseSellingPrice() {
        return baseSellingPrice;
    }

    public void setBaseSellingPrice(double baseSellingPrice) {
        this.baseSellingPrice = baseSellingPrice;
    }

    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }

    public Date getEntryDate() {
        return entryDate;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carId=" + carId +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", yearOfBuying=" + yearOfBuying +
                ", distanceTravelled=" + distanceTravelled +
                ", baseSellingPrice=" + baseSellingPrice +
                ", entryDate=" + entryDate +
                '}';
    }
}

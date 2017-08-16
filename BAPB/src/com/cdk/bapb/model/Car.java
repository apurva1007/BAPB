package com.cdk.bapb.model;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="car")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String carId;
    private String make;
    private String model;
    private String yearOfBuying;
    private int distanceTravelled;
    private double baseSellingPrice;
    private Date entryDate;
    private int remainingBiddingDays;

    @Autowired
    private User user;

    public Car() {
    }

    public Car(String make, String model, String yearOfBuying, int distanceTravelled, double baseSellingPrice, Date entryDate, int remainingBiddingDays, User user) {
        this.make = make;
        this.model = model;
        this.yearOfBuying = yearOfBuying;
        this.distanceTravelled = distanceTravelled;
        this.baseSellingPrice = baseSellingPrice;
        this.entryDate = entryDate;
        this.remainingBiddingDays = remainingBiddingDays;
        this.user = user;
    }

    public Car(String carId, String make, String model, String yearOfBuying, int distanceTravelled, double baseSellingPrice, Date entryDate, int remainingBiddingDays, User user) {
        this.carId = carId;
        this.make = make;
        this.model = model;
        this.yearOfBuying = yearOfBuying;
        this.distanceTravelled = distanceTravelled;
        this.baseSellingPrice = baseSellingPrice;
        this.entryDate = entryDate;
        this.remainingBiddingDays = remainingBiddingDays;
        this.user = user;
    }

    public String getCarId() {
        return carId;
    }

    public void setCarId(String carId) {
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

    public String getYearOfBuying() {
        return yearOfBuying;
    }

    public void setYearOfBuying(String yearOfBuying) {
        this.yearOfBuying = yearOfBuying;
    }

    public int getDistanceTravelled() {
        return distanceTravelled;
    }

    public void setDistanceTravelled(int distanceTravelled) {
        this.distanceTravelled = distanceTravelled;
    }

    public double getBaseSellingPrice() {
        return baseSellingPrice;
    }

    public void setBaseSellingPrice(double baseSellingPrice) {
        this.baseSellingPrice = baseSellingPrice;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carId='" + carId + '\'' +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", yearOfBuying='" + yearOfBuying + '\'' +
                ", distanceTravelled=" + distanceTravelled +
                ", baseSellingPrice=" + baseSellingPrice +
                ", user=" + user +
                '}';
    }

    public int getRemainingBiddingDays() {
        return remainingBiddingDays;
    }

    public void setRemainingBiddingDays(int remainingBiddingDays) {
        this.remainingBiddingDays = remainingBiddingDays;
    }

    public Date getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }
}

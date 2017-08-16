package com.cdk.bapb.model;

import java.util.Date;

public class Transaction {
    private String tr_id;
    private Bid bid;
    private double price;
    private String modeOfPayment;
    private Date delieveryDate;
    enum delieveryMode{PICKUP,HOMEDROP,MOVERS_PACKERS};

    public Transaction() {
    }

    public Transaction(String tr_id, Bid bid, double price, String modeOfPayment, Date delieveryDate) {
        this.tr_id = tr_id;
        this.bid = bid;
        this.price = price;
        this.modeOfPayment = modeOfPayment;
        this.delieveryDate = delieveryDate;
    }

    public Transaction(Bid bid, double price, String modeOfPayment, Date delieveryDate) {
        this.bid = bid;
        this.price = price;
        this.modeOfPayment = modeOfPayment;
        this.delieveryDate = delieveryDate;
    }

    public String getTr_id() {
        return tr_id;
    }

    public void setTr_id(String tr_id) {
        this.tr_id = tr_id;
    }

    public Bid getBid() {
        return bid;
    }

    public void setB_id(Bid bid) {
        this.bid = bid;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getModeOfPayment() {
        return modeOfPayment;
    }

    public void setModeOfPayment(String modeOfPayment) {
        this.modeOfPayment = modeOfPayment;
    }

    public Date getDelieveryDate() {
        return delieveryDate;
    }

    public void setDelieveryDate(Date delieveryDate) {
        this.delieveryDate = delieveryDate;
    }
}

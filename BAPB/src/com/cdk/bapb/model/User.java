package com.cdk.bapb.model;

import javax.persistence.*;

@Entity
@Table(name="user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int u_Id;
    private String userName;
    private String contactDetail;

    public User(int u_Id, String name, String contactDetail) {
        this.u_Id = u_Id;
        this.userName = name;
        this.contactDetail = contactDetail;
    }

    public User() {
    }

    public User(String name, String contactDetail) {
        this.userName = name;
        this.contactDetail = contactDetail;
    }

    public int getU_Id() {
        return u_Id;
    }

    public void setU_Id(int u_Id) {
        this.u_Id = u_Id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getContactDetail() {
        return contactDetail;
    }

    public void setContactDetail(String contactDetail) {
        this.contactDetail = contactDetail;
    }

    @Override
    public String toString() {
        return "Car{" +
                "u_Id='" + u_Id + '\'' +
                ", userName='" + userName + '\'' +
                ", contactDetail='" + contactDetail + '\'' +
                '}';
    }
}

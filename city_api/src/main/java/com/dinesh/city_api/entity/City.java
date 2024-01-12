package com.dinesh.city_api.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    String name;
    String pincode;

    public City() {
    }

    public City(int id, String name, String pincode) {
        this.id = id;
        this.name = name;
        this.pincode = pincode;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pincode='" + pincode + '\'' +
                '}';
    }
}

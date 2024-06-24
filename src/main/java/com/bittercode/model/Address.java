package com.bittercode.model;

import org.checkerframework.checker.nullness.qual.*;

import java.io.Serializable;

public class Address implements Serializable {

    private @MonotonicNonNull String addressLine1;
    private @MonotonicNonNull String addressLine2;
    private @MonotonicNonNull String city;
    private @MonotonicNonNull String state;
    private @MonotonicNonNull String country;
    private long pinCode;
    private @MonotonicNonNull String phone;

    @RequiresNonNull("this.addressLine1") public String getAddressLine1() {
        return addressLine1;
    }

     public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    @RequiresNonNull("this.addressLine2") public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    @RequiresNonNull("this.city") public String getCity() {
        return city;
    }

     public void setCity(String city) {
        this.city = city;
    }

    @RequiresNonNull("this.state") public String getState() {
        return state;
    }

     public void setState(String state) {
        this.state = state;
    }

    @RequiresNonNull("this.country") public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @RequiresNonNull("this.pinCode") public long getPinCode() {
        return pinCode;
    }

     public void setPinCode(long pinCode) {
        this.pinCode = pinCode;
    }

    @RequiresNonNull("this.phone") public String getPhone() {
        return phone;
    }

     public void setPhone(String phone) {
        this.phone = phone;
    }

}

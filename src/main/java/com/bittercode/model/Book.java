package com.bittercode.model;

import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.MonotonicNonNull;
import org.checkerframework.checker.nullness.qual.Nullable;
import java.io.Serializable;

public class Book implements Serializable {

    private @MonotonicNonNull String barcode;
    private @MonotonicNonNull String name;
    private @MonotonicNonNull String author;
    private double price;
    private int quantity;

    public Book(@Nullable String barcode, @Nullable String name, @Nullable String author, double price, int quantity) {
        this.barcode = barcode;
        this.name = name;
        this.author = author;
        this.price = price;
        this.quantity = quantity;
    }
    public Book() {
        super();
    }


    public @Nullable String getBarcode() {
        return barcode;
    }

    @EnsuresNonNull("this.barcode") public void setBarcode(String barcode) {
        this.barcode = barcode;
    }
    public @Nullable String getName() {
        return name;
    }

    @EnsuresNonNull("this.name")public void setName(String name) {
        this.name = name;
    }
    public @Nullable String getAuthor() {
        return author;
    }

    @EnsuresNonNull("this.author")public void setAuthor(String author) {
        this.author = author;
    }

    public int getQuantity() {
        return quantity;
    }

    @EnsuresNonNull("this.quantity") public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    @EnsuresNonNull("this.price") public void setPrice(double price) {
        this.price = price;
    }

}

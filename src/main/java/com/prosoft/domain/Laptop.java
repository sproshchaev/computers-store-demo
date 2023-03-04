package com.prosoft.domain;

import java.util.Objects;

/**
 * POJO-класс Laptop
 */
public class Laptop {
    private long id;
    private String serialNumber;
    private String brand;
    private int ram;
    private int hdd;
    private String os;
    private String color;

    public Laptop() {
    }

    public Laptop(String serialNumber, String brand, int ram, int hdd, String os, String color) {
        this.serialNumber = serialNumber;
        this.brand = brand;
        this.ram = ram;
        this.hdd = hdd;
        this.os = os;
        this.color = color;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getHdd() {
        return hdd;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Laptop laptop = (Laptop) o;
        return id == laptop.id && ram == laptop.ram && hdd == laptop.hdd && Objects.equals(serialNumber, laptop.serialNumber) && Objects.equals(brand, laptop.brand) && Objects.equals(os, laptop.os) && Objects.equals(color, laptop.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, serialNumber, brand, ram, hdd, os, color);
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "id=" + id +
                ", serialNumber='" + serialNumber + '\'' +
                ", brand='" + brand + '\'' +
                ", ram=" + ram +
                ", hdd=" + hdd +
                ", os='" + os + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

}

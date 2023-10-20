package com.pluralsight;

public class Product {
    private String id;
    private String name;
    private float price;

    private String department;


    public Product(String id, String name, float price, String department){
        this.id = id;
        this.name = name;
        this.price = price;
        this.department = department;

    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public float getPrice() {
        return this.price;
    }

    public String getDepartment() {
        return this.department;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}

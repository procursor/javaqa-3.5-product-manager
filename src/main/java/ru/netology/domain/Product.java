package ru.netology.domain;

public class Product {
    private final int id;
    private final String name;
    private final int price;

    public Product(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public boolean matches(String name) {
        return this.name.equalsIgnoreCase(name);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

package ru.netology.domain;

public class Book extends Product {
    private final String author;

    public Book(int id, String name, int price, String author) {
        super(id, name, price);
        this.author = author;
    }

    @Override
    public boolean matches(String author) {
        return super.matches(author) || this.author.equalsIgnoreCase(author);
    }

    public String getAuthor() {
        return author;
    }
}

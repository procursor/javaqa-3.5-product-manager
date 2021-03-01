package ru.netology.domain;

public class Phone extends Product {

    private final String vendor;

    public Phone(int id, String name, int price, String vendor) {
        super(id, name, price);
        this.vendor = vendor;
    }

    @Override
    public boolean matches(String vendor) {
        return super.matches(vendor) || this.vendor.equalsIgnoreCase(vendor);
    }

    public String getVendor() {
        return vendor;
    }
}

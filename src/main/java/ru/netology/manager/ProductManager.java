package ru.netology.manager;

import org.apache.commons.lang3.ArrayUtils;
import ru.netology.domain.Product;
import ru.netology.repository.ProductRepository;

public class ProductManager {
    private final ProductRepository repository;

    public ProductManager(ProductRepository repository) {
        this.repository = repository;
    }

    public Product[] searchBy(String text) {
        var found = new Product[0];
        for (var p : repository.findAll()) {
            if (p.matches(text))
                found = ArrayUtils.add(found, p);
        }
        return found;
    }

    public void add(Product item) {
        repository.save(item);
    }

}

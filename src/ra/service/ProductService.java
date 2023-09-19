package ra.service;

import ra.model.Product;

public class ProductService implements IGeneric<Product,Integer>{
    @Override
    public Product[] findAll() {
        return new Product[0];
    }

    @Override
    public Product findById(Integer id) {
        return null;
    }

    @Override
    public void save(Product product) {

    }

    @Override
    public void delete(Integer id) {

    }
}

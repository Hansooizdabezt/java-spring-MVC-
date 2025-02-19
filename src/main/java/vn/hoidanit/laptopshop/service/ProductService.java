package vn.hoidanit.laptopshop.service;

import java.util.List;

import org.springframework.stereotype.Service;

import vn.hoidanit.laptopshop.domain.Product;
import vn.hoidanit.laptopshop.repository.ProductRepository;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getAllProduct() {
        return this.productRepository.findAll();
    }

    public List<Product> getAllProductByName(String name) {
        return this.productRepository.findOneByName(name);
    }

    public Product handleSaveUser(Product product) {
        Product newProduct = this.productRepository.save(product);
        System.out.println(newProduct);
        return newProduct;
    }

}

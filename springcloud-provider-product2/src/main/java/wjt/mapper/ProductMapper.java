package wjt.mapper;

import wjt.vo.Product;

import java.util.List;

public interface ProductMapper {
    boolean create(Product product);
    Product findById(Long id);
    List<Product> findAll();
}
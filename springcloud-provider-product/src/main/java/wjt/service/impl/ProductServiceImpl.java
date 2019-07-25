package wjt.service.impl;

import org.springframework.stereotype.Service;
import wjt.mapper.ProductMapper;
import wjt.service.IProductService;
import wjt.vo.Product;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ProductServiceImpl implements IProductService
{

    @Resource
    private ProductMapper productMapper;

    @Override
    public Product get(long id) {
        return productMapper.findById(id);
    }

    @Override
    public boolean add(Product product) {
        return productMapper.create(product);
    }

    @Override
    public List<Product> list() {
        return productMapper.findAll();
    }
}
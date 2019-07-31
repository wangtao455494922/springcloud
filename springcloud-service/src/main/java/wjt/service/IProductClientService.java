package wjt.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import wjt.config.FeignClientConfig;
import wjt.vo.Product;

import java.util.List;

@FeignClient(name = "SPRINGCLOUD-PROVIDER-PRODUCT",configuration = FeignClientConfig.class)
public interface IProductClientService
{
    @RequestMapping("/prodcut/get/{id}")
    public Product getProduct(@PathVariable("id") long id);

    /*@RequestMapping("/prodcut/list")
    public  List<Product> listProduct() ;

    @RequestMapping("/prodcut/add")
    public boolean addPorduct(Product product) ;*/

}
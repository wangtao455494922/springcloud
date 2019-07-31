package wjt.controller;

import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import wjt.service.IProductClientService;
import wjt.vo.Product;

import javax.annotation.Resource;

@RestController
@RequestMapping("/consumer")
public class FeignController
{

    @Resource
    private IProductClientService iProductClientService;


    @RequestMapping("/product/get/{id}")
    public Object getProduct(@PathVariable("id") long id) {
        return  iProductClientService.getProduct(id);
    }

  /*  @RequestMapping("/product/list")
    public  Object listProduct() {
        return iProductClientService.listProduct();
    }*/

   /* @RequestMapping("/product/add")
    public Object addPorduct(Product product) {
        return  iProductClientService.addPorduct(product);
    }*/
}
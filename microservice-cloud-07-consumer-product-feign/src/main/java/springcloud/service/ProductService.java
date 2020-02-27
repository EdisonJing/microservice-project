package springcloud.service;

import com.mengxuegu.springcloud.entities.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient(value = "microservice-product",fallback = ProductServiceFallback.class)
public interface ProductService {

    @RequestMapping(value = "/product/add")
    boolean add(@RequestBody Product product) ;

    @RequestMapping(value = "/product/get/{id}")
    Product get(@PathVariable("id") Long id) ;

    @RequestMapping(value = "/product/list")
    List<Product> list();

}

package springcloud.service;

import com.mengxuegu.springcloud.entities.Product;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceFallback implements ProductService {
    @Override
    public boolean add(Product product) {
        return false;
    }

    @Override
    public Product get(Long id) {
        return new Product(id+"：没有对应的数据,client");
    }

    @Override
    public List<Product> list() {
        return null;
    }
}

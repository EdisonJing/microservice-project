package springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Auther: 梦学谷
 */
@EnableFeignClients
@EnableEurekaClient
@SpringBootApplication
public class ProductConsumerFeign_80 {

    public static void main(String[] args) {
        SpringApplication.run(ProductConsumerFeign_80.class, args);
    }

}

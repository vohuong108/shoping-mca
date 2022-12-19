package vv.huong.Product.Service.MCA;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ProductServiceMcaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductServiceMcaApplication.class, args);
	}

}

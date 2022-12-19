package vv.huong.Order.Service.MCA;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableEurekaClient
public class OrderServiceMcaApplication {
	public static void main(String[] args) {
		SpringApplication.run(OrderServiceMcaApplication.class, args);
	}

}

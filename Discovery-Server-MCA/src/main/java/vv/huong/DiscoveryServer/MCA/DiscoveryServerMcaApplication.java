package vv.huong.DiscoveryServer.MCA;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DiscoveryServerMcaApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiscoveryServerMcaApplication.class, args);
	}

}

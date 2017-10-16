package webservice.backdata.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
@ComponentScan("com.blockchain")
public class BlockchainAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(BlockchainAppApplication.class, args);
	}
}

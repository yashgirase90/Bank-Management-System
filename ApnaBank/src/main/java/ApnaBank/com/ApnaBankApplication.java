package ApnaBank.com;

import javax.persistence.Entity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"ApanBank.com","com.Dao","com.Model","com.Service","com.Controller"})
@EntityScan("com.Model")
@EnableJpaRepositories("com.Dao")
public class ApnaBankApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApnaBankApplication.class, args);
	}

}

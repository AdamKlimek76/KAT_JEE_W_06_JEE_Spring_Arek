package pl.coderslab.samples;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class AppConfig {

	@Bean
	public Driver andrzej() {
		return new Driver("Andrzej");
	}

	@Bean
	public Driver ola() {
		return new Driver("Ola");
	}

	@Bean
	public Car carBean(@Qualifier("ola") Driver driver) {
		Car car = new Car("Passat", 200);
		car.setDriver(driver);
		return car;
	}
}

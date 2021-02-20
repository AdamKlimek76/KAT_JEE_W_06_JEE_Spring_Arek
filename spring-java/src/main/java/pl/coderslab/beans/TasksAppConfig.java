package pl.coderslab.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TasksAppConfig {

	@Bean
	public HelloWorld helloWorld() {
		return new HelloWorld();
	}
}

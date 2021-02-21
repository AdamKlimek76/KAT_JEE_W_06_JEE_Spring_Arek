package pl.coderslab.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class TasksAppConfig {

	@Bean
	public HelloWorld helloWorld() {
		return new HelloWorld();
	}

	// zad 3
	@Bean
	public Captain jackSparrow() {
		return new Captain();

	}

	@Bean
	public Ship blackPearl() {
		return new Ship(jackSparrow());
	}

	// zad 4

	@Bean
	@Scope("prototype")
	public ScopePrototype scopePrototype() {
		return new ScopePrototype();
	}

	@Bean
	public ScopeSingleton scopeSingleton() {
		return new ScopeSingleton();
	}

}

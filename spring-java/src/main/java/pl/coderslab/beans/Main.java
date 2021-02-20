package pl.coderslab.beans;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx =
				new AnnotationConfigApplicationContext(TasksAppConfig.class);

		HelloWorld helloWorld = ctx.getBean("helloWorld", HelloWorld.class);
		HelloWorld helloWorld1 = (HelloWorld) ctx.getBean("helloWorld");
		HelloWorld helloWorld2 = ctx.getBean(HelloWorld.class);
		helloWorld.hello();
		helloWorld1.hello();
		helloWorld2.hello();

		// Zad 3
		Ship ship = ctx.getBean("blackPearl", Ship.class);
		ship.getCaptain().startSailing();

		// Zad 4
		ScopeSingleton singleton1 = ctx.getBean(ScopeSingleton.class);
		System.out.println(singleton1);
		ScopeSingleton singleton2 = ctx.getBean(ScopeSingleton.class);
		System.out.println(singleton2);
		System.out.println((singleton1 == singleton2) + ": ten sam obiekt\n");

		ScopePrototype prototype1 = ctx.getBean(ScopePrototype.class);
		System.out.println(prototype1);
		ScopePrototype prototype2 = ctx.getBean(ScopePrototype.class);
		System.out.println(prototype2);
		System.out.println((prototype1 == prototype2) + ": dwa różne obiekty");


	}
}

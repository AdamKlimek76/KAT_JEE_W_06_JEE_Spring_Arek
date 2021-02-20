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
	}
}

package pl.coderslab.autowired;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import pl.coderslab.autowired.beans.PersonService;

public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(ComponentAutoConfig.class);

		PersonService person = context.getBean(PersonService.class);
		System.out.println(person.getPersonRepository().getClass().getName());

	}
}

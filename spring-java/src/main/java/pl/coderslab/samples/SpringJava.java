package pl.coderslab.samples;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringJava {
	public static void main(String[] args) {
		System.out.println("Działa");

		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(AppConfig.class);

		Car carBean = (Car) context.getBean("carBean");
		carBean.move();

		Car carBeanAsAClass = context.getBean(Car.class);
		carBeanAsAClass.move();

		System.out.println(carBean == carBeanAsAClass);

		Driver driver = context.getBean("andrzej", Driver.class);
		System.out.println(driver.getName());

		EmailService emailService = context.getBean(EmailService.class);
		emailService.send();

		EmailService anotherEmailService = context.getBean("emailService", EmailService.class);
		System.out.println(emailService == anotherEmailService);
		// true domyślnie
		// false dla prototype

		MessageSender messageSender = context.getBean(MessageSender.class);
		messageSender.sendMessage();

		context.close();
	}
}

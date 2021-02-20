package pl.coderslab.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import pl.coderslab.beans.EmailService;
import pl.coderslab.beans.HelloWorld;
import pl.coderslab.beans.MessageSender;

public class SpringDiApplication {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("beansTasks.xml");

		HelloWorld helloWorld = context.getBean("helloWorld", HelloWorld.class);
		System.out.println(helloWorld.getMessage());

		EmailService emailService = context.getBean(EmailService.class);
		emailService.send();

		MessageSender messageSender = context.getBean("messageSender", MessageSender.class);
		messageSender.sendMessage();
		messageSender.sendMessageFromProperty();


		// normalnie bez springa
		EmailService normalEmailService = new EmailService();
		MessageSender normalMessageSender = new MessageSender(
				normalEmailService
		);
		normalMessageSender.setMessage("Message from plain Java");
		normalMessageSender.sendMessage();
		normalMessageSender.sendMessageFromProperty();

		context.close();
	}
}

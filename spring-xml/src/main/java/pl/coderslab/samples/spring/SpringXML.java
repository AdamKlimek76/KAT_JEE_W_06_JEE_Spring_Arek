package pl.coderslab.samples.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringXML {

	public static void main(String[] args) {
		//Car carAsOurObject = new Car();


		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("beans.xml");

		Car carBean = (Car) context.getBean("carBean");
		carBean.move();

		Car carBeanAsAClass = context.getBean(Car.class);
		carBeanAsAClass.move();

		System.out.println(carBean == carBeanAsAClass);

		Driver driver = context.getBean("andrzej", Driver.class);
		System.out.println(driver.getName());
		context.close();
	}
}

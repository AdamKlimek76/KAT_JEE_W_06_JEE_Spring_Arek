package pl.coderslab.samples.spring;

public class Car {

	private Driver driver;
	private String name;
	private int speed;

	public Car(String name, int speed) {
		this.name = name;
		this.speed = speed;
	}

	public Car() {
		this.name = "unknown";
		this.speed = 50;
	}

	public void move() {
		System.out.println(
				driver.getName() + " is driving a Car "
						+ name + " with speed " + speed);
	}

	public void setDriver(Driver driver) {
		this.driver = driver;
	}
}

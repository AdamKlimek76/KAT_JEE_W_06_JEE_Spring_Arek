package pl.coderslab.samples.dependencyinjection;

public class MySQLDatabase implements Database {

	@Override
	public void save(String book) {
		System.out.println("[MYSQL] Saving " + book);
	}
}

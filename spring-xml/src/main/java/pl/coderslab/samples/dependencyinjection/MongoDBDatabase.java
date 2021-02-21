package pl.coderslab.samples.dependencyinjection;

public class MongoDBDatabase implements Database {
	@Override
	public void save(String book) {
		System.out.println("[MongoDB] saving book " + book);
	}
}

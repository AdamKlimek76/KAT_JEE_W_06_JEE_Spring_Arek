package pl.coderslab.samples.dependencyinjection;

public class DependencyInjection {

	public static void main(String[] args) {
		System.out.println("Działa");


		EmailNotificationService email = new EmailNotificationService();
		SMSNotificationService sms = new SMSNotificationService();

		MySQLDatabase mySQL = new MySQLDatabase();
		MongoDBDatabase mongoDB = new MongoDBDatabase();

		Library library = new Library(email, mongoDB);
		library.sendReminder();

		library.setNotificationService(sms);
		library.sendReminder();

		library.addBook("Potop");
		library.setDatabase(mySQL);
		library.addBook("Potop");
	}
}

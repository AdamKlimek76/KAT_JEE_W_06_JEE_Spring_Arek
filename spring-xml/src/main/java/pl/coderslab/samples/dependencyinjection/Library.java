package pl.coderslab.samples.dependencyinjection;

public class Library {

	private NotificationService notificationService;
	private Database database;

	public Library(
			NotificationService notificationService,
			Database database
	) {
		this.notificationService = notificationService;
		this.database = database;
	}

	public void sendReminder() {
		notificationService.send("Oddaj książkę!");
	}

	public void addBook(String title) {
		database.save(title);
	}

	public void setNotificationService(NotificationService notificationService) {
		this.notificationService = notificationService;
	}

	public void setDatabase(Database database) {
		this.database = database;
	}
}

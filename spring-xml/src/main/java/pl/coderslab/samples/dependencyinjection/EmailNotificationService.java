package pl.coderslab.samples.dependencyinjection;

public class EmailNotificationService implements NotificationService {
	@Override
	public void send(String message) {
		System.out.println("[Sending Email] " + message);
	}
}

package pl.coderslab.samples.dependencyinjection;

public class SMSNotificationService implements NotificationService {
	@Override
	public void send(String message) {
		System.out.println("[Sending SMS] " + message);
	}
}

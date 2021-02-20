package pl.coderslab.samples;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class SmsService implements MessageService {
	@Override
	public void send() {
		System.out.println("Sending SMS");
	}

	@Override
	public void send(String message) {
		System.out.println("Sending SMS " + message);
	}
}

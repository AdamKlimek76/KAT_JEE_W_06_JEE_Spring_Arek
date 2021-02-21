package pl.coderslab.samples;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
// lub @Component
//@Primary
// domyślną nazwą komponentu jest nazwa klasy z małej litery
// emailService
@Scope("prototype")
public class EmailService implements MessageService {

	@Override
	public void send() {
		System.out.println("Sending email");
	}

	@Override
	public void send(String message) {
		System.out.println("Sending email: " + message);
	}
}

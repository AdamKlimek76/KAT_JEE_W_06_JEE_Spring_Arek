package pl.coderslab.samples;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MessageSender {
	private MessageService messageService;
	private String message = "";

	public MessageSender(
			//@Qualifier("smsService") MessageService messageService
			MessageService smsService
	) {
		this.messageService = smsService;
	}

	public void sendMessage() {
		this.messageService.send();
	}

	public void sendMessageFromProperty() {
		this.messageService.send(this.message);
	}

	public void setMessage(String message) {
		this.message = message;
	}
}

package pl.coderslab.beans;

public class MessageSender {
	private MessageService messageService;
	private String message = "";

	public MessageSender(MessageService messageService) {
		this.messageService = messageService;
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

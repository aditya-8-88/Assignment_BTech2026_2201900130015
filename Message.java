import java.time.LocalDateTime;

public class Message {
    private String sender;
    private String recipient;
    private String content;
    private LocalDateTime timestamp;

    public Message(String sender, String recipient, String content) {
        this.sender = sender;
        this.recipient = recipient;
        this.content = content;
        this.timestamp = LocalDateTime.now();
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public void displayMessage() {
        System.out.println("From: " + sender);
        System.out.println("To: " + recipient);
        System.out.println("Sent: " + timestamp);
        System.out.println("Message: " + content);
    }

    public static void main(String[] args) {
        Message message = new Message("Alice", "Bob", "Hello, Bob!");
        message.displayMessage();
    }
}
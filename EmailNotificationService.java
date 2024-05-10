public class EmailNotificationService implements NotificationService {

  @Override
  public void sendEmailNotification(String email, String message) {
    // Simulate sending email notification
    System.out.println("Email notification sent to: " + email + ". Message: " + message);
  }
}

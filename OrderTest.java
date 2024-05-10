public class OrderTest {

  public static void main(String[] args) {
    OrderOperations order = new OrderAction();
    order.calculateTotal(10.0, 2);
    order.placeOrder("John Doe", "123 Main St");

    InvoiceOperations invoice = new InvoiceAction();
    invoice.generateInvoice("order_123.pdf");

    NotificationService notification = new EmailNotificationService();
    notification.sendEmailNotification("johndoe@example.com", "Your order has been placed.");
  }
}

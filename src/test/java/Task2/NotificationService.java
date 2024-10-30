package Task2;

public class NotificationService {
    public static void  sendAlert(Notification notification, String message){
        notification.sendNotification(message);
    }

    public static void main(String[] args) {
        Notification emalNotification = new EmalNotification();
        Notification smsNotification = new SMSNotification();

        sendAlert(emalNotification, "Email Alert");
        sendAlert(smsNotification, "SMS Alert");
    }
}

package Task2;

class SMSNotification extends Notification{
    @Override
    public void sendNotification(String message){
        System.out.println("SMS");
    }
}

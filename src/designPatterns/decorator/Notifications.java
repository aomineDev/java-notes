package designPatterns.decorator;

interface Notification {
  void send(String message);
}

class BasicNotification implements Notification {
  @Override
  public void send (String message) {
    System.out.println("send basic notification: " + message);
  }
}

abstract class DecorateNotification implements Notification {
  protected Notification notification;
  
  DecorateNotification(Notification notification) {
    this.notification = notification;
  }

  @Override
  public void send(String message) {
    this.notification.send(message);
  }
}

class NotificationEmail extends DecorateNotification {
  NotificationEmail(Notification notification) {
    super(notification);
  }

  @Override
  public void send(String message) {
    this.notification.send(message);
    System.out.println("send Email notification: " + message);
  }
}

class NotificationSMS extends DecorateNotification {
  NotificationSMS(Notification notification) {
    super(notification);
  }

  @Override
  public void send(String message) {
    this.notification.send(message);
    System.out.println("Send SMS notification: " + message);
  }
}

public class Notifications {
  public static void main(String[] args) {
    Notification notification = new BasicNotification();

    notification = new NotificationEmail(notification);
    notification = new NotificationSMS(notification);

    notification.send("Hello!");
  }
}
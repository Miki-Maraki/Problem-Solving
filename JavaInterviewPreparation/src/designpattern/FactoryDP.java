package designpattern;

public class FactoryDP {
	
	public interface Notification {//Create Notification interface 
	    void notifyUser();
	}  //Note- Above interface could be created as an abstract class as well. 
	   //Create all implementation classes 

	public class SMSNotification implements Notification {	 
	    @Override
	    public void notifyUser() {
	        // TODO Auto-generated method stub
	        System.out.println("Sending an SMS notification");
	    }
	}
	public class EmailNotification implements Notification {
	    @Override
	    public void notifyUser() {
	        // TODO Auto-generated method stub
	        System.out.println("Sending an e-mail notification");
	    }
	}
	public class PushNotification implements Notification { 
	    @Override
	    public void notifyUser() {
	        // TODO Auto-generated method stub
	        System.out.println("Sending a push notification");
	    }
	}
	
	//Create a factory class NotificationFactory.java to instantiate concrete class. 
	public class NotificationFactory {
	    public Notification createNotification(String channel) {
	        if (channel == null || channel.isEmpty())
	            return null;
	        if ("SMS".equals(channel)) {
	            return new SMSNotification();
	        }
	        else if ("EMAIL".equals(channel)) {
	            return new EmailNotification();
	        }
	        else if ("PUSH".equals(channel)) {
	            return new PushNotification();
	        }
	        return null;
	    }
	}
	//Now let’s use factory class to create and get an object of concrete class by passing some information.
	public class NotificationService {
	    public void main(String[] args) {
	        NotificationFactory notificationFactory = new NotificationFactory();
	        Notification notification = notificationFactory.createNotification("SMS");
	        notification.notifyUser();
	    }
	}
}

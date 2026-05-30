interface Notifications
{
	void sendmessage(String message);
	void receivemessage(String message);
	static  void instanotifications(String message)
	{
		System.out.println(message+" You have a new post to view");
	}
	default  void Whatsappnotification(String message)
	{
		System.out.println("This is from whatsapp"+message);
	}
}
class MobileNotification implements Notifications
{
	public void sendmessage(String message)
	{
		System.out.println(message+ " sent successfully through SMS");
	}
	public void receivemessage(String message)
	{
		System.out.println(message+ " received successfully through SMS");
	}
	public  void Whatsappotification(String message)
	{
		System.out.println(message+" It is from Whatsapp");
	
}
}
class EmailNotification implements Notifications
{
	public void sendmessage(String message)
	{
		System.out.println(message+ " sent successfully through Email");
	}
	public void receivemessage(String message)
	{
		System.out.println(message+ " received successfully through Email");
	}
}
public class Interface {

	public static void main(String[] args) {
		MobileNotification mobile=new MobileNotification();
		System.out.println("SMS Notifications");
		mobile.sendmessage("HIII");
		mobile.receivemessage("Hello");
		System.out.println();
		System.out.println("Whatsapp Notification");
		mobile.Whatsappotification("Rashi");
		EmailNotification email=new EmailNotification();
		System.out.println();
		System.out.println("Email Notifications");
		email.sendmessage("Welcome");
		email.receivemessage("Thank you");
		System.out.println();
		System.out.println("Instagram Notification");
		Notifications.instanotifications("Rashmi");
		// TODO Auto-generated method stub

	}
}



/*interface cash
{
	void cash(int a);
}
interface upi
{
	void UPI(int b);
}
class Payment implements cash,upi
{
	public void cash(int a)
	{
		System.out.println("Payment through Cash Accepted");
		System.out.println("Amount="+a);
	}
	public void UPI(int a)
	{
		System.out.println("Payment through UPI ACCEPTED");
		System.out.println("Amount="+a);
	}
}
public class Interface {

	public static void main(String[] args) {
		Payment pay=new Payment();
		pay.cash(45000);
		pay.UPI(50000);
		// TODO Auto-generated method stub

	}

}*/



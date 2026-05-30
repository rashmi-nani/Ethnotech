import java.util.*;
abstract class Foodorder
{
	String customername;
	int quantity;
	Foodorder(String customername,int quantity)
	{
		this.customername=customername;
		this.quantity=quantity;
	}
	void welcome()
	{
		System.out.println("***Welcome and Order anything you need***");
	}
	abstract void discount();
	abstract void bill();
	abstract void orderfood();
	abstract void checkavailability();

}
	class Momo extends Foodorder
	{
		Momo(String customername,int quantity)
		{
			super(customername,quantity);
			super.welcome();
		}
			void checkavailability()
			{
				//System.out.println("Total Number of Momos Pack availabe:");
				int availability=20;
				if(availability<quantity)
				{
					System.out.println("Only Available Momos pack are:"+availability);
					System.out.println("Order within the availability");
				}
				else
				{
					System.out.println("Yes !!! It is Available");
					//int remaining=availability-quantity;
					//System.out.println("Remaining available Momos pack are:"+remaining);
				}
			}
			

			void discount()
			{
				System.out.println();
				System.out.println("Discount : 2%");
			}
			void bill()
			{
				System.out.println();
				double total=50*quantity;
				double discount=total*0.02;
				double finalamount=total-discount;
				System.out.println();
				System.out.println("****BILL*****");
				System.out.println("Customer Name:"+customername);
				System.out.println("Item name:Momo");
				System.out.println("Quantity ordered:"+quantity);
				System.out.println("Price per item:50");
				System.out.println("Amount:"+total);
				System.out.println("Total amount(Discount(2%)):"+finalamount);
				//System.out.println("_____THANK YOUU______");
			}
			void orderfood()
			{
				System.out.println("Order placed successfully...");
				System.out.println("_____THANK YOUU______");

			}
	}
class Pizza extends Foodorder
	{
		Pizza(String customername,int quantity)
		{
			super(customername,quantity);
			super.welcome();
		}
			void checkavailability()
			{
				//System.out.println("Total Number of Momos Pack availabe:");
				int availability=25;
				if(availability<quantity)
				{
					System.out.println("Only Available Momos pack are:"+availability);
					System.out.println("Order within the availability");
				}
				else
				{
					System.out.println("Yes !!! It is Available");
					//int remaining=availability-quantity;
					//System.out.println("Remaining available Momos pack are:"+remaining);
				}
			}

			void discount()
			{
				System.out.println();
				System.out.println("Discount : 4%");
			}
			void bill()
			{
				System.out.println();
				double total=250*quantity;
				double discount=total*0.04;
				double finalamount=total-discount;
				System.out.println();
				System.out.println("****BILL*****");
				System.out.println("Customer Name:"+customername);
				System.out.println("Item name:Pizza");
				System.out.println("Quantity ordered:"+quantity);
				System.out.println("Price per item:250");
				System.out.println("Amount:"+total);
				System.out.println("Total amount(Discount(4%)):"+finalamount);
				//System.out.println("_____THANK YOUU______");
			}
			void orderfood()
			{
				System.out.println("Order placed successfully...");
				System.out.println("_____THANK YOUU______");

			}
	}
class Biryani extends Foodorder
	{
		Biryani(String customername,int quantity)
		{
			super(customername,quantity);
			super.welcome();
		}
			void checkavailability()
			{
				//System.out.println("Total Number of Momos Pack availabe:");
				int availability=100;
				if(availability<quantity)
				{
					System.out.println("Only Available Momos pack are:"+availability);
					System.out.println("Order within the availability");
				}
				else
				{
					System.out.println("Yes !!! It is Available");
					//int remaining=availability-quantity;
					//System.out.println("Remaining available Momos pack are:"+remaining);
				}
			}

			void discount()
			{
				System.out.println();
				System.out.println("Discount : 8%");
			}
			void bill()
			{
				System.out.println();
				double total=200*quantity;
				double discount=total*0.08;
				double finalamount=total-discount;
				System.out.println();
				System.out.println("****BILL*****");
				System.out.println("Customer Name:"+customername);
				System.out.println("Item name:Biryani");
				System.out.println("Quantity ordered:"+quantity);
				System.out.println("Price per item:200");
				System.out.println("Amount:"+total);
				System.out.println("Total amount(Discount(8%)):"+finalamount);
				//System.out.println("_____THANK YOUU______");
			}
			void orderfood()
			{
				System.out.println("Order placed successfully...");
				System.out.println("_____THANK YOUU______");

			}
	}


	
public class Abstraction
{
	public static void main(String args[])
	{
		System.out.println("\n Available Items:");
		System.out.println("\n 1.MOMOS ");
		System.out.println("\n 2.Pizza ");
		System.out.println("\n 3.Biryani ");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name:");
		String name=sc.nextLine();
		System.out.println("Enter Item number:");
		int itemno=sc.nextInt();
		System.out.println("Enter Quantity:");
		int q=sc.nextInt();
		Foodorder order=null;
		switch(itemno)
		{
			case 1:
				order=new Momo(name,q);
				break;
			case 2:
				order=new Pizza(name,q);
				break;
			case 3:
				order=new Biryani(name,q);
				break;

			default:
				System.out.println("item no available");
				System.out.println("please Enter available choice(items)");
		}
		order.checkavailability();
		order.discount();
		order.bill();
		order.orderfood();

				
	
	}
}
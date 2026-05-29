abstract class Foodorder
{
	String customername;
	int quantity;
	double price;
	String itemname;
	Foodorder(String name,int q,double p,String food)
	{
		this.customername=name;
		this.quantity=q;
		this.price=p;
		this.itemname=food;
	}
	void welcome()
	{
		System.out.println("***Welcome and Order anything you need***");
	}
	abstract void orderfood();
	void generatebill()
	{
		double total=quantity*price;
		System.out.println("Customer name:"+this.customername);
		System.out.println("Item name:"+this.itemname);
		System.out.println("Quantity:"+this.quantity);
		System.out.println("Price per item:"+this.price);
		System.out.println("Total Price:"+total);
	}
}
	class Momo extends Foodorder
	{
		Momo(String name,int q,double p,String item)
		{
			super(name,q,p,item);
			super.welcome();
			super.generatebill();
		}
			void orderfood()
			{
				System.out.println("Order placed successfully...");
			}
	}
	
public class Abstraction
{
	public static void main(String args[])
	{
		 Foodorder f=new Momo("Rashmi",2,150.2,"Momo");
	}
}
class Inherit extends Bank
{
	public Inherit(String name,int balance,int accno,String acctype)
	{
		super(name,balance,accno,acctype);
	}
		
	public static void main(String args[])
	{
		Bank b=new Bank("Rashmi",5000,123,"Savings");
		b.display();
		b.checkbalance();
		b.withdraw(123,12000);
		b.deposit(123,5000);
		b.display();
	}
}
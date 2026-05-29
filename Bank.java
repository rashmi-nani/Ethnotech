public class Bank
{
	String name;
	int balance;
	int accountno;
	String accounttype;
	Bank(String s,int b,int accno,String acnttype)
	{
		this.name=s;
		this.balance=b;
		this.accountno=accno;
		this.accounttype=acnttype;
	}
	public void checkbalance()
	{
		System.out.println("Available Balanace:"+this.balance);
	}
	public void withdraw(int accno,int amount)
	{
		if(this.accountno==accno)
		{
			if(this.balance>=amount)
			{
				this.balance=balance-amount;
			System.out.println("Withdrawal successfully completed");
			System.out.println("Balance = "+this.balance);
			}
			else
			{
				System.out.println("Available Balance is Low");
			}
		}
		else
		{
			System.out.println("Incorrect account number");
		}
	}
	public void deposit(int accno,int deposit)
	{
		if(this.accountno==accno)
		{
			this.balance=this.balance+deposit;
			System.out.println("Deposit Successful");
			System.out.println("Available Balance:"+this.balance);
		}
		else
		{
			System.out.println("Incorrect account number");
		}
	}
	public void display()
	{
		System.out.println("Account Holder Name : "+this.name);
		System.out.println("Account Number : "+this.accountno);
		System.out.println("Available Balance : "+this.balance);
		System.out.println("Account Type : "+this.accounttype);
	}
}
	
	
	
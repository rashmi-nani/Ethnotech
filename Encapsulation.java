/*class student
{
	private int id;
	public void setId(int id)
	{
		this.id=id;
	}
	public int getId()
	{
		return id;
	}
}
public class id
{
public static void main(String args[])
{
	student s=new student();
	s.setId(101);
	System.out.print(s.getId());
}
}*/
class Balance
{	
	private int balance;
	public void setbalance(int balance)
	{
		this.balance=balance;
	}
	public int getbalance()
	{
		return balance;
	}

public static void main(String args[])
{
	Balance s=new Balance();
	s.setbalance(5000);
	System.out.print(s.getbalance());
}
}

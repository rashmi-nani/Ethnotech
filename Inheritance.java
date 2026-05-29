class Employee
{
	public void  Employee()
	{
		System.out.println("Employee Name: Nani");
	}
}
class Salary extends Employee
{
	Employee e=new Employee();
	public void salary()
	{
	e.Employee();
	System.out.println("Salary: 50,000");
		}
}
class Role extends Salary {

	Salary s=new Salary();
	public void Role(String str)
	{
		s.salary();
		System.out.println("Role:"+str);
	}
}
public class Inheritance
{
	public static void main(String args[])
	{
		Role r=new Role();
		r.Role("Tester");
		r.Role("Devops");
		r.Role("Developer");
	}
}
	





/*
class Addition
{
	public void add(int a,int b)
	{
		int c=a+b;
		
	System.out.println("Addition of two numbers:"+c);
	}
}
class Subtraction extends Addition{
	Addition ad=new Addition();
	public void sub(int a,int b)
	{
		ad.add(a,b);
		
		int c=a-b;
		
	System.out.println("Subtraction of two numbers:"+c);
	}
}
class Multiplication extends Subtraction
{
	Subtraction s=new Subtraction();
	public void mul(int a,int b)
	{
		s.sub(a,b);
		int c=a*b;
		System.out.println("Multiplication of two numbers:"+c);
	}
}
class Division extends Multiplication
{
	Multiplication m=new Multiplication();
	public void div(int a,int b)
	{
		m.mul(a,b);
		
		int c=a/b;
		System.out.println("Division of two numbers:"+c);
	}
}
		

public class Inheritance
{
	public static void main()
	{
	
	Division d=new Division();
	
	d.div(10,2);
	
}
}*/
	
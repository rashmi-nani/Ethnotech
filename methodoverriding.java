class UBER
{
	public int BOOKARIDE()
	{
		System.out.println("Booking A Ride");
		return 0;
	}
}
class Bike extends UBER
{
	public int BOOKARIDE()
	{
		System.out.println("BIKE RIDE:");
		System.out.print("The Fare Amount is:80Rs");
		return 80;
	}
}
class Auto extends UBER
{

	public int BOOKARIDE()
	{
		System.out.println();
		System.out.println("AUTO RIDE:");
		System.out.print("The Fare Amount is:170RS");
		return 170;
	}
}
class Car extends UBER
{
	public int BOOKARIDE()
	{
		System.out.println();
		System.out.println("CAR RIDE:");
		System.out.println("The Fare Amount is:300RS");
		return 300;
	}
}


public class methodoverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		UBER ride=new UBER();
		ride.BOOKARIDE();
		Bike bike=new Bike();
		int b=bike.BOOKARIDE();
		Auto auto=new Auto();
		int a=auto.BOOKARIDE();
		Car car=new Car();
		int c=car.BOOKARIDE();
		if(b<a&&b<c)
		{
			System.out.println("The vehicle choosen is BIKE");
			System.out.println("The amount is "+b);
			
		}
		else if(a<b&&a<c)
		{
			System.out.println("The vehicle choosen is AUTO");
			System.out.println("The amount is "+a);
		}
		else
		{
			System.out.println("The vehicle choosen is CAR");
			System.out.println("The amount is "+c);
		}
		
		
		

	}

}

/*class employeesalary
{
	public void calculatesalary()
	{
		System.out.println("Calculating Employee Salary");
	}
}
class Fulltimeemployee extends employeesalary
{
	public void calculatesalary()
	{
		System.out.println("FULL TIME EMPLOYEE");
		System.out.println("calculating employee salary:50000");
	}
}
class Internmeemployee extends employeesalary
{
	public void calculatesalary()
	{
		System.out.println("INTERN");
		System.out.println("calculating employee salary:25000");
	}
}
class Remoteemployee extends employeesalary
{
	public void calculatesalary()
	{
		System.out.println("REMOTE EMPLOYEE");
		System.out.println("calculating employee salary:52000");
	}
}
class Hybridemployee extends employeesalary
{
	public void calculatesalary()
	{
		System.out.println("HYBRID EMPLOYEE");
		System.out.println("calculating employee salary:55000");
	}
}

public class methodoverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		employeesalary e=new employeesalary();
		e.calculatesalary();
		Fulltimeemployee ft=new Fulltimeemployee();
		ft.calculatesalary();
		Internmeemployee intern=new Internmeemployee();
		intern.calculatesalary();
		Remoteemployee rm=new Remoteemployee();
		rm.calculatesalary();
		Hybridemployee h=new Hybridemployee();
		h.calculatesalary();
		
		

	}

}*/
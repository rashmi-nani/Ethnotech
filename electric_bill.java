

import java.util.*;
public class Electric_bill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int units=sc.nextInt();
		int bill=0;
		if(units>250)
		{
			int extra=(units-250);
			int blocks=(extra+49)/50;
			bill=(blocks<<5)+(blocks<<4)+(blocks<<1);
			
		}
		System.out.println(bill);

	}

}
=======
package util;
import java.util.*;
public class Electric_bill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int units=sc.nextInt();
		int bill=0;
		if(units>250)
		{
			int extra=(units-250);
			int blocks=(extra+49)/50;
			bill=(blocks<<5)+(blocks<<4)+(blocks<<1);
			
		}
		System.out.println(bill);

	}

}
>>>>>>> 1f0c5f00da84425faed3d553ccff4a8f52f8c995


import java.util.*;
public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> list=new LinkedList<>();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			String s=sc.next();
			list.add(s);
		}
		System.out.println("Student List:"+list);
		sc.close();

	}

}

//store Temperatures of 30 days and find highest,lowest,average,no of hot days(>35)
import java.util.*;
public class temperature {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int min=arr[0];
		int max=arr[0];
		System.out.println("The Hot Days are:");
		int count=0;
		int sum=0;
		for(int num:arr)
		{
			sum+=num;
			if(num>max)
			{
				max=num;
			}
			if(num<min)
			{
				min=num;
			}
			if(num>35)
			{
				System.out.println(num+" ");
				count++;
			}
			
		}
		float avg=sum/n;
		System.out.println("The number of Hot Days are: "+count);
		System.out.println("MAXIMUM TEMPERATURR: "+max);
		System.out.println("MINIMUMTEMPERATURR: "+min);
		System.out.println("The Average is:"+avg);
		

	}

}

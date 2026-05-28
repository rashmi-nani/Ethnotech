
import java.util.*;
public class product_of_array {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		// TODO Auto-generated method stub
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int p=1;
		for(int i=0;i<n;i++)
		{
			p=1;
		
			for(int j=0;j<n;j++)
			{
				if(i!=j)
				{
			
					p*=arr[j];
			}
			}

			System.out.print(p+" ");
			
		}

	}
}

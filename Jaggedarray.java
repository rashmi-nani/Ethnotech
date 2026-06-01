

public class Jaggedarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr=new int[3][];
		arr[0]=new int[3];
		arr[1]=new int[4];
		arr[2]=new int[5];
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i][j]=(i+10)*(j+10);
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();

	}
	}
}

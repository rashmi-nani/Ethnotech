
import java.util.*;
public class Playlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>Playlist=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the no of songs:");
		int n=sc.nextInt();
		System.out.println("Enter the song names");
		for(int i=0;i<n;i++)
		{
			System.out.print((i+1)+". ");
			String s=sc.next();
			Playlist.add(s);
			System.out.println();
		}
		for(String k:Playlist)
		{
			System.out.println(k+" ");
		}
		Playlist.remove(2);
		System.out.println("After removing of song");
		System.out.println(Playlist);
		System.out.println("Song at index 3:"+Playlist.get(3));
		System.out.println("Run Away song contains:"+Playlist.contains("run away"));
		System.out.println("Final Playlist:"+Playlist);
		sc.close();
		
		

	}

}

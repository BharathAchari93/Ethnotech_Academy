import java.util.*;
class Arraylist
{
	public static void main(String args[])
	{
		ArrayList<String> playlist = new ArrayList<>();
		playlist.add("Dreamer");
		playlist.add("Beliver");
		playlist.add("Sharawat");
		playlist.add("Natu Natu");
		playlist.add("Globetrotter");
		System.out.println(playlist);
		playlist.remove(playlist.get(0));
		System.out.println(playlist);
		System.out.println(playlist.size());
		System.out.println(playlist.contains("Harsha"));
		System.out.println(playlist.contains("Globetrotter"));
		for(String s : playlist)
		{
			System.out.print(s+" ");
		}
	}
}

package example.sorting;

import java.util.ArrayList;
import java.util.Collections;

import in.co.sunrays.api.Song;
import in.co.sunrays.util.Myutil;

public class MP4 {

	public static void main(String[] args) {
		
		Song song1 = new Song("Bol do na zara", "Arjit", 2010);
		Song song2 = new Song("Besabriya", "Arjit", 2014);
		Song song3 = new Song("pahla nasha", "Arjit", 2000);
		Song song4 = new Song("thodi der or theharja", "Arjit", 2008);
		Song song5 = new Song("O mere dil mubarak ho", "Arjit", 1999);
		
		ArrayList<Song> musiclist = new ArrayList<>();
		
		musiclist.add(song1);
		musiclist.add(song2);
		musiclist.add(song3);
		musiclist.add(song4);
		musiclist.add(song5);
		
		Myutil.iteratelist(musiclist);
		
		 Collections.sort(musiclist);
		 
		 System.out.println("After sorting=====");
		 
		 Myutil.iteratelist(musiclist);
		
		
	}
}

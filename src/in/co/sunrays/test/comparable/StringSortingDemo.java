package in.co.sunrays.test.comparable;

import java.util.ArrayList;
import java.util.Collections;

import in.co.sunrays.util.Myutil;

public class StringSortingDemo {

	public static void main(String[] args) {
		
		ArrayList<String> Musiclist = new ArrayList<>();
		Musiclist.add("tera hone laga hu");
		Musiclist.add("piya ore piya");
		Musiclist.add("kaise gaye ho jata hai koi");
		Musiclist.add("dil thod ke hasti");
		Musiclist.add("bol dona zara");
		
	Myutil.iteratelist(Musiclist);
		
		Collections.sort(Musiclist);
		System.out.println("after sorting ======================");
		
		Myutil.iteratelist(Musiclist);
	}

	
}

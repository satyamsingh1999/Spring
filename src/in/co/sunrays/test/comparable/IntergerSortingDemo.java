package in.co.sunrays.test.comparable;

import java.util.ArrayList;
import java.util.Collections;

import in.co.sunrays.util.Myutil;

public class IntergerSortingDemo {

	public static void main(String[] args) {

		ArrayList<Integer> Integerlist = new ArrayList<Integer>();
		Integerlist.add(12);
		Integerlist.add(2);
		Integerlist.add(16);
		Integerlist.add(4);
		Integerlist.add(23);
		Integerlist.add(7);
		Integerlist.add(50);

		Myutil.iteratelist(Integerlist);
		System.out.println("==============");
		Collections.sort(Integerlist);

		Myutil.iteratelist(Integerlist);
	}

	
}

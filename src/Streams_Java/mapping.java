package Streams_Java;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class mapping {

	public static void main(String[] args) {
		ArrayList<Integer>l=new ArrayList<Integer>();
		l.add(5);
		l.add(25);
		l.add(15);
		l.add(55);
		l.add(85);
		l.add(35);
		l.add(10);
		l.add(20);
		System.out.println("before mapping::"+l);
		List<Integer>d=l.stream().map(i->i*2).collect(Collectors.toList());
	     System.out.println("after mapping::"+d);

	}

}

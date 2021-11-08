package Stream_methods;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Collect_Method {

	public static void main(String[] args) {
		ArrayList<String>l=new ArrayList<String>();
		l.add("gururaj");
		l.add("sharma");
		l.add("chennai");
		l.add("hyderabad");
		l.add("bangalore");
		System.out.println("before filter"+l);
		List<String>l1=l.stream().filter(s->s.length()>=5).collect(Collectors.toList());
              System.out.println("after filter:"+l1);
	}

}

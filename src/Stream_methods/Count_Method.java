package Stream_methods;

import java.util.ArrayList;

public class Count_Method {

	public static void main(String[] args) {
		
		ArrayList<String>l=new ArrayList<String>();
		l.add("gururaj");
		l.add("sharma");
		l.add("hyderabad");
		l.add("bangalore");
		l.add("new delhi");
		l.add("kolkatta");
		l.add("chennai");
		System.out.println("before count:"+l);
	  long c=l.stream().filter(s->s.length()>=5).count();
	  System.out.println("after counting::"+c);
		
		
		

	}

}

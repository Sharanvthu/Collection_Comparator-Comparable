import java.util.ArrayList;
import java.util.Collections;

public class SortUsingAl {

	public static void main(String[] args) {
		car c1=new car(150);
		car c2=new car(200);
		car c3=new car(100);
		ArrayList<car> al=new ArrayList<car>();
		al.add(c1);
		al.add(c2);
		al.add(c3);
		System.out.println("Before sorting using arraylist");
		for (car c : al) {
			System.out.println(c);
			
		}
		Collections.sort(al,new SortByCost());
		System.out.println("after sorting using arraylist");
		for (car c : al) {
			System.out.println(c);
			
		}
		
	}

}

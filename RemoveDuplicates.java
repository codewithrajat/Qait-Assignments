import java.util.*;
public class RemoveDuplicates {

	public static void main(String[] args) {
		ArrayList l1 = new ArrayList();
		l1.add(1);
		l1.add(3);
		l1.add(4);
		l1.add(5);
		l1.add(4);
		l1.add(1);
		l1.add(3);
		l1.add(7);
		l1.add(9);
		l1.add(10);
	
		ArrayList l2 = new ArrayList();
		for(int i = 0 ; i <l1.size() ; i++)
		{
			if(!l2.contains(l1.get(i)))
			{
				l2.add(l1.get(i));
			}
		}
		System.out.println(l1);
		System.out.println(l2);
	}

}

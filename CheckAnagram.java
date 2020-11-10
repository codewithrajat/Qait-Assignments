import java.util.*;
public class CheckAnagram {
	public boolean checkAnagram(String s1 , String s2) {
		int l1 = s1.length();
		int l2 = s2.length();
		char ch1[] = new char[l1];
		char ch2[] = new char[l2];
		if(l1 == l2) {
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			for(int i = 0 ; i < l1 ; i++)
			{
				if(ch1[i] != ch2[i])
				{
					return false;
				}
			}
		}
		else {
			return false;
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st String : ");
		String s1 = sc.next();
		System.out.println("Enter 2nd String : ");
		String s2 = sc.next();
		CheckAnagram ca = new CheckAnagram();
		boolean result = ca.checkAnagram(s1, s2);
		if(result) {
			System.out.println(s1 + " and " + s2 + " are Anagram");
		}else {
			System.out.println(s1 + " and " + s2 + " are not Anagram");
		}
		

	}

}

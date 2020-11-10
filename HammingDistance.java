import java.util.*;
public class HammingDistance {
	public void hammingDistance(int a , int b)
	{
		String s1=Integer.toBinaryString(a);
		String s2=Integer.toBinaryString(b); 
		int temp=0;
		if(s1.length()>s2.length())
		{
			temp = s1.length()-s2.length();
			String s = s2;
			s2="0";
			for(int i=0 ; i<temp-1 ; i++)
			{
				s2 +="0";
			}
			s2=s2+s;
		}
		else if(s2.length()>s1.length())
		{
			temp = s2.length()-s1.length();
			String s = s1;
			s1="0";
			for(int i=0 ; i<temp-1 ; i++)
			{
				s1 +="0";
			}
			s1=s1+s;
		}
		
		int count =0;
		System.out.println(s1);
		for(int i =0 ; i < s1.length() ; i ++)
		{
			if(s1.charAt(i) != s2.charAt(i))
			{
				count++;
			}
		}
		System.out.println(count);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number : ");
		int a = sc.nextInt();
		System.out.println("Enter Second Number : ");
		int b = sc.nextInt();
		HammingDistance hd = new HammingDistance();
		hd.hammingDistance(a, b);
	}

}

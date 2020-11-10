import java.util.*;
public class ReverseNumber {
	
	public int reverseNumber(int n) {
		int reverse=0,remainder;
		while(n>0 ) {
			remainder=n%10;
			reverse = reverse*10 + remainder;
			n/=10;
		}
		return reverse;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n = sc.nextInt();
		ReverseNumber rn = new ReverseNumber();
		sc.close();
		System.out.println(rn.reverseNumber(n));
	}
}

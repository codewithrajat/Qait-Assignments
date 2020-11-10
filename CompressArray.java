import java.util.*;

public class CompressArray {
	public void compressArray(String s) {
		char arr[]= s.toCharArray();
		ArrayList output = new ArrayList();
		System.out.println(arr);
		int count =0;
		for(int i = 0 ; i < arr.length ; i++)
		{	
			output.add(arr[i]);
			count =1 ;
			for(int j = i+1 ; j < arr.length ; j++)
			{
				if(arr[i] == arr[j])
				{
					count++;
				}else {
					break;
				}			
			}
			if(count>1)
			{
				output.add(count);	
			}
			i=i+count-1;
		}
		System.out.println(output);
		
		
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String s = sc.next();
		CompressArray ca = new CompressArray();
		ca.compressArray(s);

	}

}

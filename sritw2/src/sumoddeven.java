import java.util.Scanner;
public class sumevenodd {
	public static void main(String[] args) {
		int n,sumEven=0; sumOdd=0;
		for(int i=1; i<100; i++) 
		{
			if (i%2==0)
				sumEven+=i;
			else
				sumOdd+=i;
			}
		System.out.println("sum of even: "+sumEven+ " sum of odd: "+sumOdd);
	}
}

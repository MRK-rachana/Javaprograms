import java.util.Scanner;
public class Small_Lagre {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter Array Size");
		int s=sc.nextInt();
		int []Arr=new int[s];
		int big=Integer.MIN_VALUE;
		int secondBig=Integer.MIN_VALUE;
		int small=Integer.MAX_VALUE;
		int secondSmall=Integer.MAX_VALUE;
		for(int i=0; i<s; i++)
		{
			System.out.println("Arr["+i+"]: ");
			Arr[i]=sc.nextInt();	
		}
		if(s>2)
		{
			for(int n: Arr) 
			{
				if(n>big)
				{
					secondBig=big;
					big=n;
				}
				else if(n>secondBig && secondBig!=big)
				{
					secondBig=n;
				}
		
		if(n<small)
		{
			secondSmall=small;
			small=n;
		}
		else if(n<secondSmall && secondSmall!=small)
		{
			secondSmall=n;
			}
		}
	}
		else
		{
			System.out.println("2 element array not possible");
		}
		System.out.println("Big: "+big+"second Big: "+secondBig);
		System.out.println("Small: "+small+"second Small: "+secondSmall);
		
		
			}
		}
	
		
		


import java.util.Scanner;
public class sum {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,sum=0;
		for(int i=0; i<10; i++)
		{
			System.out.println("enter "+(i+1)+"st/th number: ");
			n=sc.nextInt();
			sum+=n;
		}
		System.out.println("Sum: "+sum);
	}
}

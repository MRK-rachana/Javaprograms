import java.util.Scanner;

public class Agevalid {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age:");
		int year=sc.nextInt();
		if((year%4==0)||(year%4==0 && year%100==0))
		{
			System.out.println("leap year");
		}
		else
		{
			System.out.println("not a leap year");
		}
	}

}import java.util.S

import java.util.Scanner;
public class SumOfEvenArray {
	

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Array Size:");
			int s=sc.nextInt();
			int sum=0;
			int Arr[]=new int[s];
			for(int i=0;i<Arr.length;i++) {
				System.out.println("Arr["+i+"]:");
				Arr[i]=sc.nextInt();
			}
			for(int c:Arr) 
			{
				if(c%2==0) 
				{
				System.out.print(" "+c);
				sum+=c;
			}
			}
			System.out.println("\nSum of Even Array Elements: "+sum);
		}

	}


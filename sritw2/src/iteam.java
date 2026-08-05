import java.util.Scanner;
public class iteam {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int option,itemNumber,quantity;
		double rate,price;
		String itemName;
		do {
			System.out.println("Enter item number");
			itemNumber=sc.nextInt();
			System.out.println("Enter item name");
			sc.nextLine();
			itemName=sc.nextLine();
			System.out.println("Enter rate");
			rate=sc.nextDouble();
			System.out.println("Enter Quantity");
			quantity=sc.nextInt();
			price=rate*quantity;
			System.out.println("item numer: "+itemNumber+"Name: "+itemName+ " rate: "+rate+ " Quantity: "+quantity);
			System.out.println("Enter option");
			option=sc.nextInt();
	} while(option!=-1);
		System.out.println("Thank you!!");
		
}
}

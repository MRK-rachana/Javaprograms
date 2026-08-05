import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number, sum = 0;

        System.out.println("Enter numbers (enter 0 to stop):");

        while (true) {
            number = sc.nextInt();  
            if (number == 0) {
                break;  
            }
            sum += number;  
        }

        System.out.println("The sum of entered numbers is: " + sum);
        sc.close();
    }
}
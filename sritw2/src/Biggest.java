
public class Biggest {
	    public static void main(String[] args) {
	        int[] numbers = {1, 8, 9, 11, 12, 14, 18, 52, 24, 65};

	        int largest = numbers[0]; 

	        for (int i = 1; i < numbers.length; i++) {
	            if (numbers[i] > largest) {
	                largest = numbers[i];
	            }
	        }

	        System.out.println("The biggest number is: " + largest);
	    }
	}



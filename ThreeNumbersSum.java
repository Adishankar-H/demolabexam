import java.util.Scanner;

public class ThreeNumbersSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = input.nextInt();

        int largest = Math.max(Math.max(num1, num2), num3);
        int sum = num1 + num2 + num3;
	
	double average = (double) sum / 3;

        System.out.println("The sum of the largest number is: " + (sum - largest));
	//System.out.println("The average of the three numbers is: " + average);	

        input.close();
    }
}

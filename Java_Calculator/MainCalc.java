package Calculator;
import java.util.*;

public class MainCalc {
	public static double add(double a, double b) {
		return a + b;
	}
	public static double sub(double a, double b) {
		return a - b;
	}
	public static double mult(double a, double b) {
		return a * b;
	}
	public static double divide(double a, double b) {
		if(b != 0) {
			return a / b;
		}else {
			System.out.println("Enter valid denominator");
			return Double.NaN;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to JAVA Calculator");
		System.out.println("Please follow the following instructions: ");
		while(true) {
			System.out.println("Enter 1 for addition");
			System.out.println("Enter 2 for subtraction");
			System.out.println("Enter 3 for multiplication");
			System.out.println("Enter 4 for division");
			System.out.println("Enter 5 for exit");
			
			System.out.println("Now enter your choice: ");
			String choose = sc.nextLine();
			
			if(choose.equals("1")) {
				System.out.println("Enter your first number: ");
				double a = sc.nextDouble(); sc.nextLine();
				System.out.println("Enter your second number: ");
				double b = sc.nextDouble(); sc.nextLine();
				double result = add(a, b);
				System.out.println("Your result is: "+ result);
			}
			else if(choose.equals("2")) {
				System.out.println("Enter your first number: ");
				double a = sc.nextDouble(); sc.nextLine();
				System.out.println("Enter your second number: ");
				double b = sc.nextDouble(); sc.nextLine();
				double result = sub(a, b);
				System.out.println("Your result is: "+ result);
			}
			else if(choose.equals("3")) {
				System.out.println("Enter your first number: ");
				double a = sc.nextDouble(); sc.nextLine();
				System.out.println("Enter your second number: ");
				double b = sc.nextDouble(); sc.nextLine();
				double result = mult(a, b);
				System.out.println("Your result is: "+ result);
			}
			else if(choose.equals("4")) {
				System.out.println("Enter your first number: ");
				double a = sc.nextDouble(); sc.nextLine();
				System.out.println("Enter your second number: ");
				double b = sc.nextDouble(); sc.nextLine();
				double result = divide(a, b);
				System.out.println("Your result is: "+ result);
			}
			else if (choose.equals("5")){
				System.out.println("Thank you for using the calculator");
				break;
			}
			else{
				System.out.println("Invalid choice! Pleae choose new valid option!");
			}
		}
		
		
	}
}

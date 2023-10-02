package GuessNumber;
import java.util.*;

public class GuessTheNumber {
	public static void Guess() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome in the game the Number Guess!");
		int k = 5;
		int randomNumber = (int)(Math.random()*10 + 1);
		for(int i = 0; i < k; i++) {
			System.out.println("Enter your guess: ");
			int n = sc.nextInt(); sc.nextLine();
			if(n == randomNumber && i!= k - 1) {
				System.out.println("Yay! You guessed it right");
				System.out.println("The number was: " + n);
				break;
			}
			else if (n != randomNumber && i != k - 1){
				System.out.println("No, the guess is wrong");
				System.out.println("Try again!");
			}
			else {
				System.out.println("Sorry, you have lost all the chances!");
				System.out.println("The correct number was: " + randomNumber);
			}
		}
		
	}
	public static void main(String[] args) {
		Guess();
	}
}

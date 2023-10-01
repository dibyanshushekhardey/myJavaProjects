package QuizGame;
import java.util.*;

public class Quiz {
	private static int correct = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the quiz game!");
		System.out.println("Enter your name: ");
		String name = sc.nextLine();
		System.out.println("Welcome " + name);
		
		question("What is the capital of Australia?", 
				"A. Melbourne", "B. Sydney", "C. Canberra", "D. Perth", 
				"C");
		question("Who is the speaker of the US House of Representatives", 
				"A. Hakeen Jeffries", "B. Kevin Mccarthy", "C. Chuk Schumer", "D. Mitch Mcconnell", 
				"B");
		question("Which of the following group does TCS belong to", 
				"A. Tata", "B. Chick o' file", "C. Sun Microsystems", "D. Walmart", 
				"A");
		
		System.out.println("The results are as follows: ");
		System.out.println("Correct: "+correct);
		
	}
	public static void question(String q, String a, String b, String c, String d, String k) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("This is your Question!");
		System.out.println(q);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		System.out.println("Enter your choice");
		String ans = in.nextLine();
		if(ans.equalsIgnoreCase(k)) {
			System.out.println("That's correct answer!");
			correct++;
		}else {
			System.out.println("Sorry, unfortunately its the incorrct answer!");
			System.out.println("The correct answer is " + k);
			correct += 0;
		}
	}
	
}

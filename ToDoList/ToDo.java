package ToDoList;
import java.util.*;

public class ToDo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> arr = new ArrayList<String>();
		
		System.out.println("Following are the instructions: ");
		System.out.println("Enter 'q' to exit the program ");
		System.out.println("Enter 'a' to add a task in the list");
		System.out.println("Enter 's' to show the tasks added in the list");
		
		while(true) {
			System.out.println("Enter your choice: ");
			String choice = sc.nextLine();
			
			if(choice.equalsIgnoreCase("q")) {
				System.out.println("Thank you for using this program! ");
				break;
			}
			else if(choice.equalsIgnoreCase("a")) {
				System.out.println("Okay then, add your task!");
				String task = sc.nextLine();
				arr.add(task);
			}
			else if(choice.equalsIgnoreCase("s")) {
				System.out.println("Here is the list you created!");
				System.out.println("-----------------------------");
				for(String task1 : arr) {
					System.out.println(task1);
				}
			}else {
				System.out.println("Sory wrong choice, please look the instructions below!");


				System.out.println("Following are the instructions: ");
				System.out.println("Enter 'q' to exit the program ");
				System.out.println("Enter 'a' to add a task in the list");
				System.out.println("Enter 's' to show the tasks added in the list");
				}
		}
	}
}

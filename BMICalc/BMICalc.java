package BMICalc;
import java.util.*;


public class BMICalc {
	
	public static double BMI(double w, double h) {
		if(h != 0) {
			return (w / ((h/100)*(h/100)));
		}else {
			System.out.println("Height cannot be zero!");
			return Double.NaN;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Following are the instructions: ");
		System.out.println("Enter 'q' to exit the program ");
		System.out.println("Enter 'a' to add height and weight");
		System.out.println("Enter i to get the information");
		
		while(true) {
			System.out.println("Enter your choice: ");
			String choice = sc.nextLine();
			
			if(choice.equalsIgnoreCase("q")) {
				System.out.println("Thank you for using this program! ");
				break;
			}
			
			else if(choice.equalsIgnoreCase("a")) {
				System.out.println("Okay then, add your weight in kilograms!");
				double weight = sc.nextDouble(); sc.nextLine();
				System.out.println("Now add your height in centimeters!");
				double height = sc.nextDouble(); sc.nextLine();
				double result = BMI(weight, height);
				System.out.println("Here is your result: " + result);
				System.out.println("Would you like to get the analysis of your BMI?");
				System.out.println("Enter 'y' for the info, else print anything else");
				String info = sc.nextLine();
				if(info.equalsIgnoreCase("y")) {
					System.out.println("The following is the analysis of your BMI");
					if(result < 18.5) {
						System.out.println("Health risks associated with obesity:");
				        System.out.println("1. High blood pressure");
				        System.out.println("2. Higher levels of LDL cholesterol, which is widely considered \"bad cholesterol,\" lower levels of HDL cholesterol, considered to be good cholesterol in moderation, and high levels of triglycerides");
				        System.out.println("3. Type II diabetes");
				        System.out.println("4. Coronary heart disease");
				        System.out.println("5. Stroke");
				        System.out.println("6. Gallbladder disease");
				        System.out.println("7. Osteoarthritis, a type of joint disease caused by breakdown of joint cartilage");
				        System.out.println("8. Sleep apnea and breathing problems");
				        System.out.println("9. Certain cancers (endometrial, breast, colon, kidney, gallbladder, liver)");
				        System.out.println("10. Low quality of life");
				        System.out.println("11. Mental illnesses such as clinical depression, anxiety, and others");
				        System.out.println("12. Body pains and difficulty with certain physical functions");
				        System.out.println("13. Generally, an increased risk of mortality compared to those with a healthy BMI");
					}
					else if (result > 25) {
						System.out.println("\nHealth risks associated with being underweight:");
				        System.out.println("1. Malnutrition, vitamin deficiencies, anemia (lowered ability to carry blood vessels)");
				        System.out.println("2. Osteoporosis, a disease that causes bone weakness, increasing the risk of breaking a bone");
				        System.out.println("3. A decrease in immune function");
				        System.out.println("4. Growth and development issues, particularly in children and teenagers");
				        System.out.println("5. Possible reproductive issues for women due to hormonal imbalances that can disrupt the menstrual cycle. Underweight women also have a higher chance of miscarriage in the first trimester");
				        System.out.println("6. Potential complications as a result of surgery");
				        System.out.println("7. Generally, an increased risk of mortality compared to those with a healthy BMI");
					}

				}
				else if (!info.equalsIgnoreCase("y")) {
					System.out.println("Noted!");
				}
				else {
					System.out.println("You are healthy! Congratulations!");
				}
			}
			else {
				System.out.println("Sorry wrong choice, please look the instructions below!");
				System.out.println("Following are the instructions: ");
				System.out.println("Enter 'q' to exit the program ");
				System.out.println("Enter 'a' to add height and weight");
			}
			
		}
	}
	
}

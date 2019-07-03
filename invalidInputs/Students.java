package invalidInputs;
import java.util.*;

public class Students {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		String[] students = new String[10];
		students[0] = "Cecilia";
		students[1] = "Sofia";
		students[2] = "Danny";
		students[3] = "Oscar";
		students[4] = "Jackie";
		students[5] = "Maria";
		students[6] = "Dave";
		students[7] = "Joe";
		students[8] = "Lolo";
		students[9] = "Fernando";

		String[] hometown = new String[10];
		hometown[0] = "Novi";
		hometown[1] = "Novi";
		hometown[2] = "Commerce Tawnship";
		hometown[3] = "Acunia";
		hometown[4] = "Saltillo";
		hometown[5] = "Monterrey";
		hometown[6] = "Walled Lake";
		hometown[7] = "West Bloomfield";
		hometown[8] = "Holly";
		hometown[9] = "Detroit";
		

		String[] favoriteFood = new String[10];
		favoriteFood[0] = "Coconut Shrimp";
		favoriteFood[1] = "Beef Tacos";
		favoriteFood[2] = "Tamales";
		favoriteFood[3] = "Arrachera";
		favoriteFood[4] = "Posole";
		favoriteFood[5] = "Spaguetti";
		favoriteFood[6] = "chicken Soup";
		favoriteFood[7] = "sweet potatoes";
		favoriteFood[8] = "avocados";
		favoriteFood[9] = "pizza";
		
		String userChoice2 = "";
		String userContinue = "";
		System.out.print("Welcome to our java class.");
		

		do {
			for (int i = 0; i < students.length; i++) {
				System.out.println((i + 1) + "." + students[i]);
			}
			System.out.println("Which student would you like to learn more about?");
			System.out.println("(Enter a number 1 -10)");
			int userChoice = scnr.nextInt();
			int index = userChoice - 1;
			try {
				System.out.print("Student " + userChoice + " is " + students[index] + ".");
				System.out.println(" What would you like to know about " + students[index] + "?");
				System.out.println("Enter \"hometown\" or \"favorite food\"");
				scnr.nextLine();
				userChoice2 = scnr.nextLine();
						
				if (userChoice2.equals("hometown")) {
					System.out.print(students[index] + " is from " + hometown[index]+ ".");
					System.out.print(" Would you like to know more? ");
					System.out.println(" (Enter \"yes\" or \"no\"). ");
					userContinue = scnr.next();
				
				}else if (userChoice2.equals("favorite food")) {
					
					System.out.print(students[index] + " favorites food is  " + favoriteFood[index]);
					System.out.print(". Would you like to know more? ");
					System.out.println(" (Enter \"yes\" or \"no\"). ");
					userContinue = scnr.next();
				}
			}//end try
			catch(IndexOutOfBoundsException ex) {
				System.out.println("That student doesn't exist. Please try again. (enter a number 1-10):");
				userChoice = scnr.nextInt();
			}//end IndexOutOfBoundsException catch
			catch(IllegalArgumentException ex) {
				System.out.println("That data does not exist. Please try again. (Enter \"hometown\" or \"favorite food\"):");
				scnr.nextLine();
				userChoice2 = scnr.nextLine();
			}//end IllegalArgumentException catch
		}//end do
		while(userContinue.equals("yes"));
		System.out.println("Thanks!");





		scnr.close();

	}//end main

}//end Students

package deliverable2;
import java.util.Scanner;
import java.util.Random;

public class deliverable2 {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner scnr = new Scanner(System.in);

		System.out.println("Welcome to the COIN FLIP CHALLENGE!");
		System.out.println("What is your name?");
		String name = scnr.nextLine();
		System.out.println("Welcome " + name + " do you want to do the COIN FLIP CHALLENGE? Yes/No");
		String choice = scnr.next();

		if (choice.equals("Yes")) {
			int cpu_number;
			int user_number = 0;
			int correct = 0;
			for (int i = 0; i < 5; i++) {
				System.out.println("Heads or Tails?");
				choice = scnr.next();
				if (choice.equals("Heads"))
					user_number = 0;
				else if (choice.equals("Tails"))
					user_number = 1;
				
				cpu_number = rand.nextInt(2);
				if (user_number == cpu_number) {
					System.out.println("Correct!");
					correct++;
				}
				else {
					System.out.println("Wrong!");
				}
			}
			System.out.println("Thank you " + name + ". You got a score of " + correct + "!");
		}
		else
			System.out.println("You are a coward " + name);
		
		scnr.close();
	}
}

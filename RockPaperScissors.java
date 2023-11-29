import java.util.*;

public class RockPaperScissors {
	public static void main(String[] args) {
		ArrayList<String> game = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		System.out.print("\t\t\tWELCOME TO GAME");
		System.out.print("\nEnter the 1st player name : ");
		String name1 = input.next();
		System.out.print("\nEnter the 2nd player name : ");
		String name2 = input.next();
		int player1stChoice1 = 0;
		int player2ndChoice = 0;
		for (;;) {
			System.out.print("\n1. Rock");
			System.out.print("\n2. Scissor");
			System.out.print("\n3. Paper");

			System.out.print("\n" + name1 + " Enter your choice : ");
			player1stChoice1 = input.nextInt();

			System.out.print("\n" + name2 + " Enter your choice : ");
			player2ndChoice = input.nextInt();

			if (player1stChoice1 == player2ndChoice) {
				System.out.println("Tie");
				game.add("Tie");
			} else if ((player1stChoice1 == 1 && player2ndChoice == 2)
					|| (player1stChoice1 == 2 && player2ndChoice == 3)
					|| (player1stChoice1 == 3 && player2ndChoice == 1)) {
				System.out.println(name1 + " is Winner");
				game.add(name1);

			} else if ((player1stChoice1 == 1 && player2ndChoice == 3)
					|| (player1stChoice1 == 2 && player2ndChoice == 1)
					|| (player1stChoice1 == 3 && player2ndChoice == 2)) {
				System.out.println(name2 + " is Winner");
				game.add(name2);
			} 

			System.out.print("\n Do you want to continue y or n ");
			String continue1 = input.next();
			if (continue1.equals("y")) {
				continue;
			} else {

				System.out.println(game);

				break;
			}
		}
		input.close();
	}
}

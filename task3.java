package technoHacks;

import java.util.*;

public class task3 {
    /*
     * Rock, paper, scissors game
     * Create a program that allows the user to play
     * the classic game of rock, paper, scissors
     * against the computer.
     */

    public static void main(String []args){
        try(Scanner scanner = new Scanner(System.in)){
            Random random = new Random();
            
            String [] choice = {"rock","paper","scissors"};

            while(true){
                int computerChoiceIndex = random.nextInt(3);
                String computerChoice = choice[computerChoiceIndex];

                // Get user's choice
                System.out.print("Enter your choice (rock, paper, or scissors): ");
                String userChoice = scanner.nextLine().toLowerCase();

                // Check if the user's choice is valid
                if (!userChoice.equals("rock") && !userChoice.equals("paper") && !userChoice.equals("scissors")) {
                    System.out.println("Invalid choice. Please enter rock, paper, or scissors.");
                    continue;
                }

                // Determine the winner
                if (userChoice.equals(computerChoice)) {
                    System.out.println("It's a tie!");
                } else if ((userChoice.equals("rock") && computerChoice.equals("scissors")) ||
                        (userChoice.equals("paper") && computerChoice.equals("rock")) ||
                        (userChoice.equals("scissors") && computerChoice.equals("paper"))) {
                    System.out.println("You win! Computer chose " + computerChoice + ".");
                } else {
                    System.out.println("You lose! Computer chose " + computerChoice + ".");
                }

                // Ask if the user wants to play again
                System.out.print("Do you want to play again? (yes/no): ");
                String playAgain = scanner.nextLine().toLowerCase();
                if (!playAgain.equals("yes")) {
                    break;
                }
            }
            
        }
    }
}

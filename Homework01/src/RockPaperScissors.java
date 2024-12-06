//Ronan Param
import java.util.Random;
import java.util.Scanner;

//Class
public class RockPaperScissors {
	//
	public static void main(String[] args) {
        System.out.println("Welcome to Rock, Paper, Scissors");
        Scanner keyboard = new Scanner(System.in);
        Random rand = new Random();
        int userScore = 0;
        int oppScore = 0;

        //This is the logic
        while (true) {
            System.out.println("Enter 1 for rock, 2 for paper, or 3 for scissors");
            int playerChoice = keyboard.nextInt();
            int oppChoice = rand.nextInt(3) + 1;
            //Invalid choice automatically awards points to computer
            if (playerChoice < 1 || playerChoice > 3) {
            System.out.println("Invalid choice. You lose!");
            oppScore++;
        	}
            if (oppChoice == playerChoice) {
                System.out.println("Game is tied");
            } else if (playerChoice == 1) {
                if (oppChoice == 2) {
                    System.out.println("Opponent chooses paper. You lose!");
                    oppScore++;
                } else if (oppChoice == 3) {
                    System.out.println("Opponent chooses scissors. You win!");
                    userScore++;
                }
            } else if (playerChoice == 2) {
                 if (oppChoice == 1) {
                    System.out.println("Opponent chooses rock. You win!");
                    userScore++;
                } else if (oppChoice == 3) {
                    System.out.println("Opponent chooses scissors. You lose!");
                    oppScore++;
                }
            } else if (playerChoice == 3) {
                if (oppChoice == 1) {
                    System.out.println("Opponent chooses rock. You lose!");
                    oppScore++;
                } else if (oppChoice == 2) {
                    System.out.println("Opponent chooses paper. You win!");
                    userScore++;
            	}
            }
            //Ends the game
            if (oppScore >= 2) {
                System.out.println("You lose best 2 out of 3!");
                break;
            } else if (userScore >= 2) {
                System.out.println("You win best 2 out of 3!");
                break; 
            }
        }
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Rock Paper Scissors Lizard Spock!\nThe computer will choose first and then you will.");

        int computerNum = (int) (Math.random() * 5) + 1;
        String computerChoice = "";
        if (computerNum == 1) {
            computerChoice = "Rock";
        } else if (computerNum == 2) {
            computerChoice = "Paper";
        } else if (computerNum == 3) {
            computerChoice = "Scissors";
        } else if (computerNum == 4) {
            computerChoice = "Lizard";
        } else if (computerNum == 5) {
            computerChoice = "Spock";
        }
        System.out.println("The computer has chosen.");


        String userChoice;
        System.out.print("Enter your choice: ");
        userChoice = scan.nextLine();
        System.out.println("The computer chose " + computerChoice);

        // Rock
        if (userChoice.equals("Rock") || userChoice.equals("rock")) {
            if (computerChoice.equals("Rock")) {
                System.out.println("It's a tie!");
            } else if (computerChoice.equals("Paper")) {
                System.out.println("Rock does not beat Paper. You lose!!!");
            } else if (computerChoice.equals("Scissors")) {
                System.out.println("Rock beats Scissors! You win!");
            } else if (computerChoice.equals("Lizard")) {
                System.out.println("Rock beats Lizard! You win!");
            } else if (computerChoice.equals("Spock")) {
                System.out.println("Rock does not beat Spock. You lose!!!");
            }
        }

            // Paper
            else if (userChoice.equals("Paper") || userChoice.equals("paper")) {
                if (computerChoice.equals("Rock")) {
                    System.out.println("Paper beats Rock! You win!");
                } else if (computerChoice.equals("Paper")) {
                    System.out.println("It's a tie!");
                } else if (computerChoice.equals("Scissors")) {
                    System.out.println("Paper does not beat Scissors. You lose!!!");
                } else if (computerChoice.equals("Lizard")) {
                    System.out.println("Paper does not beat Lizard. You lose!!!");
                } else if (computerChoice.equals("Spock")) {
                    System.out.println("Paper beats Spock! You win!");
                }
            }

            // Scissors
            else if (userChoice.equals("Paper") || userChoice.equals("paper")) {
                if (computerChoice.equals("Rock")) {
                    System.out.println("Paper beats Rock! You win!");
                } else if (computerChoice.equals("Paper")) {
                    System.out.println("It's a tie!");
                } else if (computerChoice.equals("Scissors")) {
                    System.out.println("Paper does not beat Scissors. You lose!!!");
                } else if (computerChoice.equals("Lizard")) {
                    System.out.println("Paper does not beat Lizard. You lose!!!");
                } else if (computerChoice.equals("Spock")) {
                    System.out.println("Paper beats Spock! You win!");
                }
            }

            // Lizard
            else if (userChoice.equals("Lizard") || userChoice.equals("lizard")) {
                if (computerChoice.equals("Rock")) {
                    System.out.println("Lizard does not beat Rock. You lose!!!");
                } else if (computerChoice.equals("Paper")) {
                    System.out.println("Lizard beats Paper! You win!");
                } else if (computerChoice.equals("Scissors")) {
                    System.out.println("Lizard does not beat Scissors. You lose!!!");
                } else if (computerChoice.equals("Lizard")) {
                    System.out.println("It's a tie!");
                } else if (computerChoice.equals("Spock")) {
                    System.out.println("Lizard beats Spock! You win!");
                }
            }

            // Spock
            else if (userChoice.equals("Spock") || userChoice.equals("spock")) {
                if (computerChoice.equals("Rock")) {
                   System.out.println("Spock beats Rock! You win!");
                } else if (computerChoice.equals("Paper")) {
                    System.out.println("Spock does not beat Paper. You lose!!!");
                } else if (computerChoice.equals("Scissors")) {
                    System.out.println("Spock beats Scissors! You win!");
                } else if (computerChoice.equals("Lizard")) {
                    System.out.println("Spock does not beat Lizard. You lose!!!");
                } else if (computerChoice.equals("Spock")) {
                    System.out.println("It's a tie!");
                }
            }
        }
}


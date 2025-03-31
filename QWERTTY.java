import java.util.Random;
import java.util.Scanner;

public class QWERTTY {
    public static void main(String[] args) {
    
        //choice of rock paper scissor9
        System.out.println("rock=0 \n scissor=2 \n paper=1 \n \n<YOUR CHOICE>") ;
        Scanner sc = new Scanner(System.in);
        int user_choice= sc.nextInt();
        System.out.println("your choice" + user_choice);
        
        //genrate a random no
        Random rand = new Random();
        int GAME_choice = rand.nextInt(2) + 1;

        // set of value
        int rock = 0;
        int paper = 1;
        int scissor = 2;
                
        //for an invalid input 
        if (user_choice <0 || user_choice>=3) {
            System.out.println("invalid choice please enter 0 ,1 or 2");
            
        }
                else {
            System.out.println("pc choice" + GAME_choice);
            
            // condition of game
            if (user_choice == GAME_choice) {
                System.out.println("TIE!");

        }else if ((user_choice == 0 && GAME_choice == 2) || //rock best scissor
        (user_choice == 1 && GAME_choice == 0) || // ppaer beat rock
        (user_choice == 2 && GAME_choice== 1)) { // scissor beat paper 
        System.out.println("YOU WIN");
        } else {
        System.out.println("You LOSE!");
        }
                
        }
        System.out.println("\nGame Over! Thanks for playing.");
        sc.close();

        //game end
    }
}

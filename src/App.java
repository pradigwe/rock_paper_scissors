import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        String user;
        boolean play = true;

        Game game = new Game();
        
        System.out.println("Welcome to Rock Paper Scissors!");
        System.out.println("Enter to get started!");
        user = input.nextLine();
        //input.nextLine();
        System.out.println("-------");

        while(play == true){
            user = "";
            System.out.println("\nPlease choose rock, paper, or scissors. Enter 0 to quit.");
            user = input.nextLine();
            // plays game
            System.out.println(game.play(user));

            // checks if user decided to stop playing
            if(user.equals("0")){
                play = false;

                System.out.println("\n-------");
                System.out.println(game.gameScore());

                if(game.userScore() > game.botScore()){
                    System.out.println("You won!");
                }
                else if(game.userScore() < game.botScore()){
                    System.out.println("You tied.");
                }
                else{
                    System.out.println("You tied.");
                }
                input.close();
            }
            //else{}
            user = "";
        }
    }
}

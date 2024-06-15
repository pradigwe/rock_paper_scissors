import java.util.Scanner;

// by removing GameGui.java this can be used with just the terminal
public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        String user;
        //boolean play = true;

        Game game = new Game();
        
        System.out.println("Welcome to Rock Paper Scissors!");
        System.out.println("Enter to get started!");
        user = input.nextLine();
        //input.nextLine();
        System.out.println("-------");

        while(true){
            //user = "";
            System.out.println("\nPlease choose rock, paper, or scissors. Enter 0 to quit.");
            user = input.nextLine();
            // plays game
            System.out.println(game.play(user));

            // checks if user decided to stop playing
            if(user.equals("0")){
                System.out.println("\n-------");
                System.out.println(game.gameScore());

                if(game.getUser() > game.getBot()){
                    System.out.println("You won!");
                }
                else if(game.getUser() < game.getBot()){
                    System.out.println("You lost.");
                }
                else{
                    System.out.println("You tied.");
                }
                input.close();
                break;
            }
            //else{}
            user = "";
        }
    }
}

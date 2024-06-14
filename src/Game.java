public class Game {
    private int random;
    private int user, bot;
    
    public Game(){
        user = 0;
        bot = 0;
    }

    // checks if user entered rock, paper, or scissors
    public boolean isValid(String choice){
        choice = choice.toLowerCase();

        if(choice.equals("rock")|| choice.equals("paper") || choice.equals("scissors")){
            return true;
        }
        else {return false;}
    }
    
    public String play(String choice){
        choice = choice.toLowerCase();
        String result = "";
        
        //user enters valid choice
        if(isValid(choice) == true){
            random = (int)(Math.random()*3) + 1;
            // bot has chosen rock
            if(random == 1){
                if(choice.equals("rock")){
                    result = "Tie";
                }
                else if(choice.equals("paper")){
                    user++;
                    result = "You won!";
                }
                else if(choice.equals("scissors")){
                    bot++;
                    result = "You lost.";
                }
            }

            //bot chooses paper
            else if(random == 2){
                if(choice.equals("paper")){
                    result = "Tie";
                }
                else if(choice.equals("scissors")){
                    user++;
                    result = "You won!";
                }
                else if(choice.equals("rock")){
                    bot++;
                    result = "You lost.";
                }
            }

            //bot chooses scissors
            else if(random == 1){
                if(choice.equals("scissors")){
                    result = "Tie";
                }
                else if(choice.equals("rock")){
                    user++;
                    result = "You won!";
                }
                else if(choice.equals("paper")){
                    bot++;
                    result = "You lost.";
                }
            }
        }

        //user enters invalid choice
        else if(isValid(choice) == false){
            result = "Please enter valid choice.";
        }

        return result;
    }

    public int userScore(){
        return user;
    }

    public int botScore(){
        return bot;
    }

    public String gameScore(){
        return user + " - " + bot;
    }
}

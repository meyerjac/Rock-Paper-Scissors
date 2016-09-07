import java.util.Random;


public class RockPaperScissors{
    public String playerOne;
    public String playerTwo;
    public String computer;

  public String choose(String choice){
    if(!choice.equalsIgnoreCase("Rock") && !choice.equalsIgnoreCase("Paper") && !choice.equalsIgnoreCase("Scissors") ){
      choice =  "You're a douche";
    }
      return choice;
  }

  public String determineWinner(String playerOne, String playerTwo){
    String outcome;
    if(playerOne.equalsIgnoreCase(playerTwo)){
      outcome= "It's a Tie";
    }else if(playerOne.equalsIgnoreCase("You're a douche")){
      outcome = "Player One Loses";

    }else if(playerOne.equalsIgnoreCase("You're a douche")){
      outcome = "Player Two Loses";
    }
    else if((playerOne.equalsIgnoreCase("Rock")&& playerTwo.equalsIgnoreCase("Scissors")) ||(playerOne.equalsIgnoreCase("Paper") && playerTwo.equalsIgnoreCase("Rock")) || (playerOne.equalsIgnoreCase("Scissors") && playerTwo.equalsIgnoreCase("Paper"))){
      outcome = "Player One Wins";
    }else{
      outcome = "Player Two Wins";
    }
    return outcome;
  }

  public String computerChooses(){
      Random rand = new Random();
      int computerChoice = rand.nextInt(3)+1;
      if(computerChoice==1){
        return "Rock";
      }else if(computerChoice==2){
        return "Paper";
      }else{
        return "Scissors";
      }
  }
}

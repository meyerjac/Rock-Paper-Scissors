import org.junit.*;
import static org.junit.Assert.*;

public class RockPaperScissorsTest {

  @Test
  public void choose_DetermineChoice_Scissors(){
    RockPaperScissors testChoice = new RockPaperScissors();
    String choice = "Scissors";
    assertEquals(choice, testChoice.choose("Scissors"));
  }

  @Test
  public void choose_FailureToComply_YoureADouche(){
    RockPaperScissors testChoice = new RockPaperScissors();
    String choice = "You're a douche";
    assertEquals(choice, testChoice.choose("Apple"));
  }

  @Test
  public void determineWinner_CheckPlayerOneWin_PlayerOneWins(){
    RockPaperScissors testChoice = new RockPaperScissors();
    String output = "Player One Wins";
    String playerOne = "Rock";
    String playerTwo = "Scissors";
    assertEquals(output, testChoice.determineWinner(playerOne,playerTwo));
  }

  @Test
  public void determineWinner_CheckPlayerTwoWin_PlayerTwoWins(){
    RockPaperScissors testGame = new RockPaperScissors();
    String output = "Player Two Wins";
    String playerOne = "Paper";
    String playerTwo = "Scissors";
    assertEquals(output, testGame.determineWinner(playerOne,playerTwo));
  }

  @Test
  public void determineWinner_CheckIfTie_ItsATie(){
    RockPaperScissors testGame = new RockPaperScissors();
    String output = "It's a Tie";
    String playerOne = "Paper";
    String playerTwo = "Paper";
    assertEquals(output, testGame.determineWinner(playerOne,playerTwo));
  }

  @Test
  public void computerChooses_shouldBeAString_true() {
    RockPaperScissors testGame = new RockPaperScissors();
    String computerChoice =  testGame.computerChooses();
    assertEquals(true, computerChoice instanceof String);
  }


}

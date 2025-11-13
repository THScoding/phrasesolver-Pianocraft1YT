/*
 * Activity 2.2.2
 *
 *  The PhraseSolver class the PhraseSolverGame
 */
import java.util.Scanner;
  
public class PhraseSolver
{
  /* your code here - attributes */

  /* your code here - constructor(s) */ 
  public PhraseSolver(){
    Player player1 = null;
    Player player2 = null;
    Board board = null;  }
  public void play()
  {
    boolean solved = false;
    int currentPlayer = 1;

    Scanner input = new Scanner(System.in);
    
    boolean correct = true;
    while (!solved) 
    {
      Board board = new Board();
      board.loadPhrase();
      board.getSolvedPhrase();
      
      
      /* your code here - determine how game ends */
      solved = true; 
    } 
   // CODE TO ADD

  }
  
}
/*
 * Activity 2.2.2
 *
 *  The PhraseSolver class the PhraseSolverGame
 */
import java.util.Scanner;
  
public class PhraseSolver
{
  /* your code here - attributes */
    Player player1;
    Player player2;
    Board board;
  /* your code here - constructor(s) */ 
  public PhraseSolver(){
    player1 = new Player();
    player2 = new Player();
    board = new Board();  
  }


  public void play()
  {
    boolean solved = false;
    int currentPlayer = 1;

    Scanner sc = new Scanner(System.in);
    
    while (!solved) 
    {
      System.out.println("Player 1 Name: ");
      String name1 = sc.nextLine();
      player1.setName(name1);
      System.out.println("Player 2 Name: ");
      String name2 = sc.nextLine();
      player2.setName(name2);
      board.loadPhrase();
      System.out.println(board.getSolvedPhrase());
      /* your code here - determine how game ends */
      solved = true; 
    } 
   // CODE TO ADD

  }
  
}
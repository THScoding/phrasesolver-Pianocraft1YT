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
    Scanner sc = new Scanner(System.in);
    boolean setup = false;
    while (!setup) 
    {
      String guess;
      boolean check = false;
      int i = (int)(Math.random());
      System.out.println("Player 1 Name: ");
      String name1 = sc.nextLine();
      player1.setName(name1);
      System.out.println("Player 2 Name: ");
      String name2 = sc.nextLine();
      player2.setName(name2);
      board.loadPhrase();

      System.out.println(board.getSolvedPhrase());
      setup = true;
      String letterOrPhrase;
      boolean check1 = false;;
      while (!solved){
        if (i % 2 == 0){
          board.setLetterValue();
          System.out.println(player1.getName() + ", do you want to guess a letter (L) or a phrase (P)?");
          letterOrPhrase = sc.nextLine();
          if (letterOrPhrase.equals("p") || letterOrPhrase.equals("P")){
System.out.println("You gain "+ board.getLetterValue() + " points if you guess correctly.");
          System.out.println(player1.getName() + ", Guess now!");
                    guess = sc.nextLine();
          check = board.isSolved(guess);
          }
          else if (letterOrPhrase.equals("L") || letterOrPhrase.equals("l")){
System.out.println("You gain "+ board.getLetterValue() + " points if you guess correctly.");
          System.out.println(player1.getName() + ", Guess now!");
          guess = sc.nextLine();
          check1 = board.isSolved(guess);
          }
          else{
            System.out.println("Invalid Input.");
            break;
          }
          if (check){
            solved = true;
            board.addWinPoints(player1);
            break;
          }
          else if (check1){
            System.out.println("You got one or more letters!");
            System.out.println("You gain " + board.getLetterValue() +" points.");
            i++;
            System.out.println(board.getSolvedPhrase());
            board.addLetterPoints(player1);
          }
          else
          i++;
          System.out.println(board.getSolvedPhrase());
        }
        else{
          board.setLetterValue();
          System.out.println(player2.getName() + ", do you want to guess a letter (L) or a phrase (P)?");
          letterOrPhrase = sc.nextLine();
          if (letterOrPhrase.equals("p") || letterOrPhrase.equals("P")){
System.out.println("You gain "+ board.getLetterValue() + " points if you guess correctly.");
          System.out.println(player2.getName() + ", Guess now!");
                    guess = sc.nextLine();
          check = board.isSolved(guess);
          }
          else if (letterOrPhrase.equals("L") || letterOrPhrase.equals("l")){
System.out.println("You gain "+ board.getLetterValue() + " points if you guess correctly.");
          System.out.println(player2.getName() + ", Guess now!");
          guess = sc.nextLine();
          check1 = board.isSolved(guess);
          }
          if (check){
            solved = true;
            board.addWinPoints(player2);
            break;
          }
          else if (check1){
            System.out.println("You got one or more letters!");
            System.out.println("You gain " + board.getLetterValue() +" points.");
            board.addLetterPoints(player2);
            i++;
            System.out.println(board.getSolvedPhrase());

          }
          else
          i++;
          System.out.println(board.getSolvedPhrase());
        }
    } 


    }
  
  }
}
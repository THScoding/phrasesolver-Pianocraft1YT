/*
 * Activity 2.2.2
 * 
 * A Player class the PhraseSolverGame
 */

public class Player
{
  /* your code here - attributes */
  private String name;
  private int points;
  /* your code here - constructor(s) */ 
public Player(){
  name = "";
  points = 0;
}
  /* your code here - accessor(s) */ 
public void setName(String N){
  name = N;
}
public void addPoints(){
  points++;
}
public int getPoints(){
  return points;
}
public String getName(){
  return name;
}
  /* your code here - mutator(s) */ 
}
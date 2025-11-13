/*
 * Activity 2.2.2
 *
 * A Board class the PhraseSolverGame
 */
import java.util.Scanner;
import java.io.File;
import java.lang.Math;
public class Board
{
  private String solvedPhrase;
  private String phrase;
  private int currentLetterValue; 
  private String possiblePhrases;
  private boolean solved;
  /* your code here - constructor(s) */ 
  public Board() {
    solvedPhrase = "";
    phrase = "";
    currentLetterValue = 0;
    solved = false;
 String possiblePhrases = """
  1curiosity killed the cat 2world is your oyster 3you need money to make money 4all good things come to those who wait 5if at first you dont succeed try try again 6never put off till tomorrow what you can do today 7dont cross the bridge until you come to it 8two heads are better than one 9paddle your own canoe 10save for a rainy day 11life is what we make it 12opposite attracts 13faint heart never won fair lady 14the meek shall inherit the earth 15with age comes wisdom 16two is company three is a crowd 17its better to be safe than sorry 18dont look a gift horse in the mouth 19do unto others as you would have others do unto you 20hitch your wagon to a star 21many hands make light work 22youre never too old to learn 23a word to the wise is sufficient 24dont judge a book by its cover 25the squeaking wheel gets the grease 26a stitch in time saves nine 27look before you leap 28haste makes waste 29fools rush in where angels fear to tread 30seek and ye shall find 31the best things in life are free 32the apple doesnt fall far from the tree 33root of the problem 34say your piece 35screw the pooch 36shoot the breeze 37sit on the fence 38speak of the devil 39ace in the hole 40lose your marbles 41luck of the irish 42make a big to do 43make a fuss 44miss the boat 45off the hook 46on the ball 47out of sight out of mind 48out of the picture 49out of touch 50over the hill 51paint a picture 52perfect stranger 53piece of cake 54add insult to injury 55all ears 56all thumbs 57all your eggs in one basket 58axe to grind 59barking up the wrong tree 60basket case 61beat around the bush 62beck and call 63bend over backwards 64the best of both worlds 65bite off more than one can chew 66bite the bullet 67a bitter pill 68bring home the bacon 69burn the midnight oil 70call it a day 71cant hold a candle 72caught between two stools 73chew the fat 74chickens come home to roost 75chip on thier shoulder 76cold shoulder 77costs an arm and a leg 78couch potato 79cut a rug 80cut corners 81cut the cheese 82cut the mustard 83cut to the chase 84a dime a dozen 85dodge a bullet 86a dogs breakfast 87down for the count 88high and mighty 89hit the road 90have a blast 91higher than a kite 92honest to goodness 93hot and bothered 94a hot potato 95if the shoe fits wear it 96in the bag 97jog your memory 98joke is on you 99jump at the chance 100jump to conclusion""";

  }

  /* your code here - accessor(s) */
  public int getLetterValue(){
    return currentLetterValue;
  }
  public void addLetterValue(){
    currentLetterValue++;
  }
  public void solvePhrase(String trySolve){
     if (trySolve.equals(phrase)){
      solved=true;
     }
     else
     solved = false;

  }
  public String getSolvedPhrase(){
    return solvedPhrase;
  }
  /* 
  public void setPhrase(){
    int random = (int)(Math.random()*100);
    int CurrentLetter = possiblePhrases.indexof(random);
    while (end == False){
      if(!possiblePhrases.substring(CurrentLetter, CurrentLetter+1).equals("\n")){
            phrase += possiblePhrases.substring(CurrentLetter, CurrentLetter+1);
            currentLetter++;
      }
      else
      end = True;
      }
  }
*/
  /* your code here - mutator(s)  */


  /* ---------- provided code, do not modify ---------- */
  public void setLetterValue()
  {
    int randomInt = (int) ((Math.random() * 10) + 1) * 100;    
    currentLetterValue = randomInt;
  }

  public boolean isSolved(String guess)
  {
    if (phrase.equals(guess))
    {
      return true;
    }
    return false;
  }

  private String loadPhrase()
  {
    String tempPhrase = "";
    
    int numOfLines = 0;
    try 
    {
      Scanner sc = new Scanner(new File("phrases.txt"));
      while (sc.hasNextLine())
      {
        tempPhrase = sc.nextLine().trim();
        numOfLines++;
      }
    } catch(Exception e) { System.out.println("Error reading or parsing phrases.txt"); }
    
		int randomInt = (int) ((Math.random() * numOfLines) + 1);
    
    try 
    {
      int count = 0;
      Scanner sc = new Scanner(new File("phrases.txt"));
      while (sc.hasNextLine())
      {
        count++;
        String temp = sc.nextLine().trim();
        if (count == randomInt)
        {
          tempPhrase = temp;
        }
      }
    } catch (Exception e) { System.out.println("Error reading or parsing phrases.txt"); }
    
    for (int i = 0; i < tempPhrase.length(); i++)
    {
      if (tempPhrase.substring(i, i + 1).equals(" "))
      {
        solvedPhrase += "  ";
      }  
      else
      {
        solvedPhrase += "_ ";
      }
    }  
    
    return tempPhrase;
  }  

  public boolean guessLetter(String guess)
  {
    boolean foundLetter = false;
    String newSolvedPhrase = "";
    
    for (int i = 0; i < phrase.length(); i++)
    {
      if (phrase.substring(i, i + 1).equals(guess))
      {
        newSolvedPhrase += guess + " ";
        foundLetter = true;
      }
      else
      {
        newSolvedPhrase += solvedPhrase.substring(i * 2, i * 2 + 1) + " ";  
      }
    }
    solvedPhrase = newSolvedPhrase;
    return foundLetter;
  } 
} 
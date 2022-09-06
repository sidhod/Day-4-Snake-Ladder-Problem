/*welcome message
 * Take player name from user input
 * print starting position of player
 * player rolls die to get value
 * Add No Play ,Snake and Ladder Case
 */
package Basics;
import java.util.*;
import java.io.IOException; 

public class SnakeAndLadder {
	
	public static void main(String[] args) {
		int Start_Position=0;
		int User_Position=0;
		final int No_Play=5;
		final int Ladder=15;
	    final int Snake =20;
		int n=0;
		String sGame = "r";
    	System.out.println(""
    			+ "    ##     ## ###### ##     ###### ###### ###   ### ######\r\n"
    			+ " *  ##     ## ##     ##     ##     ##  ## ## # # ## ##      *\r\n"
    			+ "*** ##  #  ## #####  ##     ##     ##  ## ##  #  ## #####  ***\r\n"
    			+ " *  ## # # ## ##     ##     ##     ##  ## ##     ## ##      *\r\n"
    			+ "    ###   ### ###### ###### ###### ###### ##     ## ###### \r\n"
    			+ "-------------------SNAKE AND LADDER GAME-----------------------\r\n");
    	Scanner name= new Scanner(System.in); //System.in is a standard input stream.
    	System.out.print("Enter Your Name-: ");
    	String PlayerName= name.nextLine();
    	System.out.println("Starting Position Of Player"+"("+ PlayerName +"): "+ Start_Position);
    	while(sGame.equals ("r") || sGame.equals ("R")) {
    	int DieValue = (int) ((Math.random()*(7-1)) + 1);
    	
    	switch(User_Position) {
	    case No_Play:
	    	System.out.println("No Play "+User_Position);
	    	System.out.println ("\t\t\t\t~~~~~~~~~~~~~You Got No Play Zone!! SAME POSITION!!!~~~~~~~~~~~~~");
	    break;
	    case Ladder:
	    	User_Position=User_Position+DieValue;
	    	System.out.println("Ladder: "+User_Position);
	    	System.out.println ("\t\t\t\t~~~~~~~~~~~~~You Got A Ladder!! GO UP!!!~~~~~~~~~~~~~");
		    break;
	    case Snake:
		    User_Position=User_Position-DieValue;
		    System.out.println("Snake "+User_Position);
		    System.out.println ("\t\t\t\t~~~~~~~~~~~~~You Got Bit By A Snake, GO DOWN!!!~~~~~~~~~~~~~");
		    break;
		default:
			User_Position=User_Position+DieValue;
			System.out.println(User_Position);
			
	 }
    	System.out.println("Die Thrown Value: "+ DieValue);
    	System.out.println("---------------------------------------------------------------------------------------------------------------------------");
        System.out.println ("\t\t\t\t\t-------------------------------");
        System.out.println ("\t\t\t\t\t|      You Rolled a: " + DieValue + "         |");
        System.out.println ("\t\t\t\t\t| Player Position("+PlayerName+"): " + User_Position + "   |");// print the roll the user got
        System.out.println ("\t\t\t\t\t-------------------------------");
        System.out.println("Press R for Die Thrown");
        Scanner Game= new Scanner(System.in);
        sGame= Game.nextLine(); 
    	}
    	
    	
    	
	}
}


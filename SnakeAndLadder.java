/*welcome message
 * Take player name from user input
 * print starting position of player
 * player rolls die to get value*/
package Basics;
import java.util.*;

public class SnakeAndLadder {
	
	public static void main(String[] args) {
		int Start_Position=0;
		int Die=0;
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
    	int DieValue = (int) ((Math.random()*(7-1)) + 1);
    	System.out.println("Die Thrown Value: "+ DieValue);
    	
    
    
    }
}


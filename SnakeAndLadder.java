package Basics;
import java.util.*;

public class SnakeAndLadder {
	
	public static void main(String[] args) {
		int Start_Position=0;
    	System.out.println(""
    			+ "    ##     ## ###### ##     ###### ###### ###   ### ######\r\n"
    			+ " *  ##     ## ##     ##     ##     ##  ## ## # # ## ##      *\r\n"
    			+ "*** ##  #  ## #####  ##     ##     ##  ## ##  #  ## #####  ***\r\n"
    			+ " *  ## # # ## ##     ##     ##     ##  ## ##     ## ##      *\r\n"
    			+ "    ###   ### ###### ###### ###### ###### ##     ## ###### \r\n"
    			+ "-------------------SNAKE AND LADDER GAME-----------------------\r\n");
    	Scanner name= new Scanner(System.in); //System.in is a standard input stream.
    	System.out.print("Enter Your Name- ");
    	String PlayerName= name.nextLine();
    	System.out.println("Starting Position Of Player"+"("+ PlayerName +"): "+ Start_Position);
    }
}


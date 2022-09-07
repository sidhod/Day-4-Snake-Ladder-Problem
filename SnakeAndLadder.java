/*welcome message
 * Take player name from user input
 * print starting position of player
 * player rolls die to get value
 * Add No Play ,Snake and Ladder Case
 * Repeat till the Player reaches the winning position 100.
 * position moves below 0, then the player restarts from 0.
 * Set Winning position user position 100
 */
package Basics;
import java.util.*;
public class SnakeAndLadder {
	public static void main(String[] args) {
		SnakeAndLadder obj = new SnakeAndLadder();
		int startPosition=0;
		int temp=0;
	int userPosition = 0;
		int n=0;
		String sGame = "r";
    	System.out.println(""
    			+ "    ##     ## ###### ##     ###### ###### ###   ### ######\r\n"
    			+ " *  ##     ## ##     ##     ##     ##  ## ## # # ## ##      *\r\n"
    			+ "*** ##  #  ## #####  ##     ##     ##  ## ##  #  ## #####  ***\r\n"
    			+ " *  ## # # ## ##     ##     ##     ##  ## ##     ## ##      *\r\n"
    			+ "    ###   ### ###### ###### ###### ###### ##     ## ###### \r\n"
    			+ "-------------------SNAKE AND LADDER GAME-----------------------\r\n");
    	Scanner name= new Scanner(System.in); 
    	System.out.print("Enter Your Name-: ");
    	String playerName= name.nextLine();
    	System.out.println("Starting Position Of Player"+"("+ playerName +"): "+ startPosition);
    	
    	while(sGame.equals ("r") || sGame.equals ("R")){
    	int DieValue = (int) ((Math.random()*(7-1)) + 1);
    	userPosition=userPosition+DieValue;
    	userPosition= obj.checkCases(userPosition,DieValue);
    	
        displayOutput(userPosition,DieValue,playerName);
         if (userPosition == 100)
        {
        	sGame="s";
            System.out.println ("YOU WON, GOOD JOB!!!");
            
        }
         else {
    	System.out.println("Press 'R' for Die Thrown");
        Scanner Game= new Scanner(System.in);
        sGame= Game.nextLine();
         }
        
        
        
        
    	}
	}
   static void displayOutput(int userPosition,int DieValue,String playerName){
	   System.out.println("---------------------------------------------------------------------------------------------------------------------------");
    	System.out.println("Die Thrown Value: "+ DieValue);
        System.out.println ("\t\t\t\t\t-------------------------------");
        System.out.println ("\t\t\t\t\t|      You Rolled a: " + DieValue + "         |");
        System.out.println ("\t\t\t\t\t| Player Position("+playerName+"): " + userPosition + "      |");// print the roll the user got
        System.out.println ("\t\t\t\t\t-------------------------------");
        
		
	}
	 public int checkCases(int userPosition,int DieValue) 
	 {   
		 	if(userPosition < 0) 
	        {
	            userPosition = 0; 
	            System.out.println ("\t\t\t\t~~~~~~~~~~~~~Come To Start Position!!!~~~~~~~~~~~~~");
	        }
		 	 else if (userPosition > 100)
		        {
		            userPosition=userPosition-DieValue; 
		            
		            
		        }
		    
	        else if(userPosition == 15) 
	        {
	            userPosition = userPosition + DieValue; 
	            System.out.println ("\t\t\t\t~~~~~~~~~~~~~You Got A Ladder!! GO UP!!!~~~~~~~~~~~~~");
	        }
	        else if (userPosition == 9)
	        {
	        	userPosition = userPosition+DieValue;
	        	System.out.println ("\t\t\t\t~~~~~~~~~~~~~You Got A Ladder!! GO UP!!!~~~~~~~~~~~~~");
	            
	        }else if (userPosition == 35)
	        {
	        	userPosition = userPosition+DieValue; 
	        	System.out.println ("\t\t\t\t~~~~~~~~~~~~~You Got A Ladder!! GO UP!!!~~~~~~~~~~~~~");
	            
	        }else if (userPosition == 52)
	        {
	        	userPosition = userPosition+DieValue; 
	        	System.out.println ("\t\t\t\t~~~~~~~~~~~~~You Got A Ladder!! GO UP!!!~~~~~~~~~~~~~");
	            
	        }else if (userPosition == 67)
	        {
	        	userPosition = userPosition+DieValue; 
	        	System.out.println ("\t\t\t\t~~~~~~~~~~~~~You Got A Ladder!! GO UP!!!~~~~~~~~~~~~~");
	            
	        }else if (userPosition == 78)
	        {
	        	userPosition = userPosition+DieValue; 
	        	System.out.println ("\t\t\t\t~~~~~~~~~~~~~You Got A Ladder!! GO UP!!!~~~~~~~~~~~~~");
	            
	        }else if (userPosition == 83)
	        {
	        	userPosition = userPosition+DieValue; 
	        	System.out.println ("\t\t\t\t~~~~~~~~~~~~~You Got A Ladder!! GO UP!!!~~~~~~~~~~~~~");
	            
	        }else if (userPosition == 92)
	        {
	        	userPosition = userPosition+DieValue; 
	        	System.out.println ("\t\t\t\t~~~~~~~~~~~~~You Got A Ladder!! GO UP!!!~~~~~~~~~~~~~");
	            
	        }else if (userPosition == 2)
	        {
	        	userPosition = userPosition+DieValue; 
	        	System.out.println ("\t\t\t\t~~~~~~~~~~~~~You Got A Ladder!! GO UP!!!~~~~~~~~~~~~~");
	            
	        }else if(userPosition == 10) 
	        {
	            userPosition = userPosition - DieValue- DieValue; 
	            System.out.println ("\t\t\t\t~~~~~~~~~~~~~You Got Bit By A Snake, GO DOWN By "+DieValue+"!!!~~~~~~~~~~~~~");
	        }
	        else if (userPosition == 27)
	        {
	        	userPosition = userPosition-DieValue;
	        	System.out.println ("\t\t\t\t~~~~~~~~~~~~~You Got Bit By A Snake, GO DOWN By "+DieValue+"!!!~~~~~~~~~~~~~");
	            
	        }else if (userPosition == 35)
	        {
	        	userPosition = userPosition-DieValue; 
	        	System.out.println ("\t\t\t\t~~~~~~~~~~~~~You Got Bit By A Snake, GO DOWN By "+DieValue+"!!!~~~~~~~~~~~~~");
	        }else if (userPosition == 56)
	        {
	        	userPosition = userPosition-DieValue; 
	        	System.out.println ("\t\t\t\t~~~~~~~~~~~~~You Got Bit By A Snake, GO DOWN By "+DieValue+"!!!~~~~~~~~~~~~~");
	            
	        }else if (userPosition == 68)
	        {
	        	userPosition = userPosition-DieValue; 
	        	System.out.println ("\t\t\t\t~~~~~~~~~~~~~You Got Bit By A Snake, GO DOWN By "+DieValue+"!!!~~~~~~~~~~~~~");
	            
	        } 
	        return userPosition; 
	    }
	    
	    
	    
}

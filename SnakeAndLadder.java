/*welcome message
 * Take player name from user input
 * print starting position of player
 * player rolls die to get value
 * Add No Play ,Snake and Ladder Case
 * Repeat till the Player reaches the winning position 100.
 * position moves below 0, then the player restarts from 0.
 * Set Winning position user position 100
 * Print No of Times Dice Rolls
 * Position of Player
 * Play The game with two player 
 * when get ladder player position become 0
 * Print who win the Game
 * Play Game with 2 player
 * get Ladder get  chance again
 * 
 */
package Basics;
import java.util.*;
public class SnakeAndLadder {
	public static void main(String[] args) {
		
		int startPosition=0;
		int noTimesDieRolls1=0;
		int noTimesDieRolls2=0;
	    int userPosition1 = 0;
	    int userPosition2 = 0;
	    int winPoint=100;
		int n=0;
		String sGame = "r";
    	System.out.println(""
    			+ "    ##     ## ###### ##     ###### ###### ###   ### ######\r\n"
    			+ " *  ##     ## ##     ##     ##     ##  ## ## # # ## ##      *\r\n"
    			+ "*** ##  #  ## #####  ##     ##     ##  ## ##  #  ## #####  ***\r\n"
    			+ " *  ## # # ## ##     ##     ##     ##  ## ##     ## ##      *\r\n"
    			+ "    ###   ### ###### ###### ###### ###### ##     ## ###### \r\n"
    			+ "-------------------SNAKE AND LADDER GAME-----------------------\r\n");
    
    	Scanner name1= new Scanner(System.in); 
    	System.out.print("Enter Your Name(Player 1)-: ");
    	String playerName1= name1.nextLine();
    	
    	Scanner name2= new Scanner(System.in); 
    	System.out.print("Enter Your Name(Player 2)-: ");
    	String playerName2= name2.nextLine();
    	System.out.println("Starting Position Of Player1"+"("+ playerName1 +"): "+ startPosition);
    	System.out.println("Starting Position Of Player2"+"("+ playerName2 +"): "+ startPosition);
    	
    	while(sGame.equals ("r") || sGame.equals ("R")){
    
    	int DiceValue1 = (int) ((Math.random()*(7-1)) + 1);
    	noTimesDieRolls1=noTimesDieRolls1+1;
    	userPosition1=userPosition1+DiceValue1;
    	userPosition1= checkCases1(userPosition1, DiceValue1);
    	displayOutput(userPosition1,DiceValue1,playerName1,noTimesDieRolls1);
    	int DiceValue2 = (int) ((Math.random()*(7-1)) + 1);
    	noTimesDieRolls2=noTimesDieRolls2+1;	
    	userPosition2=userPosition2+DiceValue2;
    	userPosition2= checkCases1(userPosition2,DiceValue2);
        displayOutput(userPosition2,DiceValue2,playerName2,noTimesDieRolls2);
        System.out.println("---------------------------------------------------------------------------------------------------------------------------");
    	
   	 	if (userPosition1 == 100 )
        {
        	displayWinPlayer(noTimesDieRolls1,sGame,playerName1);
        	sGame="s";
        }else if (userPosition2 == 100 )
        {
        	displayWinPlayer(noTimesDieRolls2,sGame,playerName2);
        	sGame="s";
        }else
        {
    	System.out.println("Press 'R' for Die Thrown");
        Scanner Game= new Scanner(System.in);
        sGame= Game.nextLine();}
         
        
        
        
    	}
	}
	
	
	
	
   static void displayWinPlayer(int noTimesDieRolls,String sGame,String playerName) {
	   
  	System.out.println("===========================================================================================================================================");
  	System.out.println(""
  			+ "---------Total No Dies Rolls: "+noTimesDieRolls+"--------------\r\n"
  			+ "    #      # ###### ##  ##   ##     ## ## ###    ##      \r\n"
  			+ " *   #    #  ##  ## ##  ##   ##     ## ## ## #   ##     *\r\n"
  			+ "***    ##    ##  ## ##  ##   ##  #  ## ## ##  #  ##    ***\r\n"
  			+ " *     ##    ##  ## ##  ##   ## # # ## ## ##   # ##     *\r\n"
  			+ "       ##    ###### ######   ###   ### ## ##     ##       \r\n"
  			+ "----------------------| "+playerName+" |----------------------\r\n");  
  	
   }
	
	
   static void displayOutput(int userPosition1,int DieValue1,String playerName1,int noTimesDieRolls1){
	   
    	System.out.println("Die Thrown Value: "+ DieValue1+"         *******************************************************");
        System.out.println ("\t\t\t\t\t-------------------------------");
        System.out.println ("\t\t\t\t\t|      You Rolled a: " + DieValue1 + "         |");
        System.out.println ("\t\t\t\t\t| Player Position("+playerName1+"): " + userPosition1 + "      |");
        System.out.println ("\t\t\t\t\t| No Of Times Die Rolls: " + noTimesDieRolls1 + "     |");
        System.out.println ("\t\t\t\t\t-------------------------------");
        
		
	}
   
   static int doing(int userPositions,int DiceValue ) {
	   userPositions = userPositions + DiceValue; 
       System.out.println ("\t\t\t\t~~~~~~~~~~~~~You Got A Ladder!! GO UP!!!~~~~~~~~~~~~~");
       System.out.println ("\t\t\t\t~~~~~~~~~~~~~YOU GOT CHANCE TO PLAY AGAIN!!!~~~~~~~~~~~~~");
       int DiceValueLadder = (int) ((Math.random()*(7-1)) + 1);
       System.out.println ("\t\t\t\t~~~~~~~~~~~~~DICE IS THROWN: "+DiceValueLadder+"~~~~~~~~~~~~~");
       userPositions=userPositions+DiceValueLadder;
       System.out.println ("\t\t\t\t~~~~~~~~~~~~~NEW POSITION: "+userPositions+"~~~~~~~~~~~~~");
       return userPositions;
	   
   }
	 static int checkCases1(int userPosition1,int DiceValue1) 
	 {   
		 	if(userPosition1 < 0) 
	        {
	            userPosition1 = 0; 
	            System.out.println ("\t\t\t\t~~~~~~~~~~~~~Come To Start Position!!!~~~~~~~~~~~~~");
	        }
		 	else if (userPosition1 > 100)
	        {
	            userPosition1=userPosition1-DiceValue1; 
	            System.out.println(userPosition1+" "+DiceValue1);
	            
	            
	        }
		 	
		    
	        else if(userPosition1 == 15) 
	        {
	           userPosition1=doing(userPosition1,DiceValue1);
	        }
	        else if (userPosition1 == 9)
	        {
	        	userPosition1=doing(userPosition1,DiceValue1);
	            
	        }else if (userPosition1 == 35)
	        {
	        	userPosition1=doing(userPosition1,DiceValue1);
	            
	        }else if (userPosition1 == 52)
	        {
	        	userPosition1=doing(userPosition1,DiceValue1);
	            
	        }else if (userPosition1 == 67)
	        {
	        	userPosition1=doing(userPosition1,DiceValue1);
	            
	        }else if (userPosition1 == 78)
	        {
	        	userPosition1=doing(userPosition1,DiceValue1);
	            
	        }else if (userPosition1 == 83)
	        {
	        	userPosition1=doing(userPosition1,DiceValue1);
	            
	        }else if (userPosition1 == 12)
	        {
	        	userPosition1=doing(userPosition1,DiceValue1);
	            
	        }else if (userPosition1 == 2)
	        {
	        	userPosition1=doing(userPosition1,DiceValue1);
	            
	        }else if(userPosition1 == 10) 
	        {
	            userPosition1 = userPosition1 - DiceValue1; 
	            System.out.println ("\t\t\t\t~~~~~~~~~~~~~You Got Bit By A Snake, GO DOWN By "+DiceValue1+"!!!~~~~~~~~~~~~~");
	        }
	        else if (userPosition1 == 27)
	        {
	        	userPosition1 = userPosition1-DiceValue1;
	        	System.out.println ("\t\t\t\t~~~~~~~~~~~~~You Got Bit By A Snake, GO DOWN By "+DiceValue1+"!!!~~~~~~~~~~~~~");
	            
	        }else if (userPosition1 == 35)
	        {
	        	userPosition1 = userPosition1-DiceValue1; 
	        	System.out.println ("\t\t\t\t~~~~~~~~~~~~~You Got Bit By A Snake, GO DOWN By "+DiceValue1+"!!!~~~~~~~~~~~~~");
	        }else if (userPosition1 == 56)
	        {
	        	userPosition1 = userPosition1-DiceValue1; 
	        	System.out.println ("\t\t\t\t~~~~~~~~~~~~~You Got Bit By A Snake, GO DOWN By "+DiceValue1+"!!!~~~~~~~~~~~~~");
	            
	        }else if (userPosition1 == 68)
	        {
	        	userPosition1 = userPosition1-DiceValue1; 
	        	System.out.println ("\t\t\t\t~~~~~~~~~~~~~You Got Bit By A Snake, GO DOWN By "+DiceValue1+"!!!~~~~~~~~~~~~~");
	            
	        } 
	        return userPosition1; 
	    }
	 
	    
}

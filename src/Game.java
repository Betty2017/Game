import java.util.Scanner;
	
public class Game {
	
	public static void main(String[] args) {
			String cho1,cho2,cho3, cho4 ; 
			double ave;
			
			System.out.println( "WELCOME TO Betty'S TINY ADVENTURE!");
			Scanner keyboard = new Scanner(System.in);
			
			System.out.println( "You are in a creepy house!  Would you like to go 'upstairs' or into the 'kitchen'" );
			cho1 = keyboard.next();
			
			if (cho1.equals("upstairs"))
			{
				System.out.println("There is a door upstair would you go 'inside' or 'no' ");
				cho2 = keyboard.next();
				if (cho2.equals("inside")){
				System.out.println("It is a dark room and you lock out your self ");
				}
				else 
				 System.out.println("Out of the Game ");
			}
			
			else			
			System.out.println("There is a long countertop with dirty dishes everywhere.  Off to one side there is, as you'd expect, a refrigerator. You may open the 'refrigerator'or look in a 'cabinet'.");
			cho3 = keyboard.next();
			 {
				 if (cho3.equals("refrigerator")){
					 System.out.println("Congrats!!You will Get Fresh Mill ");
					 
				 }
				 else 
					 System.out.println(" Sorry Nothing in the Cabinet ");
			 }
			System.out.println("End of the Game"); 
			
			
			
		}
	}

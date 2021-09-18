package com.navya.javaprogram;

/*
 *1> Snake and Ladder game play with single player at start position 0 .
 *2> The player roll the die and get the number between 1 to 6 .
 *3> Check option they are no play, Ladder or Snake .
 *4> Repeat till the Player reaches the winning position 100.
 *5> Ensure the player gets to exact winning position 100.
 */

public class SnakeLadderGame
{
	//Class level variables
	static int total=0;

	//use method to roll die

	static void rolldie()
	{
		int min=1;
		int max=6;
		int dieNumber= (int) Math.floor(Math.random()*(max-min)+min);
		
		System.out.println("Die = "+dieNumber);
		
		
		if (total <= 100) 
		{
			total=total+dieNumber; //check player position after every die
			
			System.out.println("Player in the position = "+total);
			switch (total)
			{
			case 10:
				    System.out.println("Ladder");
				    total=total+10;
				    System.out.println("After Ladder = "+total);
				    break;
			case 20:
			        System.out.println("Snake");
			        total=total-5;
			        System.out.println("After Snake = "+total);
			        break;
			case 30:
				    System.out.println("Ladder");
				    total=total+10;
				    System.out.println("After Ladder = "+total);
				    break;
			case 40:
				    System.out.println("Snake");
				    total=total-5;
				    System.out.println("After Snake ="+total);
				    break;
			case 50:
				    System.out.println("Ladder");
				    total=total+10;
				    System.out.println("After Ladder = "+total);
				    break;
			case 60:
				    System.out.println("Snake");
				    total=total-5;
				    System.out.println("After snake = "+total);
				    break;
			case 70:
				    System.out.println("Ladder");
				    total=total+10;
				    System.out.println("After Ladder = "+total);
				    break;
			case 80:
				    System.out.println("Snake");
				    total=total-5;
				    System.out.println("After snake = "+total);
				    break;
			case 90:
				    System.out.println("Ladder");
				    total=total-10;
				    System.out.println("After Ladder = "+total);
				    break;
			case 100:
				     System.out.println("Exit"); // After reach 100 exit game.
				     break;	    	    
			}
		}
		else
		{
			rolldie();
		}
		
	}
	
	static void checkPlayer(int check) 
	{
		// check they are no play or go to die
		switch (check)
		{
		case 0:
			   System.out.println("They are no play");
			   break;
		case 1:
			   rolldie();
			   break;
		case 2:
			   rolldie();
			   break;
		default:
			    System.out.println("Some thing went wrong");
		}
	}
	
  public static void main(String[] args)
 {
    int position=0;
    int player = 1;
    System.out.println("Player in the Position = " +position);
    
    while (total < 100)
    {
    	
    int check = (int) Math.floor((Math.random()*10) % 3 );
    
    // static method call
    checkPlayer(check);
    	}
    }
}
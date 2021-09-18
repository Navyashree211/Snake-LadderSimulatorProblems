package com.navya.javaprogram;

/*
 *1> Snake and Ladder game play with single player at start position 0 .
 *2> The player roll the die and get the number between 1 to 6 .
 *3> Check option they are no play, Ladder or Snake .
 */

public class SnakeLadderGame
{

	//use method to roll die

	static void rolldie()
	{
		int min=1;
		int max=6;
		int dieNumber= (int) Math.floor(Math.random()*(max-min)+min);
		
		System.out.println("Die = "+dieNumber);
	}
	
	static void checkPlayer(int check) 
	{
		// check they are no play, ladder or snake
		switch (check)
		{
		case 0:
			   System.out.println("They are no play");
			   break;
		case 1:
			   System.out.println("Ladder");
			   rolldie();
			   break;
		case 2:
			   System.out.println("Snake");
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
    
    //Generate random number
    int check = (int) Math.floor((Math.random()*10) % 3 );
    
    // static method call
    checkPlayer(check);
	}
 }

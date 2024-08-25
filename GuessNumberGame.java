

import java.util.Scanner;

public class GuessNumberGame {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int targetGuess=8;
		int userGuess=-1;
		
		while(userGuess!=targetGuess)
		{
			System.out.println("---------------------------------------------------------------");
			System.out.println("Welcome To Guess The Number Game ");
			System.out.println("---------------------------------------------------------------");
			System.out.println("Guess The Number From 1 To 10");
			System.out.println("Enter Your Guess :: ");
			userGuess=sc.nextInt();
			
			if(userGuess<targetGuess)
			{
				System.out.println("To Low Try again !!!");
			}
			else if(userGuess>targetGuess)
			{
				System.out.println("To High Try again !!!");
			}
			else
			{
				System.out.println("Wohooo !!! \n You Succesfully Guessed The Number :)");
			}
		}

	}

}

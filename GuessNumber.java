import java.util.Random;
import java.util.Scanner;
class GuessNumber
{
    public static void main(String[] args)
    {
        try
        {
            int guess,attempt;
            Scanner sc = new Scanner(System.in);			//This is Scanner class. We use this for taking user input.
            Random rand = new Random();				//created a random object rand
            System.out.println("==============================Welcome to Number Guessing Game!==============================");
            String play="yes";
            while(play.equals("yes"))
            {
                attempt=1;				//Reset the attempt count for each new game
                //Generate a random number between 1 to 100
                int ans= rand.nextInt(100)+1;			//rand.nextInt(100) method generates a random number from 0 to 99 so add 1
                System.out.println("Guess a number between 1 and 100: ");
                while(true)
                {
                    System.out.print("Guess a number: ");
                    guess = sc.nextInt();
                    //When it reaches the line play = sc.nextLine().toLowerCase();, it immediately consumes the newline character
                    //and moves on without waiting for the user to input their response. So if you add sc.nextLine() it consume the newline character left by nextInt()
                    sc.nextLine();
                    if(guess<ans)
                    {
                        System.out.println("Try a higher number!");
                        attempt++;
                    }
                    else if(guess>ans)
                    {
                        System.out.println("Try a lower number!");
                        attempt++;
                    }
                    else
                    {
                        System.out.println("Congratulations, you guessed the correct number after  "+attempt+" attempts");
                        break;
                    }
                }
                System.out.print("Do you want to play again?(Yes/No):");
                play=sc.nextLine().toLowerCase();
                //After reaches this line it immediately consumes the newline character and moves on without waiting for the user to input their response.
            }
            
        }
        
        catch(Exception e1)
        {
            System.out.print("Please enter the valid number");
            e1.printStackTrace();
        }
    }
}
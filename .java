import java.util.Random;
import java.util.Scanner;
class Main
{
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        String play = "yes";
        while(play.equals("yes"))
        {
            Random rand = new Random();
            int randNum = rand.nextInt(100);
            int guess = -1;
            int tries = 0;
            while(guess != randNum)
            {
                System.out.print("Guess any number from 1 to 100: ");
                guess = reader.nextInt();
                tries++;
                if(guess == randNum)
                {
                    System.out.print("Awesome!!! YOUR GUESS IS CORRECT");
                    System.out.print("It only took you " + tries + "guesses!!");
                    System.out.print("Would you like to play again?");
                    play = reader.next().toLowerCase();
                }
                else if(guess > randNum)
                {
                    System.out.println("Your guess is too high, Try again. ");
                }
                else
                {
                    System.out.print("Your guess is too low, Try again. ");

                }
            }
        }
        reader.close();
    }
}

/**
 * Write a description of class GuessingGame here.
 * 
 * @author Riyaa Randhawa
 * @version January 25, 2020
 */
import java.util.Scanner;

public class Game 
{
    private Scanner scanner;

    public Game()
    {
        scanner = new Scanner(System.in);
    }

    private int getIntegerFromUser()
    {
        return scanner.nextInt();
    }

    private int getGuessFromUser()
    {
        System.out.print("Choose a Number Between 1-10 Inclusive");
        return getIntegerFromUser();
    }

    private int getCommandFromUser()
    {
        System.out.print("Enter '1' to continue game or '2' to leave");
        return getIntegerFromUser();
    }

    private int generateRandomNumber()
    {
        return (int) ((Math.random()*10)+1);
    }

    private void playOneGame()
    {
        int randomNumber = generateRandomNumber();
        int guesses = 3;
        while (guesses > 0)
        {
            int userGuess = getGuessFromUser();
            guesses--;
            if (userGuess  == randomNumber)
            {
                System.out.println("Winner!");
                return;
            }
            else
            {
                System.out.println("Sorry, Wrong!");
                System.out.println("Guesses Left:" + guesses);
            }
        }
    }

    public void playGame()
    {
        while(getCommandFromUser() == 1)
        {
            playOneGame();
        }
    }
}


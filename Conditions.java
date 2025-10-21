import java.util.Scanner;

/**
 * Examples and notes on conditions (Chapter 5)
 *
 * @santigutierrezsch 
 * @21oct2025 
 */
public class Conditions
{
    public static void ifExample()
    {
        // model a coin flip; 1 is heads, 2 is tails
        int coinFlip = (int) (Math.random() * 2);
        
        /*
         * if statement
         * 
         * statements in the if block are executed if the conditional expression is true
         * 
         * Conditional expressions evaluate to either true or false
         *      It must go inside the parenthesis (unlike Python, there is no colon after the expression.
         * Statements are grouped by blocks, not indentation (i.e. {})
         *      (unlike Python, indentation doesnt matter)
         *  
         */
        
        if (coinFlip == 1)
        {
            System.out.println("coin is heads");
        }
        
        /*
         * {} are not required for a single statement
         *      However, they are always a good idea!
         *      Leaving them out can create bugs
         */
        if (coinFlip == 0)
            System.out.println("coin is tails");
            System.out.println("better luck next time...");
            
        /*
         * if, else statement
         * 
         * The else statement gets executed if the if statement is false.
         */
        if (coinFlip == 1)
        {
            System.out.println("coin is heads");
        } else {
            System.out.println("coin is tails");
        }
        
        // model the roll of a four sided die (1-4)
        int dieRoll = (int) ((Math.random() * 4) + 1);
        
        /*
         * if, else if, else statement
         * 
         *      unlike Python, Java uses else if instead of elif
         */
        if (dieRoll == 1)
        {
            System.out.println("Rolled a 1");
        } else if (dieRoll == 2)
        {
            System.out.println("Rolled a 2");
        } else if (dieRoll == 3) // can have as many else if statements as needed
        {
            System.out.println("Rolled a 3");
        } else // the else statement is never required
        {
            System.out.println("Rolled a 4");
        }
        
        // conditional/logic block new block starts at every singular if statement
    }   
}

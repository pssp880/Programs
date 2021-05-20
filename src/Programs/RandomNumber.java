package Programs;
import java.util.Random;
public class RandomNumber
{
    public static void main(String args[])
    {
// creating an object of Random class
        Random random = new Random();
// Generates random integers 0 to 49
        int x = random.nextInt(50);
// Generates random integers 0 to 999
        int y = random.nextInt(1000);
// Prints random integer values
        System.out.println("Randomly Generated Integers Values");
        System.out.println(x);
        System.out.println(y);

    }
}
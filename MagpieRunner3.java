/**
 * A simple class to run the Magpie class.
 * @author Joshua Hergenroeder
 * @version 05 October 2017
 */
import java.util.Scanner;
public class MagpieRunner3{
    //Create a Magpie, give it user input, and print its replies.
    public static void main(String[] args){
        Magpie3 maggie = new Magpie3();
        System.out.println (maggie.getGreeting());
        Scanner in = new Scanner (System.in);
        String statement = in.nextLine();
        while (!statement.equals("Bye")){
            System.out.println (maggie.getResponse(statement));
            statement = in.nextLine();
        }
    }
}

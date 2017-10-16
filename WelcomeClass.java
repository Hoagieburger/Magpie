/**
 * Write a description of class WelcomeClass here.
 * 
 * @author Joshua Hergenroeder
 * @version 09 October 2017
 */
public class WelcomeClass
{
    String str = "Welcome to class";
    int length;
    public static void printLetters(){
        System.out.println("W\ne\nl\nc\no\nm\ne\n\nt\no\n\nc\nl\na\ns\ns");
    }
    public int howLong(){
        length = str.length();
        return length;
    }
    public void printLetter(){
       for (int i = 0; i < str.length(); i++){
            System.out.println(str.substring(i, i + 1));
        }
    }
}
/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:
 * Uses indexOf to find strings
 * Handles responding to simple words and phrases 
 * This version uses a nested if to handle default responses.
 * @author Joshua Hergenroeder
 * @version 02 October 2017
 */
public class Magpie2
{
    /**
     * Get a default greeting   
     * @return a greeting
     */
    public String getGreeting()
    {
        return "Hello, let's talk.";
    }
    /**
     * Gives a response to a user statement
     * 
     * @param statement
     *            the user statement
     * @return a response based on the rules given
     */
    public String getResponse(String statement)
    {
        String response = "";
        if (statement.indexOf("no") >= 0){
            response = "Why so negative?";
        }else if(statement.indexOf("Hello darkness my old friend.") >= 0){
            response = "I've come to talk to you again.";
        }else if (statement.indexOf("what") >= 0){
            response = "Jiberish!";
        }else if (statement.indexOf("mother") >= 0
        || statement.indexOf("father") >= 0
        || statement.indexOf("sister") >= 0
        || statement.indexOf("brother") >= 0)
        {
            response = "Tell me more about your family.";
        }else if (statement.indexOf("catcher") >= 0 
        || statement.indexOf("pitcher") >= 0 
        || statement.indexOf("first") >= 0 
        || statement.indexOf("second") >= 0 
        || statement.indexOf("third") >= 0 
        || statement.indexOf("short") >= 0 
        || statement.indexOf("left") >= 0 
        || statement.indexOf("center") >= 0 
        || statement.indexOf("right") >= 0){
            response = "Cool. I catch.";
        }else if(statement.indexOf("dog") >= 0
        || statement.indexOf("cat") >= 0
        || statement.indexOf("fish") >= 0
        || statement.indexOf("bird") >= 0
        || statement.indexOf("pet") >= 0){
            response = "Tell me about your pet(s).";
        }else if (statement.indexOf("Mr. Wiebe") >=  0){
            response = "Tell me more about your awesome teacher.";
        }else if (statement.indexOf("baseball") >= 0){
            response = "Do you play baseball?";
        }else{
            response = getRandomResponse();
        }
        return response;
    }
    /**
     * Pick a default response to use if nothing else fits.
     * @return a non-committal string
     */
    private String getRandomResponse()
    {
        final int NUMBER_OF_RESPONSES = 8;
        double r = Math.random();
        int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
        String response = "";
        if (whichResponse == 0){
            response = "Interesting, tell me more.";
        }else if (whichResponse == 1){
            response = "Hmmm.";
        }else if (whichResponse == 2){
            response = "Do you really think so?";
        }else if (whichResponse == 3){
            response = "You don't say.";
        }else if (whichResponse == 4){
            response = "Get off my computer kid! You're going to break something.";
        }else if (whichResponse == 5){
            response = "I don't know what you are saying.";
        }else if (whichResponse == 6){
            response = "STOP TYPING RANDOM STUFF ON THE KEYBOARD! PLEASE!";
        }else if (whichResponse == 7){
            response = "Ich kann nicht verstanden dich. Du musst ein Dummkopf sein.";
        }
        return response;
    }
    private static void QuestionAnswers(){
        /**
         * 1) The code responds to the keyword as if it were not surrounded by other letters. The problem is you could get an undesired response from the bot because of the
         * sentence not being within the context.
         */
    }
}
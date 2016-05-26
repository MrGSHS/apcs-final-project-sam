
/**
 * Write a description of class Computer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class Computer
{
    public Computer()
    {
        
    }
    
    public static String randomMove()
    {
        String[] options = {"rock","paper","scissors"};
        int rand = (int)(Math.random()*3);
        return options[rand];
    }
    
    public static String advancedMove(ArrayList<String> moves)
    {
        for(String s : moves){
            int countrock=0;
            if(s.equals("rock"))
                countrock++;
            if(countrock/moves.size() > 2)
                return "paper";
        }
        return "paper";
    }
}


/**
 * Write a description of class game here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Game
{
    
    private String playerMove;
    private String compMove;
    public Game(String p, String c)
    {
        playerMove = p;
        compMove = c;
    }
    
    public String winner()
    {
        String player = playerMove;
        String comp = compMove;
        if(player.equals(comp))
            return "draw";
            
        if(player.equals("rock")){
            if(comp.equals("scissors"))
                return "Player";
            else 
                return "Comp";   
        }
            
        if(player.equals("paper")){
            if(comp.equals("rock"))
                return "Player";
            else 
                return "Comp";   
        }
        
        if(player.equals("scissors")){
            if(comp.equals("paper"))
                return "Player";
            else 
                return "Comp";   
        }
        
        else
            return null;
    }
    
    public String getPlayerMove()
    {
        return playerMove;
    }

    public String getCompMove()
    {
        return compMove;
    }
    
    public String toString()
    {
        return "Player's move: " + getPlayerMove() + "\t\tComputer's move: " +  getCompMove() + "\nWinner: " + winner();
    }
}


import java.awt.*;
import javax.swing.*;

/**
 * Class GameRunner - write a description of the class here
 * 
 * @author (your name) 
 * @version (a version number)
 */
import java.util.ArrayList;
import java.util.Scanner;
public class GameRunner
{
    //play screen
        //rock, paper, scissors buttons
        //shows winner screen, says play again
        //stores player's previous move in arrayList, shows rock, paper, scissors + counter of points
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Play?(y/n): ");
        String response = scan.next();
        
        int play=0;
        int comp=0;
        int draw=0;
        
        
        String compmove = "";
        ArrayList<String> moves = new ArrayList<String>();
        while(response.equals("y"))
        {
            System.out.print("Choose move(rock,paper,scissors): ");
            String playmove = scan.next();
            
            compmove = Computer.randomMove();
            if(play>comp)
            compmove = Computer.advancedMove(moves);
            
            Game g = new Game(playmove,compmove);
            
            moves.add(playmove);
            
            System.out.print(g + "\n\n");
            if(g.winner().equals("Player")){
                play++;
                compmove = Computer.advancedMove(moves);
            }
            if(g.winner().equals("Comp"))
            comp++;
            if(g.winner().equals("draw"))
            draw++;
            System.out.print("Player: " + play + "\tDraw: " + draw + "\tComputer: " + comp + "\n\n");

            
            System.out.print("Play again?(y/n): ");
            response = scan.next();
        }
        
        
        
    }
}

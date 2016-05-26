
import java.awt.*;
import javax.swing.*;

/**
 * Class Runner - write a description of the class here
 * 
 * @author (your name) 
 * @version (a version number)
 */

import java.awt.*;
import java.applet.Applet;
import java.awt.event.*;
public class Runner extends JApplet implements ActionListener
{
    private Button rockButton;
    private Button paperButton;
    private Button scissorsButton;
    private String buttonPressed="";
    
    public void init()
    {
        rockButton = new Button("Rock");
        paperButton = new Button("Paper");
        scissorsButton = new Button("Paper");
        add(rockButton);
        add(paperButton);
        add(scissorsButton);
        rockButton.addActionListener(this);
        paperButton.addActionListener(this);
        scissorsButton.addActionListener(this);
    }
    
    
    
    
}

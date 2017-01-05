//This class makes a frame for the GUI.
package project2_tharp;

import javax.swing.JFrame;


public class MyFrame extends JFrame{
    //set the final int WIDTH and HEIGHT
    static final int WIDTH = 350, HEIGHT = 350;
    
    //constructor1
    public MyFrame (){
        super("My Frame");
        setFrame(WIDTH, HEIGHT);
    }
    
    //constructor2
    public MyFrame(String title){
        super(title);
        setFrame(WIDTH, HEIGHT);
    }
    
    //constructor3
    public MyFrame(String title, int width, int height){
        super(title);
        setFrame(width, height);
    }
    
    //display method
    public void display(){
        setVisible(true);
    }
    
    //setFrame method
    private void setFrame(int width, int height){
        setSize(width, height);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    }//end of the class

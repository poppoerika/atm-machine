
package project2_tharp;

import java.awt.GridLayout;
import javax.swing.JPanel;
//This class extends JPanel and has one constructor and one method, getInut1Text.

import javax.swing.JTextField;

public class IOPanel extends JPanel{
    private ATMMachinePanel atmPanel;
   
    //create text fields
    private JTextField input1Text = new JTextField("");
    
    //constructor
    public IOPanel(ATMMachinePanel atmPanel){
        this.atmPanel = atmPanel;
        setLayout(new GridLayout(1,1));
        add(input1Text);
    }
    
    //getInout1Text method
    public String getInput1Text(){
        return input1Text.getText();
    }
    }//end of IOPanel class

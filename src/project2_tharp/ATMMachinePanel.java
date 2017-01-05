//This class extends JPanel and designs the ATMMachinePanel which contains buttonPanel, ioPnael, radioButtonPanel.
package project2_tharp;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JPanel;

public class ATMMachinePanel extends JPanel{
    public IOPanel ioPanel = new IOPanel(this);
    public ButtonPanel buttonPanel = new ButtonPanel(this);
    public RadioButtonPanel radioButtonPanel = new RadioButtonPanel(this);
    
    //constructor
    public ATMMachinePanel(){
        setLayout(new BorderLayout());
        setBackground(Color.MAGENTA);
        add(buttonPanel, BorderLayout.NORTH);
        add(radioButtonPanel, BorderLayout.CENTER);
        add (ioPanel, BorderLayout.SOUTH);
    }
    
}//end of ATMMachinePanel class
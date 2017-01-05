//This class ectends JPanel and has two radio buttons, checking and savings, and two methods, isChecking and isSavings.
package project2_tharp;

import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.JRadioButton;


 public class RadioButtonPanel extends JPanel{
    private ATMMachinePanel atmPanel;
    private JRadioButton checkingRadio = new JRadioButton("Checking");
    private JRadioButton savingsRadio = new JRadioButton("Savings");
    //constructor
    public RadioButtonPanel(ATMMachinePanel atmPanel){
        this.atmPanel = atmPanel;
        setLayout(new GridLayout(1,2));
        add(checkingRadio);
        add(savingsRadio);
}
    //isChecking method to determine a selected radio button
    public boolean isChecking(){
        return checkingRadio.isSelected();
    }
    
    //isSavings method to determine a selected radio button
    public boolean isSavings(){
        return savingsRadio.isSelected();
    }
    }//end of RadioButtonPanel class

//This class extends Exception and has one constructor.
package project2_tharp;

import javax.swing.JOptionPane;


public class InsufficientFunds extends Exception{
    public InsufficientFunds(String message){
        JOptionPane.showMessageDialog(null, message);
    }
    
}

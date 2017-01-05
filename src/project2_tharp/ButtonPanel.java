
package project2_tharp;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;


public class ButtonPanel extends JPanel{
    //isNumeric method
    public boolean isNumeric(String input1TextStr)  {  
        try  {
            double i = Double.parseDouble(input1TextStr);  
        }  
        catch(NumberFormatException nfe){ 
            return false;  
        }  
        return true;  
      }//end of the isNumeric method
    //This class makes four buttons, withdraw, deposit, transferTo, and balance. 
    //Each button has an event handler.
    
    private Account checking = new Account (4000);
    private Account savings = new Account (2000);
    private ATMMachinePanel atmPanel;
    //make JButtons
    private JButton withdrawButton = new JButton("Withdraw");
    private JButton depositButton = new JButton("Deposit");
    private JButton transferToButton = new JButton("Transfer to");
    private JButton balanceButton = new JButton("Balance");
    
    //constructor
    public ButtonPanel(ATMMachinePanel atmPanel){
        this.atmPanel = atmPanel;
        setLayout(new GridLayout(2,2));
        add(withdrawButton);
        add(depositButton);
        add(transferToButton);
        add(balanceButton);
        
        //event listener for the withdrawButton
        withdrawButton.addActionListener(new ActionListener (){
            @Override
            public void actionPerformed(ActionEvent e){
                String input1TextStr = atmPanel.ioPanel.getInput1Text();
                boolean numeric = isNumeric(input1TextStr);
                int sumWithdraws = checking.getCount() + savings.getCount();
                try{
                    //check if the input is numeric and the checking radio button is selected.
                if(numeric == true && atmPanel.radioButtonPanel.isChecking() == true){
                    double doubleInput1Text = Double.parseDouble(input1TextStr);
                    
                    checking.withdraw(doubleInput1Text, sumWithdraws);
                    
                }
                //check if the input is numeric and the savings radio button is selected.
                else if(numeric == true && atmPanel.radioButtonPanel.isSavings() == true){
                    double doubleInput1Text = Double.parseDouble(input1TextStr);
                    savings.withdraw(doubleInput1Text, sumWithdraws);
                }
                }
                catch(InsufficientFunds er){
                    
                }
            }
        });
        
        //event listener for the depositButton
        depositButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
            String input1TextStr = atmPanel.ioPanel.getInput1Text();
                boolean numeric = isNumeric(input1TextStr);
                if(numeric == true && atmPanel.radioButtonPanel.isChecking() == true){
                    double doubleInput1Text = Double.parseDouble(input1TextStr);
                    checking.deposit(doubleInput1Text);
                }
                else if(numeric == true && atmPanel.radioButtonPanel.isSavings() == true){
                    double doubleInput1Text = Double.parseDouble(input1TextStr);
                    savings.deposit(doubleInput1Text);
                }
            }
        });
        
        //event listener for the transferToButton
        transferToButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
            String input1TextStr = atmPanel.ioPanel.getInput1Text();
                boolean numeric = isNumeric(input1TextStr);
                try{
                if(numeric == true && atmPanel.radioButtonPanel.isChecking() == true){
                    double doubleInput1Text = Double.parseDouble(input1TextStr);
                    savings.withdraw(doubleInput1Text,0);
                    checking.deposit(doubleInput1Text);
                }
                else if(numeric == true && atmPanel.radioButtonPanel.isSavings() == true){
                   double doubleInput1Text = Double.parseDouble(input1TextStr);
                    checking.withdraw(doubleInput1Text,0);
                    savings.deposit(doubleInput1Text);
                }
                }
                catch(InsufficientFunds er){
                   
                }
            }
        });
        
       //event listnener for the balanceButton
        balanceButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                if(atmPanel.radioButtonPanel.isChecking() == true){
                    checking.balance("Checking");
                }
                else if(atmPanel.radioButtonPanel.isSavings() == true){
                    savings.balance("Savings");
                }
            }
        });
        
    }
    
    
    
}//end of ButtonPanel class
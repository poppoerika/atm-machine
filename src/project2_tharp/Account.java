//This class has one constructor, four methods, getCount, withdraw, deposit, and balance.
package project2_tharp;

import javax.swing.JOptionPane;


public class Account {
    private double money;
    private int count = 0;
    
    //constructor
    public Account(int money){
        this.money = money;
    }
    
    //getCount method
    public int getCount(){
        return count;
    }
    
    //withdraw method
    public void withdraw(double doubleInput1Text, int sumWithdraws)throws InsufficientFunds{
        //check if input is in increment of 20.
        if((doubleInput1Text%20) == 0){
            //check if a sum of withdraws is bigger than 3
            if(sumWithdraws > 3){
                    doubleInput1Text = doubleInput1Text + 1.5;
                    }
            //check if money is bigger than the input
            if(money > doubleInput1Text){
        money = this.money - doubleInput1Text;
        JOptionPane.showMessageDialog(null, "Withdrawl successful.");
        count++;
            }
            else 
                throw new InsufficientFunds("You do not have sufficient funds.");
        }
        else
            throw new InsufficientFunds("Withdrawl was not in increament of $20.");
    }
    
    //deposit method
    public void deposit(double doubleInput1Text){
        money = this.money + doubleInput1Text;
        JOptionPane.showMessageDialog(null, "Deposit successful.");
    }
    
    //balance method
    public void balance(String str){
        JOptionPane.showMessageDialog(null, str + " account has:" + money);
    }
}

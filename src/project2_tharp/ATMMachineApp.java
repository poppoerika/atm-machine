//This class extends MyFrame and sets new frame for the GUI.
package project2_tharp;

public class ATMMachineApp extends MyFrame{
    //constructor
   public ATMMachineApp(){
       super("ATM Machine", 400, 180);
       add(new ATMMachinePanel());
   }
}//end of ATMMachineApp class

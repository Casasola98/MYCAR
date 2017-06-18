
package ejemplo;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.JLabel;

public class ThreadManager extends Thread{
    private JLabel Updating;
    public ArrayList<Icon> A;
    public Road theR;
    
    public ThreadManager(JLabel Update, ArrayList<Icon> A){
        Updating = Update;
        this.A = A; 
    }
    
    @Override
    public void run(){
        int counter = 0;
        while (counter < 500000000){
            for (int i =0; i < A.size();i++){
                System.out.println("Entra");
                Updating.setIcon(A.get(i));
                try {
                    if ((0 < theR.Speed) && (theR.Speed< 20 ))
                        Thread.sleep(800);
                    if ((20 < theR.Speed) && (theR.Speed< 40 ))
                        Thread.sleep(600);
                    if ((40 < theR.Speed) && (theR.Speed< 60 ))
                        Thread.sleep(400);
                    if ((60 < theR.Speed) && (theR.Speed< 80 ))
                        Thread.sleep(300);
                    if ((80 < theR.Speed) && (theR.Speed< 100 ))
                        Thread.sleep(200);
                    if ((100 < theR.Speed) && (theR.Speed< 120 ))
                        Thread.sleep(100);
                    if ((120 < theR.Speed))
                        Thread.sleep(50);
                } catch (InterruptedException ex) {
                    Logger.getLogger(ThreadManager.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            counter++;
        }
        
    }
    
}

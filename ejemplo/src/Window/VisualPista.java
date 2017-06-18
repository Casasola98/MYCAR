
package Window;


import FactoryP.*;
import ejemplo.Road;
import ejemplo.ThreadManager;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class VisualPista implements Observer {
    
    JLabel Paisaje = new JLabel();
    ArrayList<Icon> A = new ArrayList<Icon>(); 
    boolean a = false;
    ThreadManager B;
    FactorySelection SelectionFac;
    
    public VisualPista(){
        ImageIcon icon1 = new ImageIcon("IMAGENES/D1.png");
        Icon Icon1 = icon1;
        Paisaje.setBounds(0, 0, Icon1.getIconWidth(), Icon1.getIconHeight());
        Paisaje.setIcon(Icon1);
        B = new ThreadManager(Paisaje,A);
    }
    
    public void changeImage(){
        ImageIcon icon1 = new ImageIcon("IMAGENES/D2.png");
        Icon Icon1 = icon1;
        A.add(Icon1);
        icon1 = new ImageIcon("IMAGENES/D3.png");
        Icon1 = icon1;
        A.add(Icon1);
        icon1 = new ImageIcon("IMAGENES/D4.png");
        Icon1 = icon1;
        A.add(Icon1);
        Paisaje.setIcon(Icon1);
        B = new ThreadManager(Paisaje,A);
        B.start();
    }
    
    @Override
    public void update(Observable o, Object arg) {   
        
        Road ARoad = (Road) arg;
        String ab = ARoad.ActualRoad.theTravel.get(ARoad.Distance / 100);
        if (ab.equals(".")){
            System.out.println("si");
            OneHundredRoad place = new OneHundredRoad(); 
            B.A = place.iconsD;
            B.theR = ARoad;
        }
        else if (ab.equals("T")){
            System.out.println("si");
            Intersection place = new Intersection(); 
            B.A = place.iconsTD;
            B.theR = ARoad;
        }
        else if (ab.equals("+")){
            System.out.println("si");
            FourCorners place = new FourCorners(); 
            B.A = place.iconsCD;
            B.theR = ARoad;
        }
        else if (ab.equals("F")){
            B.theR = ARoad;
        }
        if (!a){
            B.start();
            a = true;
        }
    }
    
}

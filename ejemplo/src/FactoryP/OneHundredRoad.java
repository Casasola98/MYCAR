
package FactoryP;

import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class OneHundredRoad implements TypeFactory {
    public ArrayList<Icon> iconsD = new ArrayList<Icon>();
    public ArrayList<Icon> iconsN = new ArrayList<Icon>();
    
    public OneHundredRoad(){
        ImageIcon D1 = new ImageIcon("IMAGENES/D1.png");
        Icon Icon1 = D1;
        ImageIcon D2 = new ImageIcon("IMAGENES/D2.png");
        Icon Icon2 = D2;
        ImageIcon D3 = new ImageIcon("IMAGENES/D3.png");
        Icon Icon3 = D3;
        ImageIcon D4 = new ImageIcon("IMAGENES/D4.png");
        Icon Icon4 = D4;
        ImageIcon D5 = new ImageIcon("IMAGENES/D5.png");
        Icon Icon5 = D5;
        ImageIcon D6 = new ImageIcon("IMAGENES/D6.png");
        Icon Icon6 = D6;
        ImageIcon D7 = new ImageIcon("IMAGENES/D7.png");
        Icon Icon7 = D7;
        ImageIcon N1 = new ImageIcon("IMAGENES/N1.png");
        Icon Icon11 = N1;
        ImageIcon N2 = new ImageIcon("IMAGENES/N2.png");
        Icon Icon12 = N2;
        ImageIcon N3 = new ImageIcon("IMAGENES/N3.png");
        Icon Icon13 = N3;
        ImageIcon N4 = new ImageIcon("IMAGENES/N4.png");
        Icon Icon14 = N4;
        ImageIcon N5 = new ImageIcon("IMAGENES/N5.png");
        Icon Icon15 = N5;
        ImageIcon N6 = new ImageIcon("IMAGENES/N6.png");
        Icon Icon16 = N6;
        ImageIcon N7 = new ImageIcon("IMAGENES/N7.png");
        Icon Icon17 = N7;
        iconsD.add(Icon1);
        iconsD.add(Icon2);
        iconsD.add(Icon3);
        iconsD.add(Icon4);
        iconsD.add(Icon5);
        iconsD.add(Icon6);
        iconsD.add(Icon7);
        System.out.println(iconsD.size());
        iconsN.add(Icon11);
        iconsN.add(Icon12);
        iconsN.add(Icon13);
        iconsN.add(Icon14);
        iconsN.add(Icon15);
        iconsN.add(Icon16);
        iconsN.add(Icon17);
    }
    
    @Override 
    public void paint(){
        
    }
    
}

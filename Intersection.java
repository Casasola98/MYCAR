
package FactoryP;

import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Intersection implements TypeFactory {
    
    public ArrayList<Icon> iconsTD = new ArrayList<Icon>();
    public ArrayList<Icon> iconsTN = new ArrayList<Icon>();
    public void chancheImage(){
         ImageIcon T1 = new ImageIcon("IMAGENES/T1.png");
    Icon Icon1 = T1;
    ImageIcon T2 = new ImageIcon("IMAGENES/T2.png");
    Icon Icon2 = T2;
    ImageIcon T3 = new ImageIcon("IMAGENES/T3.png");
    Icon Icon3 = T3;
    ImageIcon T4 = new ImageIcon("IMAGENES/T4.png");
    Icon Icon4 = T4;
    ImageIcon T5 = new ImageIcon("IMAGENES/T5.png");
    Icon Icon5 = T5;
    ImageIcon T6 = new ImageIcon("IMAGENES/T6.png");
    Icon Icon6 = T6;
    ImageIcon T7 = new ImageIcon("IMAGENES/T7.png");
    Icon Icon7 = T7;
    ImageIcon T11 = new ImageIcon("IMAGENES/T11.png");
    Icon Icon11 = T11;
    ImageIcon T21 = new ImageIcon("IMAGENES/T21.png");
    Icon Icon21 = T21;
    ImageIcon T31 = new ImageIcon("IMAGENES/T31.png");
    Icon Icon31 = T31;
    ImageIcon T41 = new ImageIcon("IMAGENES/T41.png");
    Icon Icon41 = T41;
    ImageIcon T51 = new ImageIcon("IMAGENES/T51.png");
    Icon Icon51 = T51;
    ImageIcon T61 = new ImageIcon("IMAGENES/T61.png");
    Icon Icon61 = T61;
    ImageIcon T71 = new ImageIcon("IMAGENES/T71.png");
    Icon Icon71 = T71;
    iconsTD.add(Icon4);
    iconsTD.add(Icon1);
    iconsTN.add(Icon11);
    iconsTD.add(Icon7);
    iconsTD.add(Icon6);
    iconsTD.add(Icon2);
    iconsTD.add(Icon3);
    iconsTD.add(Icon5);
    iconsTN.add(Icon21);
    iconsTN.add(Icon31);
    iconsTN.add(Icon41);
    iconsTN.add(Icon51);
    iconsTN.add(Icon61);
    iconsTN.add(Icon71);
    
    
}
    @Override 
    public void paint(){
        
    }
    
}

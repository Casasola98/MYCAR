
package FactoryP;

import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class FourCorners implements TypeFactory {
   public ArrayList<Icon> iconsCD = new ArrayList<Icon>();
    public ArrayList<Icon> iconsCN = new ArrayList<Icon>();
    public FourCorners(){
    ImageIcon C1 = new ImageIcon("IMAGeNES/+1.png");
    Icon Icon1 = C1;
    ImageIcon C2 = new ImageIcon("IMAGENES/+2.png");
    Icon Icon2 = C2;
    ImageIcon C3 = new ImageIcon("IMAGENES/+3.png");
    Icon Icon3 = C3;
    ImageIcon C4 = new ImageIcon("IMAGENES/+4.png");
    Icon Icon4 = C4;
    ImageIcon C5 = new ImageIcon("IMAGENES/+5.png");
    Icon Icon5 = C5;
    ImageIcon C6 = new ImageIcon("IMAGENES/+6.png");
    Icon Icon6 = C6;
    ImageIcon C7 = new ImageIcon("IMAGENES/+7.png");
    Icon Icon7 = C7;
    ImageIcon C11 = new ImageIcon("IMAGENES/+11.png");
    Icon Icon11 = C11;
    ImageIcon C21 = new ImageIcon("IMAGENES/+21.png");
    Icon Icon21 = C21;
    ImageIcon C31 = new ImageIcon("IMAGENES/+31.png");
    Icon Icon31 = C31;
    ImageIcon C41 = new ImageIcon("IMAGENES/+41.png");
    Icon Icon41 = C41;
    ImageIcon C51 = new ImageIcon("IMAGENES/+51.png");
    Icon Icon51 = C51;
    ImageIcon C61 = new ImageIcon("IMAGENES/+61.png");
    Icon Icon61 = C61;
    ImageIcon C71 = new ImageIcon("IMAGENES/+71.png");
    Icon Icon71 = C71;
    iconsCD.add(Icon1);
    iconsCD.add(Icon2);
    iconsCN.add(Icon11);
    iconsCD.add(Icon3);
    iconsCD.add(Icon4);
    iconsCD.add(Icon5);
    iconsCD.add(Icon6);
    iconsCD.add(Icon7);
    iconsCN.add(Icon21);
    iconsCN.add(Icon31);
    iconsCN.add(Icon41);
    iconsCN.add(Icon51);
    iconsCN.add(Icon61);
    iconsCN.add(Icon71);
    }
    @Override 
    public void paint(){  
    }

}

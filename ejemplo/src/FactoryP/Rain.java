
package FactoryP;

import FactoryP.TypeFactory;
import javax.swing.JOptionPane;

public class Rain implements TypeFactory {
    @Override 
    public void paint(){
        JOptionPane.showMessageDialog(null, "PRECAUCIÓN, LLUVIA");
        
    }
    
}


package BridgeP;

import BridgeP.AbstractSystem;

public class DirectionSystem implements AbstractSystem{
    
    private Systems newSystem;
    
    public DirectionSystem(Systems newSystem){
        this.newSystem = newSystem;
    }
    
    public void action(){
        newSystem.action();
    }
    
}

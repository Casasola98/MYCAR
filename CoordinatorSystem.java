
package BridgeP;

import BridgeP.AbstractSystem;

public class CoordinatorSystem implements AbstractSystem{
    private Systems newSystem;
    public CoordinatorSystem(Systems newSystem){
        this.newSystem = newSystem;
    }
    public void action(){
        newSystem.action();
    }
}

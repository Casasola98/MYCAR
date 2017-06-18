
package BridgeP;

import BridgeP.Systems;

public class Electric implements Systems{

    public boolean Lights;
    public boolean RightDirectional;
    public boolean LeftDirectional;
    public boolean Wipers;
    
    public Electric(){
        setLights(false);
        setRightDirectional(false);
        setLeftDirectional(false);
        setWipers(false);
    }
    
    public boolean getLights() {
        return Lights;
    }

    public void setLights(boolean Lights) {
        this.Lights = Lights;
    }

    public boolean getRightDirectional() {
        return RightDirectional;
    }

    public void setRightDirectional(boolean RightDirectional) {
        this.RightDirectional = RightDirectional;
    }

    public boolean getLeftDirectional() {
        return LeftDirectional;
    }

    public void setLeftDirectional(boolean LeftDirectional) {
        this.LeftDirectional = LeftDirectional;
    }

    public boolean getWipers() {
        return Wipers;
    }

    public void setWipers(boolean Wipers) {
        this.Wipers = Wipers;
    }
    
    public void action(){
        //aca se debe modificar la accion inical
    }
    
    
}

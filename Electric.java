
package Bridge;

import Bridge.Systems;

public class Electric implements Systems{

    boolean Lights;
    boolean RightDirectional;
    boolean LeftDirectional;
    boolean Wipers;
    
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

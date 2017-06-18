
package BridgeP;

import static ejemplo.IConstants.MIN_GEAR;
import java.util.Observable;
import java.util.Observer;

public final class Dash extends Observable implements Systems{
    
    Observer VisualSystem;
    
    public double RPS = 0;
    public double Speed = 0;
    public int ActualGear = MIN_GEAR;
    public boolean Lights;
    public boolean RightDirectional;
    public boolean LeftDirectional;
    public boolean Wipers;
    
    public Dash(Observer pObserver){
        addObserver(pObserver);
        Lights = false;
        RightDirectional = false;
        LeftDirectional = false;
        Wipers = false;
    }
    
    public void action(){
    //crear
    }  
    
    @Override
    public void notifyObservers(Object arg){
        VisualSystem.update(this, arg);
    }

    @Override
    public synchronized void addObserver(Observer o) {
            VisualSystem = o;
    }

}


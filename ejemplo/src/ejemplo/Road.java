
package ejemplo;

import BridgeP.Engine;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;


public class Road extends Observable implements IConstants{
    
    public Observer VisualSystem;
    
    public Travel [] Roads; 
    public Travel ActualRoad;
    public ThreadManager Rolling;
    public int Distance;
    public int Speed;
    public Engine TheEngine;
    
    public Road(Observer pObserver){
        this.Roads = new Travel[3];
        Roads[0] = new Travel(File1);
        Roads[1] = new Travel(File2);
        Roads[2] = new Travel(File3);
        addObserver(pObserver);
    }

    public void ActualRoute(int pRoad){
        ActualRoad = Roads[pRoad]; 
    }
    
    public void Speeder(int pRoad){
        Distance = pRoad; 
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

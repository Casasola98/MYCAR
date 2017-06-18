
package ejemplo;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;


public class Road extends Observable implements IConstants{
    
    Travel [] Roads; 
    Travel ActualRoad;
    
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
    
    @Override
    public void notifyObservers(Object arg){
        super.notifyObservers(arg);

        }

    @Override
    public synchronized void addObserver(Observer o) {
            super.addObserver(o); 
    }
    
}

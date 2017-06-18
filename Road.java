
package ejemplo;

import java.util.Observable;
import java.util.Observer;

public class Road extends Observable{
    //atributos
    
    @Override
public void notifyObservers(Object arg){
    super.notifyObservers(arg);
        
    }

@Override
public synchronized void addObserver(Observer o) {
        super.addObserver(o); 
}
    
}

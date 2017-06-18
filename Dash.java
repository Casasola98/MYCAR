
package Bridge;

import java.util.Observable;
import java.util.Observer;

public class Dash extends Observable implements Systems{
    //ATRIBUTOS

    public void action(){
    //crear
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


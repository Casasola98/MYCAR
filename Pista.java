/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo;
import java.util.Observable;
import java.util.Observer;
/**
 *
 * @author Daniela
 */
public class Pista extends Observable{
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

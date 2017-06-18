package ejemplo;

import BridgeP.Dash;
import BridgeP.Engine;
import static ejemplo.IConstants.*;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JLabel;

public class Time  {

    private Timer timer = new Timer(); 
    private int segundos=0;
    Engine TheEngine;
    Dash TheDash;
    Road theRoad;
    int option;
    
    public Time(Engine pEngine, Dash pDash, Road theRoad, int option){
        TheEngine = pEngine;
        TheDash = pDash;
        this.theRoad = theRoad;
        this.option = option;
    }
    
    public void changeOption(int pOption){
        option = pOption;
    }
    //Clase interna que funciona como contador
    class Contador extends TimerTask {
        public void run() {
            
            if (option == 0)
                TheEngine.increaseRPS();
            else if (option == 2){
                TheEngine.brakeWheels();
                option = 1;
            }
            TheDash.Speed= TheEngine.Speed;
            TheDash.RPS= TheEngine.RPS;
            TheDash.ActualGear= TheEngine.ActualGear;
            
            segundos++;
            
            theRoad.TheEngine = TheEngine;
            
            theRoad.Speed = TheEngine.Speed;
            
            theRoad.Distance = TheEngine.calculateDistance(segundos);
            
            TheDash.notifyObservers(TheDash);
            theRoad.notifyObservers(theRoad);
            
        }
    }
    //Crea un timer, inicia segundos a 0 y comienza a contar
    public void Contar()
    {
        timer = new Timer();
        timer.schedule(new Contador(), 0, 1000);
    }
    //Detiene el contador
    public void Detener() {
        timer.cancel();
    }
    //Metodo que retorna los segundos transcurridos
    public int getSegundos()
    {
        return this.segundos;
    }
}

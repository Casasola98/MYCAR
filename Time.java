package ejemplo;

import java.util.Timer;
import java.util.TimerTask;

public class Time  {

    private Timer timer = new Timer(); 
    private int segundos=0;
    Engine TheEngine;
    
    public Time(Engine pEngine){
        TheEngine = pEngine;
    }
    
    
    //Clase interna que funciona como contador
    class Contador extends TimerTask {
        public void run() {
            segundos++;
            TheEngine.increaseRPS();
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
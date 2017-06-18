package ejemplo;

import Bridge.Engine;
import static ejemplo.IConstants.*;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JLabel;

public class Time  {

    private Timer timer = new Timer(); 
    private int segundos=0;
    Engine TheEngine;
    JLabel KM;
    JLabel REVOLUTIONS;
    
    public Time(Engine pEngine, JLabel A, JLabel B){
        TheEngine = pEngine;
        REVOLUTIONS = A;
        KM = B;
    }
    
    
    //Clase interna que funciona como contador
    class Contador extends TimerTask {
        public void run() {
            segundos++;
            TheEngine.increaseRPS();
            REVOLUTIONS.setText(REVS + TheEngine.RPS);
            KM.setText(TheEngine.Speed + KM_H);
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


package BridgeP;

import static ejemplo.IConstants.*;
import BridgeP.Systems;

public class Engine implements Systems{
    
    public double RPS;
    public double AddingRPS;
    public int ActualGear;
    public int Speed;
    
    public Engine(){
        RPS = 0;
        Speed = 0;
        AddingRPS = FIRST_GEAR_MAX_RPS;
        ActualGear = MIN_GEAR;
    }
    
     public void action(){
        
    }
    
     public int calculateDistance(int seconds){
         int Distance = (Speed * 1000 * seconds)/3600;
         return Distance;
     }
     
    public void increaseRPS(){
        
        RPS+= AddingRPS;
        RPS= RPS*100;
        RPS= (int)RPS;
        RPS/= 100;
        
        calculateSpeed();
        
    }
    
    public void calculateSpeed(){
        
        Speed = (int) ((PI * WHEEL_DIAMETER * RPS * 60)/1000);
        
    }
    
    public void brakeWheels(){
        
        if (Speed > 0){
            Speed-= 3;
            if (Speed < 0)
                Speed = 0;
            RPS = ((Speed*1000)/(PI*WHEEL_DIAMETER*60));
        }
        
    }
    
    public void advanceGear(){
        if (ActualGear < MAX_GEAR){
            ActualGear++;
            switch(ActualGear){
                case 1:
                    AddingRPS = FIRST_GEAR_MAX_RPS;
                    break;
                case 2:
                    AddingRPS = SECOND_GEAR_MAX_RPS;
                    break;
                case 3:
                    AddingRPS = THIRD_GEAR_MAX_RPS;
                    break;
                case 4:
                    AddingRPS = FOURTH_GEAR_MAX_RPS;
                    break;
                case 5:
                    AddingRPS = FIFTH_GEAR_MAX_RPS;
                    break;
                    
            }
        }
    }
    
    public void decreaseGear(){
        if (ActualGear > MIN_GEAR){
            ActualGear--;
            switch(ActualGear){
                case 1:
                    AddingRPS = FIRST_GEAR_MAX_RPS;
                    break;
                case 2:
                    AddingRPS = SECOND_GEAR_MAX_RPS;
                    break;
                case 3:
                    AddingRPS = THIRD_GEAR_MAX_RPS;
                    break;
                case 4:
                    AddingRPS = FOURTH_GEAR_MAX_RPS;
                    break;
                case 5:
                    AddingRPS = FIFTH_GEAR_MAX_RPS;
                    break;
                    
            }
        }
    }
    
}

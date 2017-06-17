/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo;

import java.lang.Number;
import static ejemplo.IConstants.*;

public class Engine {
    
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
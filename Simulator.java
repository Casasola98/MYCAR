
package ejemplo;

import BridgeP.*;
import java.util.Observer;

public class Simulator {
    Road TheRoad;
    public Dash TheDash;
    Direction TheDirection;
    Electric ElectricSystem;
    Engine TheEngine;
    Obstacles RoadObstacles;
    boolean Moving;
    Time TheTimer;
    
    public Simulator(Observer RoadObserver){
        TheRoad = new Road(RoadObserver);
        Moving = false;
    }
    
    public void ChooseRoad(int option){
        TheRoad.ActualRoute(option);
    }
    
    public void chargeSystems(Observer DashObserver){
        TheDash = new Dash(DashObserver);
        TheEngine = new Engine();
        ElectricSystem = new Electric();
        TheDirection = new Direction();
        RoadObstacles = new Obstacles();
        TheTimer = new Time(TheEngine,TheDash,0);
    }
    
    public void advanceGear(){
        TheEngine.advanceGear();
    }
    
    public void decreaseGear(){
        TheEngine.decreaseGear();
    }
    
    public void RD(){
        ElectricSystem.RightDirectional = ! ElectricSystem.getRightDirectional();
        ElectricSystem.LeftDirectional = false;
        TheDash.RightDirectional = ElectricSystem.RightDirectional;
        TheDash.LeftDirectional = ElectricSystem.LeftDirectional;
    }
    
    public void LD(){
        ElectricSystem.LeftDirectional = ! ElectricSystem.getLeftDirectional();
        ElectricSystem.RightDirectional = false;
        TheDash.RightDirectional = ElectricSystem.RightDirectional;
        TheDash.LeftDirectional = ElectricSystem.LeftDirectional;
    }
    
    public void Wipers(){
        ElectricSystem.Wipers = ! ElectricSystem.getWipers();
        TheDash.Wipers = ElectricSystem.Wipers;
    }
    
    public void Lights(){
        ElectricSystem.Lights = ! ElectricSystem.getLights();
        TheDash.Lights = ElectricSystem.Lights;
    }
    
    public void accelerate(){
        if (! Moving){
                TheTimer.Contar();
                Moving = true;
        }
        else
            TheTimer.changeOption(0);
    }
    
    public void roll(){
        
        TheTimer.changeOption(1);
        
    }
    
    public void brakeCar(){
        
        TheTimer.changeOption(2);
        
    }
    
}

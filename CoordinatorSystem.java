/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo;

/**
 *
 * @author Daniela
 */
public class CoordinatorSystem implements AbstractSystem{
    private Systems newSystem;
    public CoordinatorSystem(Systems newSystem){
        this.newSystem = newSystem;
    }
    public void action(){
        newSystem.action();
    }
    
}

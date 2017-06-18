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

public class FactorySelection{
    public TypeFactory getType(String typeFactory){
        if(typeFactory == null){
            return null;
        }
        if(typeFactory.equalsIgnoreCase("rain")){
            return new Rain();
        }else{
            if(typeFactory.equalsIgnoreCase("OneHundredRoad")){
                return new OneHundredRoad();
            }else{
                if(typeFactory.equalsIgnoreCase("FourCorners")){
                    return new FourCorners();
                }else{
                    if(typeFactory.equalsIgnoreCase("Intersection")){
                        return new Intersection();
                    }
                }
            }
        }
        return null;
    }
}

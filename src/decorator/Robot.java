/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

/**
 *
 * @author AJuda
 */
public abstract class Robot {
    
    protected String robot = "Frame";
    
    public String robotData()
    {
        return robot;
    }
    
    public abstract double cost();
}

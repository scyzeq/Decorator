/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator.parts;

import decorator.PartsData;
import decorator.Robot;

/**
 *
 * @author AJuda
 */
public class Blade extends PartsData{
    
    Robot robot;
    
    public Blade(Robot robot)
    {
        this.robot = robot;
    }
    
    public String robotData()
    {
        return robot.robotData() + " Blade";
    }
    
    public double cost()
    {
        return robot.cost() + 250;
    }
}

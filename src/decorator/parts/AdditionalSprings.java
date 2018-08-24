/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator.parts;

import decorator.Heavy;
import decorator.Light;
import decorator.PartsData;
import decorator.Robot;

/**
 *
 * @author AJuda
 */
public class AdditionalSprings extends PartsData
{
    Robot robot;
    
    public AdditionalSprings(Robot robot)
    {
        this.robot = robot;
    }
    
    public String robotData()
    {
        return robot.robotData() + " additional springs";
    }
    
    public double cost()
    {
        if(robot instanceof decorator.Light)
            return robot.cost() + 15;
        else if(robot instanceof decorator.Heavy)
            return robot.cost() + 30;
        return 0;
    }
}

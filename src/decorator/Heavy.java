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
public class Heavy extends Robot{
    
    public Heavy()
    {
        robot = "Heavy frame";
    }
    
    
    public double cost()
    {
        return 2000;
    }
}

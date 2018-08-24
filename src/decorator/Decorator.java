/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

import decorator.parts.AdditionalSprings;
import decorator.parts.Grapple;

/**
 *
 * @author AJuda
 */
public class Decorator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Robot robotH = new Heavy();
        Robot robotH2 = new Heavy();
        Robot robotL = new Light();
        
        
        robotL = new Grapple(robotL);      
        robotH = new Grapple(robotH);
        
        robotL = new AdditionalSprings(robotL);      
        robotH = new AdditionalSprings(robotH);
        double b = robotH.cost();
        System.out.println(robotH.robotData() + " " + robotH.cost());
        System.out.println("\n" + robotL.robotData() + " " + robotL.cost());
    }
    
}

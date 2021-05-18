/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.paterns.strategy.robot;

/**
 *
 * @author Familia
 */
public class RepairBehavior implements RobotBehavior{
    
      @Override
    public int moveCommand() {
        return 0;
    }
       
     @Override
    public String toString() {
        return "Repair Behavior: if it is hurt by enemy attack would repair itself";
    }
}

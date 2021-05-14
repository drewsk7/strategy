package com.example.paterns.strategy.robot;

import strategy.examples.robot.Robot;


public class RobotTestDrive {

    public static void main(String[] args) {

        Robot roboto = new Robot();
        roboto.setName("Mr. Roboto");
        roboto.setBehavior(new AgressiveBehavior());

        roboto.move();
    }

}

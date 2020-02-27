//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _01_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		//1. Create a new Robot
		Robot dani = new Robot();
		//3. Ask the user what color they would like the robot to draw
		String color= JOptionPane.showInputDialog("What color would you like the robot to be?");
		//5. Use an if/else statement to set the pen color that the user requested
		if(color.equalsIgnoreCase("red")) {
		dani.setPenColor(Color.red);
		}
		
		if(color.equalsIgnoreCase("blue")) {
		dani.setPenColor(Color.blue);	
		}
		
		if(color.equalsIgnoreCase("green")) {
		dani.setPenColor(Color.green);
		}
        //6. If the user doesn’t enter anything, choose a random color
		else {
		dani.setRandomPenColor();
		}
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//4. Set the pen width to 10
		dani.setPenWidth(10);
	    //2. Make the robot draw a shape (this will take more than one line of code)
		dani.setSpeed(50);
		dani.penDown();
		dani.move(250);
		dani.turn(90);
		dani.move(250);
		dani.turn(90);
		dani.move(250);
		dani.turn(90);
		dani.move(250);
	
	}
}

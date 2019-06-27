package square;

import java.util.Scanner;  // This program makes use of class Scanner 
/**  This program records user input then computes the values for in area, perimeter, volume and converts to inches 
*    Author:  Jephte Francois
*    CST8110310 Introduction to Computer Programming Assignment 1
*/ 
public class SquareAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  Scanner input = new Scanner(System.in);
		    double in, cm, area, areaTwo, pOne, pTwo, vOne, vTwo;
		    //identified all required variables to execute calculations and conversions from centimeters to inches
		    
		    System.out.print("Please enter the measurement value in centimeters:  ");
		    cm = input.nextDouble();
		    in = cm / 2.54;
		    //introduced variable: in to convert user input from centimeters to inches
		    System.out.format("The side value of %.3f cm is equivalent to %.3f inches\n", cm, in);
		    
		    
		    area = cm * cm;
		    areaTwo = area / 6.45;
		    System.out.format("The area of the Square is %.3f square cm or %.3f square inces\n", area, areaTwo);
		    //calculates area based off user input and converts it to centimeters and inches then prints results to terminal
		    
		    pOne = cm + cm + cm + cm;
		    pTwo = pOne / 2.54;
		    System.out.format("The perimeter of the square is %.3f cm or %.3f inches\n", pOne, pTwo);
		    //prints results of pOne and pTwo to terminal for display to user 
		    
		    vOne = cm * cm * cm;
		    vTwo = vOne * 0.06102;
		    System.out.format( "The volume of the cube is %.3f cubic cm or %.3f cubic inches\n", vOne, vTwo);
		    //calculates volume in centimeters and inches then prints result to user


	}

}

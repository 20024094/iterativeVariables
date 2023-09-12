package iterativevariables;

/**
 * Application: JavaVariables 
 * Version: 1.0
 * Author: Daniel Barbu
 * Student Id: 20024094
 * Module: Object Oriented Programming
 * @author 20024094
 */


public class IterativeVariables {

    public static void main(String[] args) {
        int lowerLimit = 10;
        int upperLimit = 100;
        
        for (int i = lowerLimit; i < upperLimit; i++) {
            System.out.println("The number is: " + i + " the square is: " + (i * i) 
                    + " and the square is: " + Math.sqrt(i));
        }
    }
    
}

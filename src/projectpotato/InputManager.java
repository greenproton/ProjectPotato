/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectpotato;

import java.util.Scanner;

/**
 *
 * @author tim
 */
public class InputManager {
    
    private final Scanner scanner = new Scanner(System.in);
    
    private Fraction answer;
    
    /**
     * The input manager needs to scan in the input and parse the data into
     * fractions.
     */
    
    
    /**
     * Grab data from the user
     */
    public void displayInstructions() {
        
        System.out.println("Enter yer fractions - this will add fraction1 plus fraction 2");
        System.out.println("In other words, it will add the two fractions - it is a fraction calculatur");
        System.out.println("It is only addition - maybe when I git smarter - it will multiplie");
        System.out.println("This is called project Potato - I am not a potato");
        System.out.println("Enter yer fractions");
        
      
    }
    
    public void scanner() {
        
        System.out.println("That is, enter fraction 1");
        String userInput = scanner.nextLine();
        
        Fraction f1 = this.parse(userInput);
        
        System.out.println("Enter fraction 2 please");
        userInput = scanner.nextLine();
        Fraction f2 = this.parse(userInput);
        
        answer = FractionMath.add(f1, f2);
        

        
        
        
    }
    
    public Fraction getAnswer() {
        return answer;
    }
     
    private Fraction parse(String userInput) {
        
        String[] numbersAsStrings = userInput.split("/");
        
        int numerator = Integer.parseInt(numbersAsStrings[0]);
        int denominator = Integer.parseInt(numbersAsStrings[1]);
        
        return new Fraction(numerator,denominator);
        
    }
    
    
    
}

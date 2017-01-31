/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectpotato;

/**
 *
 * @author tim
 */
public class ProjectPotato {


    public static void main(String[] args) {
        
        InputManager inputManager = new InputManager();
        inputManager.displayInstructions();
        inputManager.scanner();
        Fraction answer = inputManager.getAnswer();
        OutputManager outputManager = new OutputManager();
        outputManager.output(answer);

        
    }
    
}

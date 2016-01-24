/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lyndachallenge.challengeone.oopstyle;

import java.util.Scanner;

/**
 *
 * @author carlos
 */
public class SourceAreaCalcuate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {  
        int surfaceArea;
        House house;
        Window window;
        Door door;
        boolean hasWindow = true;        
        boolean hasDoor = true;        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Please enter the length, width and height of " 
            + "the house to be painted");        
        house = new House(in.nextInt(), in.nextInt(), in.nextInt());        
        while(hasWindow) {
            System.out.println("Please enter the windows, width and "
                    + "height");
            window = new Window(in.nextInt(), in.nextInt());
            
            house.addWindow(window);
            System.out.println("You add more window: y/n");
            String confirmation = in.next();
            if (!confirmation.equalsIgnoreCase("y")) {
                hasWindow = false;
            }            
        }
        
        while(hasDoor) {
            System.out.println("Please enter the door width and "
                    + "height");
            door = new Door(in.nextInt(), in.nextInt());
            
            house.addDoor(door);
            System.out.println("You add more door: y/n");
            String confirmation = in.next();
            if (!confirmation.equalsIgnoreCase("y")) {
                hasDoor = false;
            }            
        }        
        
        surfaceArea = 0;
    }
    
}

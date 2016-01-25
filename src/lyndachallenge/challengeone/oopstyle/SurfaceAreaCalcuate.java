/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lyndachallenge.challengeone.oopstyle;

import java.util.Scanner;

/**
 *
 * @author carlos belisario <carlos.belisario.gonzalez@gmail.com>
 */
public class SurfaceAreaCalcuate {    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {  
        House house;
        int surfaceArea;        
        Window window = new Window();
        Door door = new Door();  
        Scanner in = new Scanner(System.in);        
        
        System.out.println("Please enter the length, width and height of " 
            + "the house to be painted");        
        house = new House(in.nextInt(), in.nextInt(), in.nextInt());        
        
        house = menu(window, house);
        
        house = menu(door, house);
        
        surfaceArea = house.surfaceArea();
        
        System.out.println("The source Area is: " + surfaceArea);
    }
    
    public static House menu(AttributeAreaCalculable attribute, House house) {
        Scanner in = new Scanner(System.in);
        boolean hasAttribute = true;
        while(hasAttribute) {
            System.out.println("Please enter the " + attribute + " width and "
                    + "height");
            attribute.setWidth(in.nextInt());
            attribute.setHeight(in.nextInt());            
            if (attribute instanceof Door) {
                house.addDoor((Door)attribute);
            } else if(attribute instanceof Window) {
                house.addWindow((Window) attribute);
            }
            System.out.println("You add more " + attribute + ": y/n");
            String confirmation = in.next();
            if (!confirmation.equalsIgnoreCase("y")) {
                hasAttribute = false;
            }            
        }
        return house;
    }    
}

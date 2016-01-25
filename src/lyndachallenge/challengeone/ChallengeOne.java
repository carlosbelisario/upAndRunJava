package lyndachallenge.challengeone;

import java.util.Scanner;
/**
 *
 * course up and running java (lynda.com)
 * @author carlos belisario <carlos.belisario.gonzalez@gmail.com>
 */
public class ChallengeOne {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /**
         * @var int dimentions house
         */
        int houseLength, houseWidth, houseHeight;
        
        /**
         * @var int windows informations
         */
        int numberOfWindows, windowsWidth, windowsHeight; 
        
        /**
         * @var int door informations       
         */
        int numberOfDoors, doorsWidth, doorsHeight; 
        
        /**
         * @var int
         */
        int surfaceArea;
        
        /**
         * @var Scanner in
         */
        Scanner in = new Scanner(System.in);
        
        System.out.println("Please insert the width of the house");
        houseWidth = in.nextInt();
        System.out.println("Please insert the height of the house");
        houseHeight = in.nextInt();
        System.out.println("Please insert the length of the house");
        houseLength = in.nextInt();
        
        System.out.println("Please insert the number of windows");
        numberOfWindows = in.nextInt();
        System.out.println("PlehouseHeightase insert the width of the windows");
        windowsWidth = in.nextInt();
        System.out.println("Please insert the height of the windows");
        windowsHeight = in.nextInt();
        
        System.out.println("Please insert the number of doors");
        numberOfDoors = in.nextInt();
        System.out.println("PlehouseHeightase insert the width of the doors");
        doorsWidth = in.nextInt();
        System.out.println("Please insert the height of the doors");
        doorsHeight = in.nextInt();
        
        int houseArea = houseWidth * houseHeight * 2 + houseLength * houseHeight * 2;
        System.out.println("ha" + houseArea);
        int windowArea = numberOfWindows * windowsWidth * windowsHeight;
        System.out.println("wa" + windowArea);
        int doorArea = numberOfDoors * doorsWidth * doorsHeight;
        System.out.println("da" + doorArea);
        surfaceArea = (houseWidth * houseHeight * 2 + houseLength * houseHeight * 2) 
                - (numberOfWindows * windowsWidth * windowsHeight + 
                numberOfDoors * doorsWidth * doorsHeight);
        System.out.println("The total paintable surface area is: "+ surfaceArea);        
    }
    
}


package chalengetwo.oopstyle;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
/**
 *
 * @author Carlos Belisario <carlos.belisario.gonzalez@gmail.com>
 */
public class Hospital {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<HospitalStay> stays = new ArrayList<>();
        boolean checkPatien;
        Scanner in = new Scanner(System.in);
        do {            
            System.out.println("please enter the patien name");
            Patient patien = new Patient(in.next());
            System.out.println("please enter the cost of the night");            
            HospitalStay stay = new HospitalStay(patien, in.nextInt());
            System.out.println("please enter the medication cost");
            stay.setMedicationCharge(in.nextInt());
            System.out.println("please enter the labs cost");
            stay.setLabsCharge(in.nextInt());
            if (stay.hasOverStay()) {
                System.out.println("please enter the number of nights extra");
                stay.setOverNightLength(in.nextInt());
            }
            stays.add(stay);
            System.out.println("Do you have another patient? y/n");
            checkPatien = in.next().equalsIgnoreCase("y");
        } while(checkPatien);
        
        showStays(stays);
    }
    
    public static void showStays(ArrayList<HospitalStay> stays) {
        Iterator stayIterator = stays.iterator();
        System.out.println("------ stays in the hospital ------");
        while (stayIterator.hasNext()) {
            System.out.println(stayIterator.next());
            System.out.println("-----------------------------------");
        }        
    }
    
}

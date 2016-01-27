package chalengetwo.oopstyle;

import java.util.Scanner;
/**
 *
 * @author Carlos Belisario <carlos.belisario.gonzalez@gmail.com>
 */
public class HospitalStay {    
    private int medicationCharge;    
    
    private int labsCharge;
    
    private int overNightLength;    
    
    private int overNightValue;
    
    private Patient patien;
    
    /**
     * 
     * @param patien
     * @param overNightValue
     * @param medicationCharge
     * @param labsCharge 
     */
    public HospitalStay(Patient patien, int overNightValue) {
        this.patien = patien;                
        this.overNightValue = overNightValue;
    }
    
    public void setMedicationCharge(int medicationCharge) {
        this.medicationCharge = medicationCharge;
    }

    public void setLabsCharge(int labsCharge) {
        this.labsCharge = labsCharge;
    }
    
    /**
     * 
     * @return 
     */
    public int getTotalCharges() {
        return medicationCharge +  labsCharge + getTotalOverNight();
    }
    
    /**
     * 
     * @return 
     */
    public boolean hasOverStay() {
        Scanner in = new Scanner(System.in);
        System.out.println("the patien has over night? y/n");
        return in.next().equalsIgnoreCase("y");
    }
    
    /**
     * 
     * @param overNightLength 
     */
    public void setOverNightLength(int overNightLength) {
        this.overNightLength = overNightLength;
    }
    
    /**
     * 
     * @return 
     */
    public int getTotalOverNight() {
        return overNightLength + overNightValue;
    }
    
    /**
     * 
     * @return 
     */
    @Override
    public String toString() {
        if (overNightLength > 0) {
            return "The patien " +  patien.getName() +  " has a cost of " 
                + getTotalCharges() + " for:"
                + "\n medication: " + medicationCharge
                + "\n labs: " + labsCharge
                + "\n over night: " + getTotalOverNight()
            ;
        } 
        return "The patien " +  patien.getName() +  " has a cost of " 
            + getTotalCharges() + " for:"
            + "\n medication: " + medicationCharge
            + "\n labs: " + labsCharge            
        ;
    }
}

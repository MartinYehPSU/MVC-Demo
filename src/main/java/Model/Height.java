/***************************************
* Filename: Height.java
* Short description: This class stores the height information.
*   ==== L02: Inheritance Assignment ====
* @author Nannette D'Imperio
* @version  ??/??/2019
***************************************/

package Model;

import Controller.HeightController;

/**
 *
 * @author nxd13
 */
public class Height extends AbstractModel{
    // attribututes
    private int feet;
    private int inches;
    
    // Constructors
    public Height(){
        feet = 0;
        inches = 0;
    }
    public Height(int inFeet, int inInches) {
        feet = inFeet;
        inches = inInches;
    }

    /**
     * @return the feet
     */
    public int getFeet() {
        return feet;
    }

    /**
     * @param feet the feet to set
     */
    public void setFeet(int feet) {
        int oldValue = this.feet;
        this.feet = feet;
        this.firePropertyChange(HeightController.FEET_PROPERTY, oldValue, feet);
    }

    /**
     * @return the inches
     */
    public int getInches() {
        return inches;
    }

    /**
     * @param inches the inches to set
     */
    public void setInches(int inches) {
        int oldValue = this.inches;
        this.inches = inches;
        this.firePropertyChange(HeightController.INCHES_PROPERTY, oldValue, inches);
    }
    
    /**
     * @return a formatted string with feet and inches
     */
    public String toString() {
        return feet + "'" + inches + "\"";
    }       
    
    public int getTotalInches() {
        return (feet * 12) + inches;
    }
}

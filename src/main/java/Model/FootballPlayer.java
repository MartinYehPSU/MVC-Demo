/***************************************
* Filename: FootballPlayer.java
* Short description: This class defines a football player.
*   ==== L02: Inheritance Assignment ====
* @author Nannette D'Imperio
* @version  1/17/2019
***************************************/

package Model;

import java.util.ArrayList;

/**
 *
 * @author nxd13
 */
public class FootballPlayer extends Person implements TableMember {
    // attributes
    private int number;
    private String position;
    
    // Constructors
    public FootballPlayer() {
        super();
        number = 0;
        position = "unknown";
    }
    
    public FootballPlayer(int number, String name, String position, int feet, int inches, int weight, String hometown, String highSchool) {
        super(name, new Height(feet, inches), weight, hometown, highSchool);
        this.number = number;
        this.position = position;
    }

    public FootballPlayer(int number, String name, String position, Height height, int weight, String hometown, String highSchool) {
        super(name, height, weight, hometown, highSchool);
        this.number = number;
        this.position = position;
    }
    
    /**
     * @return the number
     */
    public int getNumber() {
        return number;
    }

    /**
     * @param number the number to set
     */
    public void setNumber(int number) {
        this.number = number;
    }

    /**
     * @return the position
     */
    public String getPosition() {
        return position;
    }

    /**
     * @param position the position to set
     */
    public void setPosition(String position) {
        this.position = position;
    }

    public String toString() {
        return super.toString() + "\nNumber: " + number + " " + " Position: " + position ;
    }

    @Override
    public String getAttribute(int n) {
        String result = "";
        switch(n) {
            case 0: 
                result = getName();
                break;
            case 1:
                result = getHeight().toString();
                break;
            case 2:
                result = Integer.toString(getWeight());
                break;
            case 3:
                result = getHometown();
                break;
            case 4:
                result = getHighSchool();
                break;
            case 5:
                result = Integer.toString(getNumber());
                break;
            case 6:
                result = getPosition();
                break;
            //0 = name - Marcus Allen
            //1 = height - 6'2"
            //2 = weight - 209
            //3 = hometown - Upper Marlboro, MD
            //4 = highSchool - Dr. Henry A. Wise
            //5 = number - 2
            //6 = position - S
        }
        return result;
    }

    @Override
    public ArrayList<String> getAttributes() {
        ArrayList<String> attributes = new ArrayList<String>();
        for (int i = 0; i < 7; i++) {
            attributes.add(getAttribute(i));
        }
        return attributes;
    }

    @Override
    public String getAttributeName(int n) {
        String result = "";
        switch(n) {
            case 0: 
                result = "name";
                break;
            case 1:
                result = "height";
                break;
            case 2:
                result = "weight";
                break;
            case 3:
                result = "hometown";
                break;
            case 4:
                result = "highSchool";
                break;
            case 5:
                result = "number";
                break;
            case 6:
                result = "position";
                break;
            //0 = name - Marcus Allen
            //1 = height - 6'2"
            //2 = weight - 209
            //3 = hometown - Upper Marlboro, MD
            //4 = highSchool - Dr. Henry A. Wise
            //5 = number - 2
            //6 = position - S
        }
        return result;         
    }

    @Override
    public ArrayList<String> getAttributeNames() {
        ArrayList<String> attributeNames = new ArrayList<String>();
        for (int i = 0; i < 7; i++) {
            attributeNames.add(getAttributeName(i));
        }
        return attributeNames;
    }
}

/***************************************
* Filename: Person.java
* Short description: This class defines the Person super class...
*   ==== L02: Inheritance Assignment ====
* @author Nannette D'Imperio
* @version  ??/??/2019
***************************************/

package Model;

/**
 *
 * @author nxd13
 */
public class Person {
    // attributes
    private String name;
    private Height height;
    private int weight;
    private String hometown;
    private String highSchool;
    
    // Constructors
    public Person() {
        this("unknown", new Height(), 0, "unknown", "unknown");
    }
    public Person(String name, Height height, int weight, String hometown, String highSchool) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.hometown = hometown;
        this.highSchool = highSchool;
    }
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the height
     */
    public Height getHeight() {
        return height;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(Height height) {
        this.height = height;
    }

    /**
     * @return the weight
     */
    public int getWeight() {
        return weight;
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(int weight) {
        this.weight = weight;
    }

    /**
     * @return the hometown
     */
    public String getHometown() {
        return hometown;
    }

    /**
     * @param hometown the hometown to set
     */
    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    /**
     * @return the highSchool
     */
    public String getHighSchool() {
        return highSchool;
    }

    /**
     * @param highSchool the highSchool to set
     */
    public void setHighSchool(String highSchool) {
        this.highSchool = highSchool;
    }
    
    /**
     * @return an information string
     */
    @Override
    public String toString() {
        return name + "\n" + height.toString() + ", " +
                weight + " lbs. \n" +
                "Hometown: " + hometown 
                + ", High School: " + highSchool;
    }
    
        
}

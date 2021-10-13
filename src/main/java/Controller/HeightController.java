/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

/**
 *
 * @author kqy1
 */
public class HeightController extends AbstractController{
    
    public static final String FEET_PROPERTY = "feet";
    public static final String INCHES_PROPERTY = "inches";
    
    public HeightController() {    
    }
    
    public void changeFeet(int newValue) {
        setModelProperty(FEET_PROPERTY, newValue);
    }
    
    public void changeInches(int newValue) {
        setModelProperty(INCHES_PROPERTY, newValue);
    }
    
}

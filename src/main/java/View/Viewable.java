/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;
import java.beans.PropertyChangeEvent;
/**
 *
 * @author kqy1
 */
public interface Viewable {
    public void modelPropertyChange(PropertyChangeEvent evt);
}
/***************************************
* Filename: InitialPanel.java
* Short description: This class ...
* @author Nannette D'Imperio
* @version  ??/??/2019
***************************************/

package View;

import Controller.AbstractController;
import java.awt.BorderLayout;
import javax.swing.JPanel;

/**
 *
 * @author nxd13
 */
public class InitialPanel extends JPanel{
    // attributes
    CenterPanel cPanel;
    
    public InitialPanel(AbstractController controller) {
        super();
        setLayout(new BorderLayout());
        cPanel = new CenterPanel(controller);
        add(cPanel);
    }
    
    public CenterPanel getCPanel() {
        return cPanel;
    }
    
    
}

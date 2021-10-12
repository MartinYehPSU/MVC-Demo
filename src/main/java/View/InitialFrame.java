/***************************************
* Filename: InitialFrame.java
* Short description: This class ...
* @author Nannette D'Imperio
* @version  ??/??/2019
***************************************/

package View;

import javax.swing.JFrame;

/**
 *
 * @author nxd13
 */
public class InitialFrame extends JFrame {
    // attributes
    InitialPanel iPanel;
    CenterPanel cPanel;
    
    public InitialFrame() {
        super("A04C - Graphics with MVC");
        //setupLayoutForMacs();
        iPanel = new InitialPanel();
        cPanel = iPanel.getCPanel();
        add(iPanel, "Center");
        //------------------------------------------------------
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1000, 500);
        setVisible(true);
    }

    public InitialPanel getiPanel() {
        return iPanel;
    }

    public CenterPanel getcPanel() {
        return cPanel;
    }
    
    
}


package View;

import Controller.AbstractController;
import java.util.ArrayList;

public class View
{
    // attributes
    InitialFrame iFrame;
    InitialPanel iPanel;
    CenterPanel cPanel;

    public View(AbstractController controller) {
        iFrame = new InitialFrame(controller);
        iPanel = iFrame.getiPanel();
        cPanel = iFrame.getcPanel();
    }

    public void CenterInitialSetup(int lines, int headers) {
        cPanel.setupCenterPanel(lines, headers);
    }

    public void CenterUpdate(ArrayList<ArrayList<String>> lines,
            ArrayList<String> headers) {
        cPanel.panelUpdate(lines, headers);

    }

}

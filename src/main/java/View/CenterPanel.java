/***************************************
* Filename: CenterPanel.java
* Short description: This class ...
* @author Nannette D'Imperio
* @version  ??/??/2019
***************************************/

package View;

import Controller.AbstractController;
import Controller.HeightController;
import java.awt.Color;
import java.awt.GridLayout;
import java.beans.PropertyChangeEvent;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author nxd13
 */
public class CenterPanel extends JPanel implements Viewable{
    // attributes
    ArrayList<JLabel> headers = new ArrayList<JLabel>();
    ArrayList<JButton> rowData = new ArrayList<JButton>();
    
    // Controller
    private HeightController hController;
    
    public CenterPanel(AbstractController controller) {
        super();
        this.hController = (HeightController) controller;
    }
    
    public void setupCenterPanel(int rows, int cols) {
        setLayout(new GridLayout(rows + 1, cols));
        // create header labels and add to panel
        for(int c = 0; c < cols; c++) {
            JLabel label = new JLabel("L");
            label.setHorizontalAlignment(JLabel.CENTER);
            label.setBackground(Color.GRAY);
            label.setBorder(BorderFactory.createLineBorder(Color.black));
            headers.add(label);
            add(headers.get(c));
        }
        // create row data buttons and add to panel
        for(int i = 0; i < rows; i++) {
            for(int c = 0; c < cols; c++) {
                JButton btn = new JButton("B");
                btn.setBackground(Color.pink);
                rowData.add(btn);
                add(btn);
            }
        }        
        validate();
        repaint();
    }
    
    public void panelUpdate(ArrayList<ArrayList<String>> lines, 
            ArrayList<String> heads) {
        for (int h = 0; h < heads.size(); h++) {
            headers.get(h).setText(heads.get(h));
        }
        int b = 0;
        for (int d = 0; d < lines.size() - 1; d++) {
            ArrayList<String> data = lines.get(d);
            for (int i = 0; i < data.size(); i++) {
                rowData.get(b).setText(data.get(i));
                b++;
            } 
        }
        validate();
        repaint();
    }

    @Override
    public void modelPropertyChange(PropertyChangeEvent evt) {
        System.out.println(evt);
    }
}

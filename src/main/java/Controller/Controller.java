
package Controller;

import Model.Model;
import View.View;

public class Controller
{
    Model model;
    View view;

    public Controller(Model model, View view)
    {
        this.model = model;
        this.view = view;
        // create button layouts
        view.CenterInitialSetup(model.getFpData().getLinesBeingDisplayed(),
                model.getFpData().getHeaders().size());
        view.CenterUpdate(model.getLines(), model.getFpData().getHeaders());
    }
     
    
}

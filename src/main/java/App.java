
import Controller.Controller;
import Controller.HeightController;
import Model.Height;
import Model.Model;
import View.CenterPanel;
import View.View;

public class App
{

    public static void main(String[] args)
    {
        Model model = new Model();
        Height height = new Height();
        
        
        // MVC Demo
        // Instantiate a controller
        HeightController hController = new HeightController();
        // Add model to the controller
        hController.addModel(height);
        
        // Create a view and add it to the controller
        CenterPanel cPanel = new CenterPanel(hController);
        hController.addView(cPanel);
        
        
        View view = new View(hController);
        Controller controller = new Controller(model, view);
    }
}

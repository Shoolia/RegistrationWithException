package ua.training;

import ua.training.controller.Controller;
import ua.training.controller.UtilityController;
import ua.training.model.Entity.Notebook;
import ua.training.model.Model;
import ua.training.view.View;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Controller controller =
                new Controller(new Model(), new View());
        // Run
        controller.processUser();
    }
}

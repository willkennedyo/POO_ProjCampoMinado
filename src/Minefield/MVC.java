package Minefield;

import controller.ControllerMain;
import view.ViewMain;
/**
 *
 * @author willian
 */
public class MVC {
    
    public static void main(String[] args) {

        ViewMain framePrincipal = new ViewMain();
        new ControllerMain(framePrincipal);
        framePrincipal.setVisible(true);

    }
    
}

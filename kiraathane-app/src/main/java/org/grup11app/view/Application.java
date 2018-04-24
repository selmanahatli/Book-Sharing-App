package org.grup11app.view;
import org.grup11app.controller.PageManager;
import java.util.logging.Logger;
/**
 * Created by mny on 17/04/2018.
 */
public class Application {
    private static Logger LOGGER = null;

    /**
     * Launch the application.
     *
     * @param args the arguments
     */
    public static void main(String[] args) {
        Application application = new Application();
        application.getAppConfigurations();
        application.initializeApplication();
    }

    /**
     * Get application config.
     */
    private boolean getAppConfigurations() {

        try {
            System.setProperty("LOG_PATH", System.getProperty("user.home"));
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    private void initializeApplication() {
        PageManager.getInstance().setApplicationWindow(new ApplicationWindow());
        ApplicationWindow.main(null);
    }

}

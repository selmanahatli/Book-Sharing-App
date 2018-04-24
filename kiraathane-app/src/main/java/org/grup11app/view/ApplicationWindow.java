package org.grup11app.view;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import java.io.IOException;
import java.net.ServerSocket;
/**
 * Created by mny on 17/04/2018.
 */

public class ApplicationWindow extends Application {
    private static Stage mPrimaryStage;
    public final String PAGE_LOGIN_URL = "ui/login.fxml";
    public final String PAGE_REGISTER_URL = "ui/register.fxml";
    public final String PAGE_DASHBOARD_URL = "ui/dashboard.fxml";
    private volatile ServerSocket socket = null;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        setPrimaryStage(primaryStage);
        getPrimaryStage().getIcons().add(new Image("image/app_logo.png"));
        pageLoader(PAGE_LOGIN_URL);
    }

    public void pageLoader(String pageUrl) {

        try {
            FXMLLoader loader = new FXMLLoader(ApplicationWindow.class.getClassLoader().getResource(pageUrl));
            Parent root = loader.load();
            Scene scene = new Scene(root, 800, 600);
            scene.getStylesheets().add("css/default.css");
            getPrimaryStage().setScene(scene);
            getPrimaryStage().setResizable(false);
            getPrimaryStage().setTitle("KIRAATHANE");
            getPrimaryStage().setResizable(true);
            getPrimaryStage().show();
        } catch (IOException e) {
        }
    }

    public Stage getPrimaryStage() {
        return mPrimaryStage;
    }

    private void setPrimaryStage(Stage stage) {
        mPrimaryStage = stage;
    }

}

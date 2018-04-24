package org.grup11app.controller;

import javafx.application.Platform;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import java.net.URL;
import java.util.ResourceBundle;
/**
 * Created by mny on 17/04/2018.
 */
public class loginPageController {
    @FXML
    private ImageView ivLogin;
    @FXML
    private PasswordField psword;
    @FXML
    private TextField loginname;
    @FXML
    private ProgressBar progressBarLoading;


    public void initialize(URL location, ResourceBundle resources) {

        progressBarLoading.setProgress(ProgressBar.INDETERMINATE_PROGRESS);
        progressBarLoading.setVisible(true);

    }

    public void onClick(Event event) {
        String viewId = "123";
        Alert alert = new Alert(Alert.AlertType.INFORMATION);

            if (loginname.getText().isEmpty()) {
                alert.setContentText("Lütfen kullanıcı adını giriniz.");
                alert.showAndWait();
            } else if (psword.getText().isEmpty()) {
                alert.setContentText("Lütfen şifrenizi giriniz.");
            } else {
                if (loginname.getText().equals("admin") && psword.getText().equals("admin")){
                    //Platform.runLater(this::showLoading);
                    Platform.runLater(() -> PageManager.getInstance().getApplicationWindow()
                            .pageLoader(PageManager.getInstance().getApplicationWindow().PAGE_DASHBOARD_URL));
                }
            }
    }

    public void onClickRegister(Event event) {

        Platform.runLater(() -> PageManager.getInstance().getApplicationWindow()
                .pageLoader(PageManager.getInstance().getApplicationWindow().PAGE_REGISTER_URL));
    }
    public void btnBack(Event event) {

        Platform.runLater(() -> PageManager.getInstance().getApplicationWindow()
                .pageLoader(PageManager.getInstance().getApplicationWindow().PAGE_LOGIN_URL));
    }
    public void saveClick(Event event) {

        Platform.runLater(() -> PageManager.getInstance().getApplicationWindow()
                .pageLoader(PageManager.getInstance().getApplicationWindow().PAGE_LOGIN_URL));
    }

    private void showLoading() {
        progressBarLoading.setVisible(true);
        loginname.setVisible(true);
        psword.setVisible(true);
        ivLogin.setVisible(true);
    }

    public void hideLoading() {
        progressBarLoading.setVisible(false);
    }
}

package org.grup11app.controller;

import javafx.fxml.Initializable;
import org.grup11app.view.ApplicationWindow;

/**
 * Created by mny on 17/04/2018.
 */
public class PageManager {
    private static PageManager instance = new PageManager();
    private loginPageController loginPageController = null;
    private ApplicationWindow applicationWindow;
    private Initializable currentPage;

    private PageManager() {
    }

    public static PageManager getInstance() {
        return instance;
    }

   /* public MainPageController getMainPageController() {
        return mainPageController;
    }

    public void setMainPageController(MainPageController mainPageController) {
        this.mainPageController = mainPageController;
    }*/

    public loginPageController getLoginPageController() {
        return loginPageController;
    }

    public void setLoginPageController(loginPageController loginPageController) {
        this.loginPageController = loginPageController;
    }

    public ApplicationWindow getApplicationWindow() {
        return applicationWindow;
    }

    public void setApplicationWindow(ApplicationWindow applicationWindow) {
        this.applicationWindow = applicationWindow;
    }


   /* public TabStatisticsController getTabStatisticsController() {
        return tabStatisticsController;
    }

    public void setTabStatisticsController(TabStatisticsController tabStatisticsController) {
        this.tabStatisticsController = tabStatisticsController;
    }*/

    public Initializable getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Initializable currentPage) {
        this.currentPage = currentPage;
    }


}

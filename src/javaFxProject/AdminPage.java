/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaFxProject;


import View.ViewManager;
import javafx.application.Application;
import javafx.stage.Stage;

/**
 *
 * @author acer
 */
public class AdminPage extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        ViewManager.openLoginPage();

    }

    public static void main(String[] args) {

        launch(args);
    }

}

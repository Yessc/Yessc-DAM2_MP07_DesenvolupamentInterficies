package com.project;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import com.project.UtilsViews;


public class Main extends Application{
    private static final int WINDOW_WIDTH = 350;
    private static final int WINDOW_HEIGHT = 400;
    static String nom = "";
    static String edat = "";
    static String texto = "";
    private static Stage primaryStage; 


    

    public void start(Stage stage) throws Exception {
        //ystem.out.println(getClass().getResource("/assets/calculadora.fxml"));
        UtilsViews.parentContainer.setStyle("-fx-font: 14 arial;");
        UtilsViews.addView(getClass(), "Vista1", "/assets/vista1.fxml");
        UtilsViews.addView(getClass(), "Vista2", "/assets/vista2.fxml");

        UtilsViews.showView("Vista1");

        Scene scene = new Scene(UtilsViews.parentContainer, WINDOW_WIDTH, WINDOW_HEIGHT);
        stage.setScene(scene);
        stage.setTitle("Exercici 01");
        stage.setResizable(false);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args); 
    }
}

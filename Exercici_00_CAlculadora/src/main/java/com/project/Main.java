package com.project;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application{
    private static final int WINDOW_WIDTH = 350;
    private static final int WINDOW_HEIGHT = 400;
    

    public void start(Stage stage) throws Exception {
        //ystem.out.println(getClass().getResource("/assets/calculadora.fxml"));

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/assets/calculadora.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
    

        stage.setTitle("Calculadora FX");
        stage.setScene(scene);
        stage.setWidth(WINDOW_WIDTH);
        stage.setHeight(WINDOW_HEIGHT);
        stage.setResizable(false); 
        stage.show(); 
    }

    public static void main(String[] args) {
        launch(args); 
    }
}

package com.project;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    private Scene scene;

    @Override
    public void start(Stage stage) throws Exception {

        final int mvlWidth = 300;
        final int mvlHeight = 600;
        final int windowWidth = 800;
        final int windowHeight = 600;

        
        // Carga inicial: vista escritorio
        Parent rootDesktop = FXMLLoader.load(getClass().getResource("/assets/vistaDesktop.fxml"));
        scene = new Scene(rootDesktop, 800, 600);
        stage.setTitle("Vista adaptativa Nintendo");
        stage.setScene(scene);
        stage.show();

         // Listener para cambios de ancho
        scene.widthProperty().addListener((obs, oldWidth, newWidth) -> {
        try {
            String rootId = scene.getRoot().getId();
            if (newWidth.doubleValue() < 600 && !"mobileRoot".equals(rootId)) {
                Parent rootMobile = FXMLLoader.load(getClass().getResource("/assets/vistaMovil.fxml"));
                scene.setRoot(rootMobile);
                System.out.println("🔹 Vista móvil activada");
            } else if (newWidth.doubleValue() >= 600 && !"desktopRoot".equals(rootId)) {
                Parent rootDesktopReload = FXMLLoader.load(getClass().getResource("/assets/vistaDesktop.fxml"));
                scene.setRoot(rootDesktopReload);
                System.out.println("🔹 Vista escritorio activada");
            }
        } catch (Exception e) {
                e.printStackTrace();
        }
        });
    }

    public static void main(String[] args) {
        launch();
    }
}

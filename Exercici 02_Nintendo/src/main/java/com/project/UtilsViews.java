package com.project;

import java.util.HashMap;
import java.util.Map;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;


public class UtilsViews {
    public static StackPane parentContainer = new StackPane();
    public static ArrayList<Object> controllers = new ArrayList<>();
    private static Map<String, Node> views = new HashMap<>(); //aqui almacenamos cada vista cargada del fxml 

    public static void addView(Class<?> cls, String name, String path) throws Exception {
        FXMLLoader loader = new FXMLLoader(cls.getResource(path));
        Pane view = loader.load();
        views.put(name, view);
        controllers.add(loader.getController()); // controlador para vista 
        
    }
  
}

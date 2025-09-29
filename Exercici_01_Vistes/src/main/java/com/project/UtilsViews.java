package com.project;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;

public class UtilsViews {
    
    public static StackPane parentContainer = new StackPane();
    public static ArrayList<Object> controllers = new ArrayList<>();
    private static Map<String, Node> views = new HashMap<>();

    public static void addView(Class<?> cls, String name, String path) throws Exception {
        
        boolean defaultView = false;
        FXMLLoader loader = new FXMLLoader(cls.getResource(path));
        Pane view = loader.load();
        views.put(name, view);
    }
     public static void showView(String name) {
        Node view = views.get(name);
        if (view != null) {
            parentContainer.getChildren().setAll(view);
        } else {
            System.out.println("Vista no encontrada: " + name);
        }
    }
}

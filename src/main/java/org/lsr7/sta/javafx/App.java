package org.lsr7.sta.javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Parent;

public class App extends Application {
    public static void main(String[] args) {
        System.out.println("main");
        launch(args);
    }

    @Override
    public void init() throws Exception {
        System.out.println("init");
    }

    @Override
    public void start(Stage stage) {
        System.out.println("start");
        Parent root = new Group();
        Scene scene = new Scene(root, 640, 480);
        stage.setScene(scene);
        stage.show();
    }

}
package org.lsr7.sta.javafx;
import javafx.scene.text.Text;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.image.Image;
import javafx.scene.text.Font;
import javafx.scene.control.Button;

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
        Text text = new Text(10,40,"Hello papa");
        text.setFont(new Font(45));
        
        Button close = new Button("press me papa ;)");
        
        Parent root = new Group(text,close);
     
        Scene scene = new Scene(root, 800, 600);

      //  Image image = new Image("C:\Users\ksylvester372\Downloads\download.png");
        stage.setScene(scene);
        stage.setTitle("Pappa Kendle");
        stage.show();
        
    }
    @Override
    public void stop()  {
        System.out.println("stop");
    }


}
package tjc;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import javax.swing.*;
import java.net.URL;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("/view/back.fxml"));
        primaryStage.setTitle("Deadline Tracker");
        primaryStage.initStyle(StageStyle.UNDECORATED);
        primaryStage.initStyle(StageStyle.TRANSPARENT);
        Scene scene = new Scene(root, 900, 600);
        scene.setFill(Color.TRANSPARENT);
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        try {
            URL iconURL = Main.class.getResource("/media/logo.png");
            java.awt.Image image = new ImageIcon(iconURL).getImage();
            com.apple.eawt.Application.getApplication().setDockIconImage(image);
        } catch (Exception e) {
            // Sets task bar icon and name on mac, not needed for Windows or Linux
        }
        launch(args);
    }
}




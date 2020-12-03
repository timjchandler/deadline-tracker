package tjc.controller;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Controller {

//    private static Stage primaryStage;
//
    @FXML
    private AnchorPane mainPane;

    @FXML
    private Button closeBtn;

    @FXML
    private Button minBtn;
//
//    public Controller(Stage primaryStage) {
//        Controller.primaryStage = primaryStage;
//    }
//
    public void exit() {
        Platform.exit();
        System.out.println("[EXIT] ---------------------------\n[EXIT] Shutting down");
        System.exit(0);
    }

    public void minimize() {

    }
}

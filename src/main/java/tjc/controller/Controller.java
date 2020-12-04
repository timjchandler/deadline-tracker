package tjc.controller;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    private double xOffset;
    private double yOffset;

    @FXML
    private AnchorPane mainPane;

    @FXML
    private Button minBtn;

    @FXML
    private Button menu1;

    @FXML
    private Button menu2;

    @FXML
    private Button menu3;

    @FXML
    private Button menu4;

    @FXML
    private VBox menuBox;

    public void exit() {
        Platform.exit();
        System.exit(0);
    }

    public void minimize() {
        Stage stage = (Stage) minBtn.getScene().getWindow();
        stage.setIconified(true);
    }

    public void panePressed(MouseEvent event) {
        xOffset = minBtn.getScene().getWindow().getX() - event.getScreenX();
        yOffset = minBtn.getScene().getWindow().getY() - event.getScreenY();
    }

    public void paneDragged(MouseEvent event) {
        minBtn.getScene().getWindow().setX(event.getScreenX() + xOffset);
        minBtn.getScene().getWindow().setY(event.getScreenY() + yOffset);
    }

    public void menuClick(MouseEvent event) {

    }

    public void toggleMenu() {
        if (menuBox.isVisible()) menuBox.setVisible(false);
        else menuBox.setVisible(true);

    }

    protected void setOpacity(Boolean opaque) {
        if (opaque) mainPane.setStyle("-fx-background-color: linear-gradient(to top right, rgba(2, 48, 71, 1), rgba(42, 157, 143, 1)");
        else mainPane.setStyle("-fx-background-color: linear-gradient(to top right, rgba(2,48,71,0.8), rgba(42, 157, 143, 0.8)");
    }

    public void initialize(URL location, ResourceBundle resources) {

    }
}

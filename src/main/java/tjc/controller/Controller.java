package tjc.controller;

import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.awt.event.ActionEvent;
import java.net.URI;
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
    private Slider opacitySlider;

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

    public void settings() {
    }

    public void toggleMenu() {
        menuBox.setVisible(!menuBox.isVisible());
    }

    protected void updateOpacity(ActionEvent e) {
        String start = "-fx-background-color: linear-gradient(to top right, rgba(2, 48, 71, ";
        String mid = "), rgba(42, 157, 143, ";
        String end = "))";
        System.out.println(start + opacitySlider.getValue() + mid + opacitySlider.getValue() + end);
//        mainPane.setStyle(start + opacitySlider.getValue() + mid + opacitySlider.getValue() + end);

    }

    public void openGHPages() {
        try {
            URI u = new URI("https://timjchandler.github.io/deadline-tracker/");
            java.awt.Desktop.getDesktop().browse(u);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void initialize(URL location, ResourceBundle resources) {
        opacitySlider.valueProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                String start = "-fx-background-color: linear-gradient(to top right, rgba(2, 48, 71, ";
                String mid = "), rgba(42, 157, 143, ";
                String end = "))";
                mainPane.setStyle(start + opacitySlider.getValue() + mid + opacitySlider.getValue() + end);
            }
        });
    }
}

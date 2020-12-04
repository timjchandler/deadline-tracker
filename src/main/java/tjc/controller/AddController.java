package tjc.controller;

import javafx.fxml.Initializable;

import java.net.URL;
import java.util.Date;
import java.util.ResourceBundle;

public class AddController implements Initializable {

    private Date now;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        now = new Date();
    }


}

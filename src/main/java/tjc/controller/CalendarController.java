package tjc.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import tjc.model.Deadline;
import tjc.model.User;

import java.net.URL;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.ResourceBundle;

public class CalendarController implements Initializable {

    private ArrayList<Label> days;
    private Calendar cal;
    private Date now;
    private int start;

    @FXML
    AnchorPane backPane;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        init();
        String temp = now.toString();
        days = new ArrayList<>();
    }

    private void init() {
        now = new Date();
        cal = Calendar.getInstance();
        cal.setTime(now);
        int currDay = (cal.get(Calendar.DAY_OF_WEEK) + 1) % 7;
        int currDate = (cal.get(Calendar.DATE));
        start = (currDay - currDate) % 7 ;
        start = start >= 0 ? start : start + 7;
//        System.out.println(start);
        int idx = 0;
        for (Node node: backPane.getChildren()) {
            if (idx < start || idx > start + 30) ((Label) node).setVisible(false);
            else {
                String day = Integer.toString(idx - start + 1);
                ((Label) node).setText(day);
            }
            ++idx;
        }
    }

    public void dateClicked(MouseEvent event) {
        int idx = 0;
        for (Node node: backPane.getChildren()) {
            if (event.getSource().equals(node)) {
                User.addDeadline(new Deadline(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH), idx - start + 1));
            }
            ++idx;
        }
    }
}


// fri 4 thu 3 wed 2 tue 1 (3)
// Sat 5

package sample;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;

public class Controller {

    @FXML private Label lblRedValue;
    @FXML private Slider slRed;
    @FXML private Slider slGreen;
    @FXML private Slider slBlue;
    @FXML private Circle preview;
    @FXML private Label lblGreenValue;
    @FXML private Label lblBlueValue;

    @FXML
    private void setGreen() {
        lblGreenValue.setText(Integer.toString((int)slGreen.getValue()));
    }

    @FXML
    private void setBlue() {
        lblBlueValue.setText(Integer.toString((int)slBlue.getValue()));
    }

    @FXML
    private void setRed() {
        lblRedValue.setText(Integer.toString((int)slRed.getValue()));
    }

    @FXML
    private void setColor() {
        Color c = Color.rgb((int)slRed.getValue(), (int)slGreen.getValue(), (int)slBlue.getValue());
        preview.setFill(c);
    }
}

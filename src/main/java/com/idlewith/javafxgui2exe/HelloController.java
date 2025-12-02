package com.idlewith.javafxgui2exe;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("JavaFXGUI2EXE Application for idlewith!");
    }
}

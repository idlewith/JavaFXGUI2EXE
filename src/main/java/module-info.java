module com.idlewith.javafxgui2exe {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.idlewith.javafxgui2exe to javafx.fxml;
    exports com.idlewith.javafxgui2exe;
}
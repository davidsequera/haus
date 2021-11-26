module com.haus.screens {
    requires javafx.controls;
    requires javafx.fxml;
    requires Domain;
    requires Business;

    opens com.haus.screens to javafx.fxml;
    exports com.haus.screens;
}
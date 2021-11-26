module Business {
    requires Domain;
    requires javafx.controls;
    requires javafx.fxml;

    requires javafx.graphics;
    opens com.haus.business to javafx.fxml;
    exports com.haus.business;
}
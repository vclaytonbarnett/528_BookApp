module com.mycompany.bookapplication {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.base;
    requires javafx.graphics;
    requires java.base;

    opens com.mycompany.bookapplication to javafx.fxml;
    exports com.mycompany.bookapplication;
}

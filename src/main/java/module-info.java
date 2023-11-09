module com.example.converterapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.converterapp to javafx.fxml;
    exports com.example.converterapp;
}
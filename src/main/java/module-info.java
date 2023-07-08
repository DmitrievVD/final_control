module com.example.final_control {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.final_control to javafx.fxml;
    exports com.example.final_control;
}
module com.example.heatcalculatorfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.heatcalculatorfx to javafx.fxml;
    exports com.example.heatcalculatorfx;
    exports com.example.heatcalculatorfx.view;
    opens com.example.heatcalculatorfx.view to javafx.fxml;
}
module com.example.programmingexercise_15_7 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.example.programmingexercise_15_7 to javafx.fxml;
    exports com.example.programmingexercise_15_7;
}
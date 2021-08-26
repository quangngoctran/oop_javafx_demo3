module com.example.oop_javafx_demo3 {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;


    opens com.example.oop_javafx_demo3 to javafx.fxml;
    exports com.example.oop_javafx_demo3;
}
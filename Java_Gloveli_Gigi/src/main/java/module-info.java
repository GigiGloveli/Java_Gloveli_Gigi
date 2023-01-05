module com.example.java_gloveli_gigi {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires org.testng;
    requires lombok;


    opens com.example.java_gloveli_gigi to javafx.fxml;
    exports com.example.java_gloveli_gigi;
}
module First_Second {
    requires javafx.controls;
    requires javafx.fxml;


    opens First_Second to javafx.fxml;
    exports First_Second;
    opens Third to javafx.fxml;
    exports Third;
    opens Fifth to javafx.fxml;
    exports Fifth;
}
module MainFiles.ass3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens MainFiles to javafx.fxml;
    exports MainFiles;
}
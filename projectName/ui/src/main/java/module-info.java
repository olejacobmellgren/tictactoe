module projectName.ui {
    
    requires javafx.base;
    requires javafx.controls;
    requires javafx.fxml;
    requires projectName.core;

    opens projectName.ui to javafx.graphics, javafx.fxml;
}

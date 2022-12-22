module tictactoeGame.ui {
    
    requires javafx.base;
    requires javafx.controls;
    requires javafx.fxml;
    requires tictactoeGame.core;

    opens tictactoeGame.ui to javafx.graphics, javafx.fxml;
}

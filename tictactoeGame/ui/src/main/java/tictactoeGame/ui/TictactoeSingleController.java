package tictactoeGame.ui;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class TictactoeSingleController {
    

    @FXML private Button back;

    @FXML private void handleBack() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Startpage.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        Stage stage = (Stage) back.getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

}

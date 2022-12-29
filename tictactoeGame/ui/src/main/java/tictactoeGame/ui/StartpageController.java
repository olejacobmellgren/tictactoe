package tictactoeGame.ui;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class StartpageController {

    @FXML private Button single;
    @FXML private Button two;

    @FXML
    private void handlesingle() throws IOException {
        Stage stage = (Stage) single.getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("TictactoeSingle.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void handletwo() throws IOException {
        Stage stage = (Stage) two.getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("TictactoeTwo.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
}

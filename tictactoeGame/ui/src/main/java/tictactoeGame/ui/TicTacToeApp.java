package tictactoeGame.ui;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * JavaFX App.
 */
public class TictactoeApp extends Application {

    /**
     * The app will be setup and be ready to be launched.
     */
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(this.getClass()
                                                   .getResource("Tictactoe.fxml"));
        Parent parent = fxmlLoader.load();
        stage.setScene(new Scene(parent));
        stage.setTitle("TicTacToe");
        stage.show();
    }

    /**
     * Launches the app.
     */
    public static void main(String[] args) {
        launch();
    }
}

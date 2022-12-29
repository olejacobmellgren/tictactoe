package tictactoeGame.ui;

import java.io.IOException;
import java.time.Duration;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class TictactoeTwoController {

    @FXML private Button a1, a2, a3, b1, b2, b3, c1, c2, c3;
    @FXML private Button back;
    @FXML private Pane names, game;
    @FXML private TextField player1, player2;
    @FXML private Label name1, name2, score1, score2, starter;
    @FXML private Circle a1S, a2S, a3S, b1S, b2S, b3S, c1S, c2S, c3S;
    @FXML private Text a1C, a2C, a3C, b1C, b2C, b3C, c1C, c2C, c3C;

    private boolean player1turn = true;
    
    @FXML private void handleOK() throws InterruptedException {
        if (player1.getText().equals("") || player2.getText().equals("")) {
            errormessage("Enter names for player 1 and player 2");
        }
        else {
            String name1toSet = player1.getText();
            String name2toSet = player2.getText();
            names.setVisible(false);
            name1.setText(name1toSet);
            name2.setText(name2toSet);
            score1.setText("0");
            score2.setText("0");
            starter.setText(name1toSet + " starts the game!");
        }
    }
    @FXML private void handleButtonA1() {
        if (player1turn) {
            a1S.setVisible(true);
            a1S.toFront();
            player1turn = false;
        } else {
            a1C.setVisible(true);
            a1C.toFront();
            player1turn = true;
        }
        a1.setDisable(true);
        checkIsVictory();
    }

    @FXML private void handleButtonA2() {
        if (player1turn) {
            a2S.setVisible(true);
            a2S.toFront();
            player1turn = false;
        } else {
            a2C.setVisible(true);
            a2C.toFront();
            player1turn = true;
        }
        a2.setDisable(true);
        checkIsVictory();
    }

    @FXML private void handleButtonA3() {
        if (player1turn) {
            a3S.setVisible(true);
            a3S.toFront();
            player1turn = false;
        } else {
            a3C.setVisible(true);
            a3C.toFront();
            player1turn = true;
        }
        a3.setDisable(true);
        checkIsVictory();
    }

    @FXML private void handleButtonB1() {
        if (player1turn) {
            b1S.setVisible(true);
            b1S.toFront();
            player1turn = false;
        } else {
            b1C.setVisible(true);
            b1C.toFront();
            player1turn = true;
        }
        b1.setDisable(true);
        checkIsVictory();
    }

    @FXML private void handleButtonB2() {
        if (player1turn) {
            b2S.setVisible(true);
            b2S.toFront();
            player1turn = false;
        } else {
            b2C.setVisible(true);
            b2C.toFront();
            player1turn = true;
        }
        b2.setDisable(true);
        checkIsVictory();
    }

    @FXML private void handleButtonB3() {
        if (player1turn) {
            b3S.setVisible(true);
            b3S.toFront();
            player1turn = false;
        } else {
            b3C.setVisible(true);
            b3C.toFront();
            player1turn = true;
        }
        b3.setDisable(true);
        checkIsVictory();
    }

    @FXML private void handleButtonC1() {
        if (player1turn) {
            c1S.setVisible(true);
            c1S.toFront();
            player1turn = false;
        } else {
            c1C.setVisible(true);
            c1C.toFront();
            player1turn = true;
        }
        c1.setDisable(true);
        checkIsVictory();
    }

    @FXML private void handleButtonC2() {
        if (player1turn) {
            c2S.setVisible(true);
            c2S.toFront();
            player1turn = false;
        } else {
            c2C.setVisible(true);
            c2C.toFront();
            player1turn = true;
        }
        c2.setDisable(true);
        checkIsVictory();
    }

    @FXML private void handleButtonC3() {
        if (player1turn) {
            c3S.setVisible(true);
            c3S.toFront();
            player1turn = false;
        } else {
            c3C.setVisible(true);
            c3C.toFront();
            player1turn = true;
        }
        c3.setDisable(true);
        checkIsVictory();
    }

    @FXML private void handleBack() throws IOException {
        Stage stage = (Stage) back.getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Startpage.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML 

    private void showGameOver(String winner) {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("GAME OVER");
        alert.setHeaderText(winner + " WON!");
        alert.showAndWait();
    }

    private void errormessage(String error) {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("ERROR");
        alert.setHeaderText(error);
        alert.showAndWait();
    }

    private void showTie() {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("GAME OVER");
        alert.setHeaderText("NOBODY WON");
        alert.showAndWait();
    }

    private void checkIsVictory() {
        starter.setVisible(false);
        if ((a1S.isVisible() && a2S.isVisible() && a3S.isVisible()) || (a1S.isVisible() && b2S.isVisible() && c3S.isVisible()) ||
            (a1S.isVisible() && b1S.isVisible() && c1S.isVisible()) || (b1S.isVisible() && b2S.isVisible() && b3S.isVisible()) ||
            (c1S.isVisible() && c2S.isVisible() && c3S.isVisible()) || (c1S.isVisible() && b2S.isVisible() && a3S.isVisible()) ||
            (a2S.isVisible() && b2S.isVisible() && c2S.isVisible()) || (a3S.isVisible() && b3S.isVisible() && c3S.isVisible())) {
            showGameOver(name1.getText());
            Integer scoreP1 = Integer.valueOf(score1.getText());
            score1.setText(String.valueOf(scoreP1 + 1));
            restart();
        } else if ((a1C.isVisible() && a2C.isVisible() && a3C.isVisible()) || (a1C.isVisible() && b2C.isVisible() && c3C.isVisible()) ||
                    (a1C.isVisible() && b1C.isVisible() && c1C.isVisible()) || (b1C.isVisible() && b2C.isVisible() && b3C.isVisible()) ||
                    (c1C.isVisible() && c2C.isVisible() && c3C.isVisible()) || (c1C.isVisible() && b2C.isVisible() && a3C.isVisible()) ||
                    (a2C.isVisible() && b2C.isVisible() && c2C.isVisible()) || (a3C.isVisible() && b3C.isVisible() && c3C.isVisible())) {
            showGameOver(name2.getText());
            Integer scoreP2 = Integer.valueOf(score2.getText());
            score2.setText(String.valueOf(scoreP2 + 1));
            restart();
        } else if ((a1C.isVisible() || a1S.isVisible()) && (a2C.isVisible() || a2S.isVisible()) && (a3C.isVisible() || a3S.isVisible()) &&
                    (b1C.isVisible() || b1S.isVisible()) && (b2C.isVisible() || b2S.isVisible()) && (b3C.isVisible() || b3S.isVisible()) &&
                    (c1C.isVisible() || c1S.isVisible()) && (c2C.isVisible() || c2S.isVisible()) && (c3C.isVisible() || c3S.isVisible())) {
                        showTie();
                        restart();
                    }
    }

    private void restart() {
        a1S.setVisible(false);
        a2S.setVisible(false);
        a3S.setVisible(false);
        b1S.setVisible(false);
        b2S.setVisible(false);
        b3S.setVisible(false);
        c1S.setVisible(false);
        c2S.setVisible(false);
        c3S.setVisible(false);

        a1C.setVisible(false);
        a2C.setVisible(false);
        a3C.setVisible(false);
        b1C.setVisible(false);
        b2C.setVisible(false);
        b3C.setVisible(false);
        c1C.setVisible(false);
        c2C.setVisible(false);
        c3C.setVisible(false);

        a1.setDisable(false);
        a2.setDisable(false);
        a3.setDisable(false);
        b1.setDisable(false);
        b2.setDisable(false);
        b3.setDisable(false);
        c1.setDisable(false);
        c2.setDisable(false);
        c3.setDisable(false);

        a1.toFront();
        a2.toFront();
        a3.toFront();
        b1.toFront();
        b2.toFront();
        b3.toFront();
        c1.toFront();
        c2.toFront();
        c3.toFront();

        player1turn = true;
    }   
}

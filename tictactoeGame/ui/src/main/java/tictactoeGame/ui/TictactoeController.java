package tictactoeGame.ui;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;

public class TictactoeController {

    @FXML Button a1, a2, a3, b1, b2, b3, c1, c2, c3;
    @FXML Circle a1S, a2S, a3S, b1S, b2S, b3S, c1S, c2S, c3S;
    @FXML Text a1C, a2C, a3C, b1C, b2C, b3C, c1C, c2C, c3C;

    private boolean player1 = true;
    

    @FXML void handleButtonA1() {
        if (player1) {
            a1S.setVisible(true);
            a1S.toFront();
            player1 = false;
        } else {
            a1C.setVisible(true);
            a1C.toFront();
            player1 = true;
        }
        checkIsVictory();
    }

    @FXML void handleButtonA2() {
        if (player1) {
            a2S.setVisible(true);
            a2S.toFront();
            player1 = false;
        } else {
            a2C.setVisible(true);
            a2C.toFront();
            player1 = true;
        }
        checkIsVictory();
    }

    @FXML void handleButtonA3() {
        if (player1) {
            a3S.setVisible(true);
            a3S.toFront();
            player1 = false;
        } else {
            a3C.setVisible(true);
            a3C.toFront();
            player1 = true;
        }
        checkIsVictory();
    }

    @FXML void handleButtonB1() {
        if (player1) {
            b1S.setVisible(true);
            b1S.toFront();
            player1 = false;
        } else {
            b1C.setVisible(true);
            b1C.toFront();
            player1 = true;
        }
        checkIsVictory();
    }

    @FXML void handleButtonB2() {
        if (player1) {
            b2S.setVisible(true);
            b2S.toFront();
            player1 = false;
        } else {
            b2C.setVisible(true);
            b2C.toFront();
            player1 = true;
        }
        checkIsVictory();
    }

    @FXML void handleButtonB3() {
        if (player1) {
            b3S.setVisible(true);
            b3S.toFront();
            player1 = false;
        } else {
            b3C.setVisible(true);
            b3C.toFront();
            player1 = true;
        }
        checkIsVictory();
    }

    @FXML void handleButtonC1() {
        if (player1) {
            c1S.setVisible(true);
            c1S.toFront();
            player1 = false;
        } else {
            c1C.setVisible(true);
            c1C.toFront();
            player1 = true;
        }
        checkIsVictory();
    }

    @FXML void handleButtonC2() {
        if (player1) {
            c2S.setVisible(true);
            c2S.toFront();
            player1 = false;
        } else {
            c2C.setVisible(true);
            c2C.toFront();
            player1 = true;
        }
        checkIsVictory();
    }

    @FXML void handleButtonC3() {
        if (player1) {
            c3S.setVisible(true);
            c3S.toFront();
            player1 = false;
        } else {
            c3C.setVisible(true);
            c3C.toFront();
            player1 = true;
        }
        checkIsVictory();
    }

    private void showGameOver(String winner) {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("GAME OVER");
        alert.setHeaderText(winner + " WON!");
        alert.showAndWait();
    }

    private void showTie() {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("GAME OVER");
        alert.setHeaderText("NOBODY WON");
        alert.showAndWait();
    }

    private void checkIsVictory() {
        if ((a1S.isVisible() && a2S.isVisible() && a3S.isVisible()) || (a1S.isVisible() && b2S.isVisible() && c3S.isVisible()) ||
            (a1S.isVisible() && b1S.isVisible() && c1S.isVisible()) || (b1S.isVisible() && b2S.isVisible() && b3S.isVisible()) ||
            (c1S.isVisible() && c2S.isVisible() && c3S.isVisible()) || (c1S.isVisible() && b2S.isVisible() && a3S.isVisible()) ||
            (a2S.isVisible() && b2S.isVisible() && c2S.isVisible()) || (a3S.isVisible() && b3S.isVisible() && c3S.isVisible())) {
            showGameOver("Player 1");
            handleRestart();
        } else if ((a1C.isVisible() && a2C.isVisible() && a3C.isVisible()) || (a1C.isVisible() && b2C.isVisible() && c3C.isVisible()) ||
                    (a1C.isVisible() && b1C.isVisible() && c1C.isVisible()) || (b1C.isVisible() && b2C.isVisible() && b3C.isVisible()) ||
                    (c1C.isVisible() && c2C.isVisible() && c3C.isVisible()) || (c1C.isVisible() && b2C.isVisible() && a3C.isVisible()) ||
                    (a2C.isVisible() && b2C.isVisible() && c2C.isVisible()) || (a3C.isVisible() && b3C.isVisible() && c3C.isVisible())) {
            showGameOver("Player 2");
            handleRestart();
        } else if ((a1C.isVisible() || a1S.isVisible()) && (a2C.isVisible() || a2S.isVisible()) && (a3C.isVisible() || a3S.isVisible()) &&
                    (b1C.isVisible() || b1S.isVisible()) && (b2C.isVisible() || b2S.isVisible()) && (b3C.isVisible() || b3S.isVisible()) &&
                    (c1C.isVisible() || c1S.isVisible()) && (c2C.isVisible() || c2S.isVisible()) && (c3C.isVisible() || c3S.isVisible())) {
                        showTie();
                        handleRestart();
                    }
    }

    @FXML
    private void handleRestart() {
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

        a1.toFront();
        a2.toFront();
        a3.toFront();
        b1.toFront();
        b2.toFront();
        b3.toFront();
        c1.toFront();
        c2.toFront();
        c3.toFront();

        player1 = true;
    }   
}

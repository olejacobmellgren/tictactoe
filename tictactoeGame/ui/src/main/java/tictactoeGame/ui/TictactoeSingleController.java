package tictactoeGame.ui;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class TictactoeSingleController {
    

    @FXML private Button a1, a2, a3, b1, b2, b3, c1, c2, c3, back;
    @FXML private Label score1, score2, starter;
    @FXML private Circle a1S, a2S, a3S, b1S, b2S, b3S, c1S, c2S, c3S;
    @FXML private Text a1C, a2C, a3C, b1C, b2C, b3C, c1C, c2C, c3C;

    @FXML private void handleBack() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Startpage.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        Stage stage = (Stage) back.getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
    
    @FXML private void handleButtonA1() {
        a1S.setVisible(true);
        a1S.toFront();
        a1.setDisable(true);
        if (!isVictory()) {
            computerTurn();
        }
    }

    @FXML private void handleButtonA2() {
        a2S.setVisible(true);
        a2S.toFront();
        a2.setDisable(true);
        if (!isVictory()) {
            computerTurn();
        }
    }

    @FXML private void handleButtonA3() {
        a3S.setVisible(true);
        a3S.toFront();
        a3.setDisable(true);
        if (!isVictory()) {
            computerTurn();
        }
    }

    @FXML private void handleButtonB1() {
        b1S.setVisible(true);
        b1S.toFront();
        b1.setDisable(true);
        if (!isVictory()) {
            computerTurn();
        }
    }

    @FXML private void handleButtonB2() {
        b2S.setVisible(true);
        b2S.toFront();
        b2.setDisable(true);
        if (!isVictory()) {
            computerTurn();
        }
    }

    @FXML private void handleButtonB3() {
        b3S.setVisible(true);
        b3S.toFront();
        b3.setDisable(true);
        if (!isVictory()) {
            computerTurn();
        }
    }

    @FXML private void handleButtonC1() {
        c1S.setVisible(true);
        c1S.toFront();
        c1.setDisable(true);
        if (!isVictory()) {
            computerTurn();
        }
    }

    @FXML private void handleButtonC2() {
        c2S.setVisible(true);
        c2S.toFront();
        c2.setDisable(true);
        if (!isVictory()) {
            computerTurn();
        }
    }

    @FXML private void handleButtonC3() {
        c3S.setVisible(true);
        c3S.toFront();
        c3.setDisable(true);
        if (!isVictory()) {
            computerTurn();
        }
    }

    private boolean canOpponentWin() {
        if (a1S.isVisible() && a2S.isVisible() && !a3C.isVisible()) {
            a3C.setVisible(true);
            a3C.toFront();
            return true;
        } if (a1S.isVisible() && a3S.isVisible() && !a2C.isVisible()) {
            a2C.setVisible(true);
            a2C.toFront();
            return true;
        } if (a2S.isVisible() && a3S.isVisible() && !a1C.isVisible()) {
            a1C.setVisible(true);
            a1C.toFront();
            return true;
        } if (a1S.isVisible() && b2S.isVisible() && !c3C.isVisible()) {
            c3C.setVisible(true);
            c3C.toFront();
            return true;
        } if (b2S.isVisible() && c3S.isVisible() && !a1C.isVisible()) {
            a1C.setVisible(true);
            a1C.toFront();
            return true;
        } if (a1S.isVisible() && c3S.isVisible() && !b2C.isVisible()) {
            b2C.setVisible(true);
            b2C.toFront();
            return true;
        } if (a1S.isVisible() && b1S.isVisible() && !c1C.isVisible()) {
            c1C.setVisible(true);
            c1C.toFront();
            return true;
        } if (a1S.isVisible() && c1S.isVisible() && !b1C.isVisible()) {
            b1C.setVisible(true);
            b1C.toFront();
            return true;
        } if (b1S.isVisible() && c1S.isVisible() && !a1C.isVisible()) {
            a1C.setVisible(true);
            a1C.toFront();
            return true;
        } if (b1S.isVisible() && b3S.isVisible() && !b2C.isVisible()) {
            b2C.setVisible(true);
            b2C.toFront();
            return true;
        } if (b1S.isVisible() && b2S.isVisible() && !b3C.isVisible()) {
            b3C.setVisible(true);
            b3C.toFront();
            return true;
        } if (b2S.isVisible() && b3S.isVisible() && !b1C.isVisible()) {
            b1C.setVisible(true);
            b1C.toFront();
            return true;
        } if (c1S.isVisible() && c3S.isVisible() && !c2C.isVisible()) {
            c2C.setVisible(true);
            c2C.toFront();
            return true;
        } if (c1S.isVisible() && c2S.isVisible() && !c3C.isVisible()) {
            c3C.setVisible(true);
            c3C.toFront();
            return true;
        } if (c2S.isVisible() && c3S.isVisible() && !c1C.isVisible()) {
            c1C.setVisible(true);
            c1C.toFront();
            return true;
        } if (c1S.isVisible() && b2S.isVisible() && !a3C.isVisible()) {
            a3C.setVisible(true);
            a3C.toFront();
            return true;
        } if (c1S.isVisible() && a3S.isVisible() && !b2C.isVisible()) {
            b2C.setVisible(true);
            b2C.toFront();
            return true;
        } if (b2S.isVisible() && a3S.isVisible() && !c1C.isVisible()) {
            c1C.setVisible(true);
            c1C.toFront();
            return true;
        } if (a2S.isVisible() && b2S.isVisible() && !c2C.isVisible()) {
            c2C.setVisible(true);
            c2C.toFront();
            return true;
        } if (b2S.isVisible() && c2S.isVisible() && !a2C.isVisible()) {
            a2C.setVisible(true);
            a2C.toFront();
            return true;
        } if (a2S.isVisible() && c2S.isVisible() && !b2C.isVisible()) {
            b2C.setVisible(true);
            b2C.toFront();
            return true;
        } if (c3S.isVisible() && b3S.isVisible() && !a3C.isVisible()) {
            a3C.setVisible(true);
            a3C.toFront();
            return true;
        } if (c3S.isVisible() && a3S.isVisible() && !b3C.isVisible()) {
            b3C.setVisible(true);
            b3C.toFront();
            return true;
        } if (a3S.isVisible() && b3S.isVisible() && !c3C.isVisible()) {
            c3C.setVisible(true);
            c3C.toFront();
            return true;
        } else {
            return false;
        }
    }

    private boolean canComputerWin() {
        if (a1C.isVisible() && a2C.isVisible() && !a3S.isVisible()) {
            a3C.setVisible(true);
            a3C.toFront();
            return true;
        } if (a1C.isVisible() && a3C.isVisible() && !a2S.isVisible()) {
            a2C.setVisible(true);
            a2C.toFront();
            return true;
        } if (a2C.isVisible() && a3C.isVisible() && !a1S.isVisible()) {
            a1C.setVisible(true);
            a1C.toFront();
            return true;
        } if (a1C.isVisible() && b2C.isVisible() && !c3S.isVisible()) {
            c3C.setVisible(true);
            c3C.toFront();
            return true;
        } if (b2C.isVisible() && c3C.isVisible() && !a1S.isVisible()) {
            a1C.setVisible(true);
            a1C.toFront();
            return true;
        } if (a1C.isVisible() && c3C.isVisible() && !b2S.isVisible()) {
            b2C.setVisible(true);
            b2C.toFront();
            return true;
        } if (a1C.isVisible() && b1C.isVisible() && !c1S.isVisible()) {
            c1C.setVisible(true);
            c1C.toFront();
            return true;
        } if (a1C.isVisible() && c1C.isVisible() && !b1S.isVisible()) {
            b1C.setVisible(true);
            b1C.toFront();
            return true;
        } if (b1C.isVisible() && c1C.isVisible() && !a1S.isVisible()) {
            a1C.setVisible(true);
            a1C.toFront();
            return true;
        } if (b1C.isVisible() && b3C.isVisible() && !b2S.isVisible()) {
            b2C.setVisible(true);
            b2C.toFront();
            return true;
        } if (b1C.isVisible() && b2C.isVisible() && !b3S.isVisible()) {
            b3C.setVisible(true);
            b3C.toFront();
            return true;
        } if (b2C.isVisible() && b3C.isVisible() && !b1S.isVisible()) {
            b1C.setVisible(true);
            b1C.toFront();
            return true;
        } if (c1C.isVisible() && c3C.isVisible() && !c2S.isVisible()) {
            c2C.setVisible(true);
            c2C.toFront();
            return true;
        } if (c1C.isVisible() && c2C.isVisible() && !c3S.isVisible()) {
            c3C.setVisible(true);
            c3C.toFront();
            return true;
        } if (c2C.isVisible() && c3C.isVisible() && !c1S.isVisible()) {
            c1C.setVisible(true);
            c1C.toFront();
            return true;
        } if (c1C.isVisible() && b2C.isVisible() && !a3S.isVisible()) {
            a3C.setVisible(true);
            a3C.toFront();
            return true;
        } if (c1C.isVisible() && a3C.isVisible() && !b2S.isVisible()) {
            b2C.setVisible(true);
            b2C.toFront();
            return true;
        } if (b2C.isVisible() && a3C.isVisible() && !c1S.isVisible()) {
            c1C.setVisible(true);
            c1C.toFront();
            return true;
        } if (a2C.isVisible() && b2C.isVisible() && !c2S.isVisible()) {
            c2C.setVisible(true);
            c2C.toFront();
            return true;
        } if (b2C.isVisible() && c2C.isVisible() && !a2S.isVisible()) {
            a2C.setVisible(true);
            a2C.toFront();
            return true;
        } if (a2C.isVisible() && c2C.isVisible() && !b2S.isVisible()) {
            b2C.setVisible(true);
            b2C.toFront();
            return true;
        } if (c3C.isVisible() && b3C.isVisible() && !a3S.isVisible()) {
            a3C.setVisible(true);
            a3C.toFront();
            return true;
        } if (c3C.isVisible() && a3C.isVisible() && !b3S.isVisible()) {
            b3C.setVisible(true);
            b3C.toFront();
            return true;
        } if (a3C.isVisible() && b3C.isVisible() && !c3S.isVisible()) {
            c3C.setVisible(true);
            c3C.toFront();
            return true;
        } else {
            return false;
        }
    }

    private void computerTurn() {
        if (canComputerWin()) {
            isVictory();
            return;
        } else if (canOpponentWin()) {
            isVictory();
            return;
        }
        if (!b2S.isVisible() && !b2C.isVisible()) {
            b2C.setVisible(true);
            b2C.toFront();
        } else if (!a1S.isVisible() && !a1C.isVisible()) {
            a1C.setVisible(true);
            a1C.toFront();
        } else if (!a3S.isVisible() && !a3C.isVisible()) {
            a3C.setVisible(true);
            a3C.toFront();
        } else if (!c3S.isVisible() && !c3C.isVisible()) {
            c3C.setVisible(true);
            c3C.toFront();
        } else if (!c1S.isVisible() && !c1C.isVisible()) {
            c1C.setVisible(true);
            c1C.toFront();
        } else if (!a2S.isVisible() && !a2C.isVisible()) {
            a2C.setVisible(true);
            a2C.toFront();
        } else if (!b3S.isVisible() && !b3C.isVisible()) {
            b3C.setVisible(true);
            b3C.toFront();
        } else if (!c2S.isVisible() && !c2C.isVisible()) {
            c2C.setVisible(true);
            c2C.toFront();
        } else if (!b1S.isVisible() && !b1C.isVisible()) {
            b1C.setVisible(true);
            b1C.toFront();
        } 
        isVictory();
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

    private boolean isVictory() {
        starter.setVisible(false);
        boolean gameOver = false;
        if ((a1S.isVisible() && a2S.isVisible() && a3S.isVisible()) || (a1S.isVisible() && b2S.isVisible() && c3S.isVisible()) ||
            (a1S.isVisible() && b1S.isVisible() && c1S.isVisible()) || (b1S.isVisible() && b2S.isVisible() && b3S.isVisible()) ||
            (c1S.isVisible() && c2S.isVisible() && c3S.isVisible()) || (c1S.isVisible() && b2S.isVisible() && a3S.isVisible()) ||
            (a2S.isVisible() && b2S.isVisible() && c2S.isVisible()) || (a3S.isVisible() && b3S.isVisible() && c3S.isVisible())) {
            gameOver = true;
            showGameOver("YOU");
            Integer scoreP1 = Integer.valueOf(score1.getText());
            score1.setText(String.valueOf(scoreP1 + 1));
            restart();
        } else if ((a1C.isVisible() && a2C.isVisible() && a3C.isVisible()) || (a1C.isVisible() && b2C.isVisible() && c3C.isVisible()) ||
                    (a1C.isVisible() && b1C.isVisible() && c1C.isVisible()) || (b1C.isVisible() && b2C.isVisible() && b3C.isVisible()) ||
                    (c1C.isVisible() && c2C.isVisible() && c3C.isVisible()) || (c1C.isVisible() && b2C.isVisible() && a3C.isVisible()) ||
                    (a2C.isVisible() && b2C.isVisible() && c2C.isVisible()) || (a3C.isVisible() && b3C.isVisible() && c3C.isVisible())) {
            gameOver = true;
            showGameOver("COMPUTER");
            Integer scoreP2 = Integer.valueOf(score2.getText());
            score2.setText(String.valueOf(scoreP2 + 1));
            restart();
        } else if ((a1C.isVisible() || a1S.isVisible()) && (a2C.isVisible() || a2S.isVisible()) && (a3C.isVisible() || a3S.isVisible()) &&
                    (b1C.isVisible() || b1S.isVisible()) && (b2C.isVisible() || b2S.isVisible()) && (b3C.isVisible() || b3S.isVisible()) &&
                    (c1C.isVisible() || c1S.isVisible()) && (c2C.isVisible() || c2S.isVisible()) && (c3C.isVisible() || c3S.isVisible())) {
                        gameOver = true;
                        showTie();
                        restart();
                    }
        return gameOver;
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

        starter.setVisible(true);
    }   
}

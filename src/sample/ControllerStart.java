package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
//import javafx.stage.Stage;
import javafx.event.ActionEvent;
//import java.awt.event.ActionEvent;

public class ControllerStart {

    @FXML
    private ImageView imageViewBackground;

    @FXML
    private ImageView imageViewTitle;

    @FXML
    private Button buttonPlay;

    @FXML
    private Button buttonHelp;

    @FXML
    private Button buttonExit;

    @FXML
    private void exitGame(ActionEvent event) {
        //Stage stage = (Stage) buttonExit.getScene().getWindow();
        //stage.close();
        exitProgram(0);
    }

    @FXML
    private void openHelpMenu(ActionEvent event) {
        //exitProgram(0);
    }

    @FXML
    private void startPlayGame(ActionEvent event) {
        //exitProgram(0);
    }


    @FXML
    public String exitProgram(int exit_status) {
        String controlSentence;
        if (exit_status == 0) {
            controlSentence = "Game exited normally";
            System.exit(exit_status);
        }
        else {
            controlSentence = "Error: Game closed irregularly";
            System.exit(exit_status);
        }
        return controlSentence;
    }

}


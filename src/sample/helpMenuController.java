package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class helpMenuController {

    @FXML
    private Button helpMenuButtonBack;

    @FXML
    void BackToMainMenu(ActionEvent event) throws IOException {
        Parent newRoot = FXMLLoader.load(getClass().getResource("sample.fxml"));
        Stage primaryStage = (Stage) helpMenuButtonBack.getScene().getWindow();
        primaryStage.getScene().setRoot(newRoot);
    }

}


package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.event.ActionEvent;
import javafx.stage.Stage;

import java.io.IOException;
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
        goToHelp();
    }

    @FXML
    private void startPlayGame(ActionEvent event) {
        //exitProgram(0);
    }



    public void exitProgram(int exit_status) {
        if (exit_status == 0) {
            System.out.println("Game exited normally");
            System.exit(exit_status);
        }
        else {
            System.out.println("Error: Game closed irregularly");
            System.exit(exit_status);
        }
    }

    public void goToHelp() {
        try {
            setupSceneHelp();
            /*Stage helpPageStage = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("help.fxml"));

            helpPageStage.setTitle("Craftsmanship");
            helpPageStage.setScene(new Scene(root, 800, 600));
            helpPageStage.show();*/
        }
        catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }
    }

    public void setupSceneHelp() throws IOException {
        Parent newRoot = FXMLLoader.load(getClass().getResource("help.fxml"));
        Stage primaryStage = (Stage) buttonHelp.getScene().getWindow();
        primaryStage.getScene().setRoot(newRoot);


    }

    }




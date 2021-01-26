package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.Window;
import sample.sewing.Cloth;

import java.io.IOException;

public class PhoneController {

    /*GameController game = new GameController();

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    //double money = game.getMoney();

    public int getCurrentAmount() {
        return currentAmount;
    }

    public void setCurrentAmount(int currentAmount) {
        this.currentAmount = currentAmount;
    }

    int currentAmount = game.getMaterialCount();*/


    @FXML
    private Button buttonBank;

    @FXML
    private Button buttonMail;

    @FXML
    private Button buttonShop;

    @FXML
    private Button buttonSettings;

    @FXML
    private Button buttonClosePhone;

    @FXML
    void ClosePhone(ActionEvent event) throws IOException {
        ((Stage)(((Button)event.getSource()).getScene().getWindow())).close();
    }

    @FXML
    void OpenBank(ActionEvent event) {

    }

    @FXML
    void OpenMail(ActionEvent event) {

    }

    @FXML
    void OpenSettings(ActionEvent event) {

    }

    @FXML
    void OpenShop(ActionEvent event) {
       // BuyCloth();
    }

    /*public void BuyCloth() {
        if (money < 5) {
            System.out.println("No money!");
        }
        else {
            money = money - 5;
            currentAmount = currentAmount + 3;
            System.out.println(currentAmount + " " + money);
        }
    }*/

}

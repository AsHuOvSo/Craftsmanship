package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Popup;
import javafx.stage.Stage;
import sample.sewing.Cloth;
import sample.sewing.Product;

import java.io.File;
import java.io.IOException;

public class GameController {
    /*----------------------------------------Variables------------------------------------*/

    Product ragDoll = new Product("Rag Doll", 1, 1, 10.0);
    Cloth clothAmount = new Cloth();
    int ragDollAmount = 0, currentEnergy = 17;

    public int getMaterialCount() {
        return materialCount;
    }

    public void setMaterialCount(int materialCount) {
        this.materialCount = materialCount;
    }

    int materialCount = clothAmount.getClothCount();

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    double money = 50.0;

    PhoneController phone = new PhoneController();
    @FXML
    private ImageView imageViewEnergy;

    @FXML
    private Button buttonPhone;

    @FXML
    private ImageView imageViewPhone;

    @FXML
    private Button buttonMisc;

    @FXML
    private Button buttonSofa;

    @FXML
    private ImageView imageViewSofa;

    @FXML
    private Button buttonBed;

    @FXML
    private ImageView imageViewBed;

    @FXML
    private Button buttonCupboard;

    @FXML
    private ImageView imageViewCupboard;

    @FXML
    private Button buttonFridge;

    @FXML
    private ImageView imageViewCharacter;

    /*-------------------------------------Button Event--------------------------------------*/

    @FXML
    void CraftMaterial(ActionEvent event)  {
        if (currentEnergy >= 1 && materialCount >= 1) {
            UseEnergy(1);
            UseMaterial(1);
            ChangeEnergyBar();
            ragDollAmount = ragDollAmount + 1;
            System.out.println(currentEnergy + " " + ragDollAmount + " " + materialCount);
            ChangePlayerLocal(600.0, 5.0);
        }
        else {
            if (currentEnergy == 0) {
                System.out.println("No energy!");
            }
            else {
                System.out.println("No material!");
            }
        }
    }

    @FXML
    void OpenMiscMenu(ActionEvent event) {
        ShipItem(10.0);
        ChangePlayerLocal(87, 14);
        System.out.println(money + " " + ragDollAmount);
    }

    @FXML
    void OpenPhoneMenu(ActionEvent event) throws IOException {

        OpenPhoneStage();
    }

    @FXML
    void OpenStorage(ActionEvent event) {

    }

    @FXML
    void RestoreEnergyEat(ActionEvent event) {
        RestoreEnergy(2);
        ChangeEnergyBar();
        ChangePlayerLocal(86.0, 121.0);
    }

    @FXML
    void RestoreEnergySleep(ActionEvent event) {
        RestoreEnergy(5);
        ChangeEnergyBar();
        ChangePlayerLocal(760.0, 290.0);
    }

    /*----------------------------------------Functions------------------------------------*/

    public void OpenPhoneStage() {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("phone.fxml"));
        Scene newScene;
        try {
            newScene = new Scene(loader.load());
        } catch (IOException ex) {
            return;
        }
        Stage inputStage = new Stage();
        Stage primaryStage = (Stage) buttonPhone.getScene().getWindow();
        inputStage.initOwner(primaryStage);
        inputStage.setScene(newScene);
        inputStage.showAndWait();


        /*money = phone.getMoney();
        materialCount = phone.getCurrentAmount();*/

    }

    public void UseEnergy(int energyConsumption) {
        if (currentEnergy != 0) {
            currentEnergy = currentEnergy-energyConsumption;
        }
        else {
            System.out.println("No energy");
        }
    }

    public void RestoreEnergy(int energyRestoration) {
        if (currentEnergy != 17) {
            currentEnergy = currentEnergy+energyRestoration;
        }
        else {
            System.out.println("Energy full");
        }
    }

    public void UseMaterial(int materialConsumption) {
        if (materialCount != 0) {
            materialCount = materialCount - materialConsumption;
        }
        else {
            System.out.println("Material depleted");
        }
    }

    public void ShipItem(double sellPrice) {
        if (ragDollAmount > 0) {
            ragDollAmount = ragDollAmount - 1;
            money = money + sellPrice;
        }
        else {
            System.out.println("Nothing to ship!");
        }
    }

    public void RestoreMaterial(int materialRestoration) {
        materialCount = materialCount + materialRestoration;
    }

    public void ChangePlayerLocal(double x, double y) {
        imageViewCharacter.setLayoutX(x);
        imageViewCharacter.setLayoutY(y);
    }

    /*public void UpdateMoney() {
        double tempM = phone.getMoney();
        if(!(money == tempM)) {
            money = tempM;
        }
        else {
            money = money;
        }
    }

    public void UpdateCloth() {
        int tempC = phone.getCurrentAmount();
        if(!(materialCount == tempC)) {
            materialCount = tempC;
        }
        else {
            materialCount = materialCount;
        }
    }*/



    /*--------------------------------------Show energybar---------------------------------*/

    public void ChangeEnergyBar() {
        File file;
        Image image;
        switch(currentEnergy) {
            case 0:
                file = new File("src/sample/resources/images/energy0.png");
                image = new Image(file.toURI().toString());
                imageViewEnergy.setImage(image);
                break;
            case 1:
                file = new File("src/sample/resources/images/energy1.png");
                image = new Image(file.toURI().toString());
                imageViewEnergy.setImage(image);
                break;
            case 2:
                file = new File("src/sample/resources/images/energy2.png");
                image = new Image(file.toURI().toString());
                imageViewEnergy.setImage(image);
                break;
            case 3:
                file = new File("src/sample/resources/images/energy3.png");
                image = new Image(file.toURI().toString());
                imageViewEnergy.setImage(image);
                break;
            case 4:
                file = new File("src/sample/resources/images/energy4.png");
                image = new Image(file.toURI().toString());
                imageViewEnergy.setImage(image);
                break;
            case 5:
                file = new File("src/sample/resources/images/energy5.png");
                image = new Image(file.toURI().toString());
                imageViewEnergy.setImage(image);
                break;
            case 6:
                file = new File("src/sample/resources/images/energy6.png");
                image = new Image(file.toURI().toString());
                imageViewEnergy.setImage(image);
                break;
            case 7:
                file = new File("src/sample/resources/images/energy7.png");
                image = new Image(file.toURI().toString());
                imageViewEnergy.setImage(image);
                break;
            case 8:
                file = new File("src/sample/resources/images/energy8.png");
                image = new Image(file.toURI().toString());
                imageViewEnergy.setImage(image);
                break;
            case 9:
                file = new File("src/sample/resources/images/energy9.png");
                image = new Image(file.toURI().toString());
                imageViewEnergy.setImage(image);
                break;
            case 10:
                file = new File("src/sample/resources/images/energy10.png");
                image = new Image(file.toURI().toString());
                imageViewEnergy.setImage(image);
                break;
            case 11:
                file = new File("src/sample/resources/images/energy11.png");
                image = new Image(file.toURI().toString());
                imageViewEnergy.setImage(image);
                break;
            case 12:
                file = new File("src/sample/resources/images/energy12.png");
                image = new Image(file.toURI().toString());
                imageViewEnergy.setImage(image);
                break;
            case 13:
                file = new File("src/sample/resources/images/energy13.png");
                image = new Image(file.toURI().toString());
                imageViewEnergy.setImage(image);
                break;
            case 14:
                file = new File("src/sample/resources/images/energy14.png");
                image = new Image(file.toURI().toString());
                imageViewEnergy.setImage(image);
                break;
            case 15:
                file = new File("src/sample/resources/images/energy15.png");
                image = new Image(file.toURI().toString());
                imageViewEnergy.setImage(image);
                break;
            case 16:
                file = new File("src/sample/resources/images/energy16.png");
                image = new Image(file.toURI().toString());
                imageViewEnergy.setImage(image);
                break;
            default:
                file = new File("src/sample/resources/images/energy17.png");
                image = new Image(file.toURI().toString());
                imageViewEnergy.setImage(image);
        }
    }



}

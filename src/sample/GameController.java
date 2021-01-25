package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import sample.sewing.Product;

public class GameController {

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

    /*-------------------------------------Button Event--------------------------------------*/

    @FXML
    void CraftMaterial(ActionEvent event) throws InterruptedException {
        UseEnergy(ragDoll.energy);
        ChangeEnergyBar();
        ragDollAmount++;
        wait(10000);
    }

    @FXML
    void OpenMiscMenu(ActionEvent event) {

    }

    @FXML
    void OpenPhoneMenu(ActionEvent event) {

    }

    @FXML
    void OpenStorage(ActionEvent event) {

    }

    @FXML
    void RestoreEnergyEat(ActionEvent event) {

    }

    @FXML
    void RestoreEnergySleep(ActionEvent event) {

    }

    /*----------------------------------------Functions------------------------------------*/

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

    public void RestoreMaterial(int materialRestoration) {
        materialCount = materialCount + materialRestoration;
    }

    /*--------------------------------------Show energybar---------------------------------*/

    public void ChangeEnergyBar() {
        switch(currentEnergy) {
            case 0:
                imageViewEnergy.setImage(new Image("src/sample/resources/images/energy0.png"));
                break;
            case 1:
                imageViewEnergy.setImage(new Image("src/sample/resources/images/energy1.png"));
                break;
            case 2:
                imageViewEnergy.setImage(new Image("src/sample/resources/images/energy2.png"));
                break;
            case 3:
                imageViewEnergy.setImage(new Image("src/sample/resources/images/energy3.png"));
                break;
            case 4:
                imageViewEnergy.setImage(new Image("src/sample/resources/images/energy4.png"));
                break;
            case 5:
                imageViewEnergy.setImage(new Image("src/sample/resources/images/energy5.png"));
                break;
            case 6:
                imageViewEnergy.setImage(new Image("src/sample/resources/images/energy6.png"));
                break;
            case 7:
                imageViewEnergy.setImage(new Image("src/sample/resources/images/energy7.png"));
                break;
            case 8:
                imageViewEnergy.setImage(new Image("src/sample/resources/images/energy8.png"));
                break;
            case 9:
                imageViewEnergy.setImage(new Image("src/sample/resources/images/energy9.png"));
                break;
            case 10:
                imageViewEnergy.setImage(new Image("src/sample/resources/images/energy10.png"));
                break;
            case 11:
                imageViewEnergy.setImage(new Image("src/sample/resources/images/energy11.png"));
                break;
            case 12:
                imageViewEnergy.setImage(new Image("src/sample/resources/images/energy12.png"));
                break;
            case 13:
                imageViewEnergy.setImage(new Image("src/sample/resources/images/energy13.png"));
                break;
            case 14:
                imageViewEnergy.setImage(new Image("src/sample/resources/images/energy14.png"));
                break;
            case 15:
                imageViewEnergy.setImage(new Image("src/sample/resources/images/energy15.png"));
                break;
            case 16:
                imageViewEnergy.setImage(new Image("src/sample/resources/images/energy16.png"));
                break;
            case 17:
                imageViewEnergy.setImage(new Image("src/sample/resources/images/energy17.png"));
                break;
            default:
                System.out.println("Error: currentEnergy doesn't match asset ID");
        }
    }

    /*----------------------------------------Variables------------------------------------*/
    int ragDollAmount = 0, currentEnergy = 17, materialCount = 10;
    Product ragDoll = new Product("Rag Doll", 1, 1, 2, 10.0);

}

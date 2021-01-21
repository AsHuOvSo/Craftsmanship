package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.event.ActionEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class CharacterCreationController {

    @FXML
    private ImageView imageViewCharacter;

    @FXML
    private TextField textFieldEnterName;

    @FXML
    private Button buttonCCBack;

    @FXML
    private Button buttonCCExit;

    @FXML
    private Button buttonCCPlay;

    @FXML
    private Button buttonBottomDown;

    @FXML
    private Button buttonBottomUp;

    @FXML
    private Button buttonShoesDown;

    @FXML
    private Button buttonShoesUp;

    @FXML
    private Button buttonCraftDown;

    @FXML
    private Button buttonCraftUp;

    @FXML
    private Button buttonStudioDown;

    @FXML
    private Button buttonStudioUp;

    @FXML
    private Button buttonTopUp;

    @FXML
    private Button buttonSkinColorDown;

    @FXML
    private Button buttonSkinColorUp;

    @FXML
    private Button buttonHairColorDown;

    @FXML
    private Button buttonHairColorUp;

    @FXML
    private Button buttonHairStyleDown;

    @FXML
    private Button buttonHairStyleUp;

    @FXML
    private Button buttonEyeColorDown;

    @FXML
    private Button buttonEyeColorUp;

    @FXML
    private Button buttonTopDown;
    /*-------------------------------------------------Button Event----------------------------------------------------*/
    @FXML
    void DecreaseBottom(ActionEvent event) {
        try {
            DecreaseBottomNumber();
        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }

    @FXML
    void DecreaseCraft(ActionEvent event) {
        try {

        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    void DecreaseEyeColor(ActionEvent event) {
        try {
            DecreaseEyeColorNumber();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    void DecreaseHairColor(ActionEvent event) {
        try {
            DecreaseHairColorNumber();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    void DecreaseHairStyle(ActionEvent event) {
        try {
            DecreaseHairStyleNumber();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    void DecreaseShoes(ActionEvent event) {
        try {
            DecreaseShoesNumber();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    void DecreaseSkinColor(ActionEvent event) {
        try {
            DecreaseSkinColorNumber();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    void DecreaseStudio(ActionEvent event) {
        try {

        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    void DecreaseTop(ActionEvent event) {
        try {
            DecreaseTopNumber();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    void IncreaseBottom(ActionEvent event) {
        try {
            IncreaseBottomNumber();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    void IncreaseCraft(ActionEvent event) {
        try {

        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    void IncreaseEyeColor(ActionEvent event) {
        try {
            IncreaseEyeColorNumber();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    void IncreaseHairColor(ActionEvent event) {
        try {
            IncreaseHairColorNumber();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    void IncreaseHairStyle(ActionEvent event) {
        try {
            IncreaseHairStyleNumber();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    void IncreaseShoes(ActionEvent event) {
        try {
            IncreaseShoesNumber();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    void IncreaseSkinColor(ActionEvent event) {
        try {
            IncreaseSkinColorNumber();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    void IncreaseStudio(ActionEvent event) {
        try {

        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    void IncreaseTop(ActionEvent event) {
        try {
            IncreaseTopNumber();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    void SaveName(ActionEvent event) {

    }

    @FXML
    void exitGame(ActionEvent event) {
        exitProgram(0);
    }

    @FXML
    void returnToMenu(ActionEvent event) {
        goToMainMenu();
    }

    @FXML
    void startGame(ActionEvent event) {

    }
    /*---------------------------------------------------Functions-----------------------------------------------------*/

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

    public void goToMainMenu() {
        try {
            setupMainMenu();
        }
        catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }
    }

    public void setupMainMenu() throws IOException {
        Parent newRoot = FXMLLoader.load(getClass().getResource("sample.fxml"));
        Stage primaryStage = (Stage) buttonCCBack.getScene().getWindow();
        primaryStage.getScene().setRoot(newRoot);
    }

    public void ChooseCharacter() {

    }
    public void IncreaseBottomNumber() {
        if(bottomNumber != 01) {
            bottomNumber++;
        }
        else {
            bottomNumber = 01;
        }
    }

    public void DecreaseBottomNumber() {
        if(bottomNumber !=02) {
            bottomNumber--;
        }
        else {
            bottomNumber = 02;
        }
    }

    public void IncreaseTopNumber() {
        if(topNumber != 01) {
            topNumber++;
        }
        else {
            topNumber = 01;
        }
    }

    public void DecreaseTopNumber() {
        if(topNumber != 02) {
            topNumber--;
        }
        else {
            topNumber = 02;
        }
    }

    public void IncreaseSkinColorNumber() {
        if(skinColorNumber != 01) {
            skinColorNumber++;
        }
        else {
            skinColorNumber = 01;
        }
    }

    public void DecreaseSkinColorNumber() {
        if(skinColorNumber != 02) {
            skinColorNumber--;
        }
        else {
            skinColorNumber = 02;
        }
    }

    public void IncreaseHairColorNumber() {
        if(hairColorNumber != 01){
            hairColorNumber++;
        }
        else {
            hairColorNumber = 01;
        }
    }

    public void DecreaseHairColorNumber() {
        if(hairColorNumber != 02) {
            hairColorNumber--;
        }
        else {
            hairColorNumber = 02;
        }
    }

    public void IncreaseHairStyleNumber() {
        if(hairStyleNumber != 01) {
            hairStyleNumber++;
        }
        else {
            hairStyleNumber = 01;
        }
    }

    public void DecreaseHairStyleNumber() {
        if(hairStyleNumber != 02) {
            hairStyleNumber--;
        }
        else {
            hairStyleNumber = 02;
        }
    }

    public void IncreaseEyeColorNumber() {
        if(eyeColorNumber != 01) {
            eyeColorNumber++;
        }
        else {
            eyeColorNumber = 01;
        }
    }

    public void DecreaseEyeColorNumber() {
        if(eyeColorNumber != 03) {
            eyeColorNumber--;
        }
        else {
            eyeColorNumber = 03;
        }
    }

    public void IncreaseShoesNumber() {
        if(shoesNumber != 01) {
            shoesNumber++;
        }
        else {
            shoesNumber = 01;
        }
    }

    public void DecreaseShoesNumber() {
        if(shoesNumber != 02) {
            shoesNumber--;
        }
        else {
            shoesNumber = 02;
        }
    }

    public void IncreaseCraftNumber() {
        if(craftNumber != 01) {
            craftNumber++;
        }
        else {
            craftNumber = 01;
        }
    }

    public void DecreaseCraftNumber() {
        if(craftNumber != 01) {
            craftNumber--;
        }
        else {
            craftNumber = 01;
        }
    }

    public void IncreaseStudioNumber() {
        if(studioNumber != 01) {
            studioNumber++;
        }
        else {
            studioNumber = 01;
        }
    }

    public void DecreaseStudioNumber() {
        if(studioNumber != 01) {
            studioNumber--;
        }
        else {
            studioNumber = 01;
        }
    }


    public void UpdateSkinColor() {
        
    }


    /*--------------------------------------------------Variables-------------------------------------------------*/

    int skinColorNumber = 01, hairColorNumber = 01, hairStyleNumber = 01, eyeColorNumber = 01, topNumber = 01,
    bottomNumber = 01, shoesNumber = 01, craftNumber = 01, studioNumber = 01;


}
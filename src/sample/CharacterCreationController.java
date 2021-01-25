package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.event.ActionEvent;
import javafx.stage.Stage;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
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

    public CharacterCreationController() throws IOException {
    }

    /*-------------------------------------------------Button Event----------------------------------------------------*/
    @FXML
    void DecreaseBottom(ActionEvent event) {
        try {
            DecreaseBottomNumber();
            UpdateSkinColor();
            DisplayMatchingPicture();
        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }

    @FXML
    void DecreaseCraft(ActionEvent event) {
        try {
            DecreaseCraftNumber();
            UpdateSkinColor();
            DisplayMatchingPicture();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    void DecreaseEyeColor(ActionEvent event) {
        try {
            DecreaseEyeColorNumber();
            UpdateSkinColor();
            DisplayMatchingPicture();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    void DecreaseHairColor(ActionEvent event) {
        try {
            DecreaseHairColorNumber();
            UpdateSkinColor();
            DisplayMatchingPicture();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    void DecreaseHairStyle(ActionEvent event) {
        try {
            DecreaseHairStyleNumber();
            UpdateSkinColor();
            DisplayMatchingPicture();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    void DecreaseShoes(ActionEvent event) {
        try {
            DecreaseShoesNumber();
            UpdateSkinColor();
            DisplayMatchingPicture();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    void DecreaseSkinColor(ActionEvent event) {
        try {
            DecreaseSkinColorNumber();
            UpdateSkinColor();
            DisplayMatchingPicture();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    void DecreaseStudio(ActionEvent event) {
        try {
            DecreaseStudioNumber();
            UpdateSkinColor();
            DisplayMatchingPicture();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    void DecreaseTop(ActionEvent event) {
        try {
            DecreaseTopNumber();
            UpdateSkinColor();
            DisplayMatchingPicture();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    void IncreaseBottom(ActionEvent event) {
        try {
            IncreaseBottomNumber();
            UpdateSkinColor();
            DisplayMatchingPicture();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    void IncreaseCraft(ActionEvent event) {
        try {
            IncreaseCraftNumber();
            UpdateSkinColor();
            DisplayMatchingPicture();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    void IncreaseEyeColor(ActionEvent event) {
        try {
            IncreaseEyeColorNumber();
            UpdateSkinColor();
            DisplayMatchingPicture();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    void IncreaseHairColor(ActionEvent event) {
        try {
            IncreaseHairColorNumber();
            UpdateSkinColor();
            DisplayMatchingPicture();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    void IncreaseHairStyle(ActionEvent event) {
        try {
            IncreaseHairStyleNumber();
            UpdateSkinColor();
            DisplayMatchingPicture();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    void IncreaseShoes(ActionEvent event) {
        try {
            IncreaseShoesNumber();
            UpdateSkinColor();
            DisplayMatchingPicture();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    void IncreaseSkinColor(ActionEvent event) {
        try {
            IncreaseSkinColorNumber();
            UpdateSkinColor();
            DisplayMatchingPicture();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    void IncreaseStudio(ActionEvent event) {
        try {
            IncreaseStudioNumber();
            UpdateSkinColor();
            DisplayMatchingPicture();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    void IncreaseTop(ActionEvent event) {
        try {
            IncreaseTopNumber();
            UpdateSkinColor();
            DisplayMatchingPicture();
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
        StartGame();
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

    public void StartGame() {
        try {
            String playerName = textFieldEnterName.getText();
            Character player = new Character(characterNumber, playerName);
            setupGameStage();
        }
        catch (IOException e) {
            e.printStackTrace();
        }


    }

    public void setupGameStage() throws IOException {
        Parent newRoot = FXMLLoader.load(getClass().getResource("apartment.fxml"));
        Stage primaryStage = (Stage) buttonCCPlay.getScene().getWindow();
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
        characterNumber = "";
        switch(skinColorNumber) {
            case 01:
                characterNumber = "01";
                UpdateHairColor();
                break;
            default:
                System.out.println("Error: Skin color number doesn't match");
        }
    }

    public void UpdateHairColor() {
        switch(hairColorNumber) {
            case 01:
                characterNumber += "01";
                UpdateHairStyle();
                break;
            case 02:
                characterNumber += "02";
                UpdateHairStyle();
                break;
            default:
                System.out.println("Error: Hair color number doesn't match");
        }
    }

    public void UpdateHairStyle() {
        switch(hairStyleNumber) {
            case 01:
                characterNumber += "01";
                UpdateEyeColor();
                break;
            default:
                System.out.println("Error: Hair style number doesn't match");
        }
    }

    public void UpdateEyeColor() {
        switch(eyeColorNumber) {
            case 01:
                characterNumber += "01";
                UpdateTopNumber();
                break;
            case 02:
                characterNumber += "02";
                UpdateTopNumber();
                break;
            case 03:
                characterNumber += "03";
                UpdateTopNumber();
                break;
            default:
                System.out.println("Error: Eye color number doesn't match");
        }
    }

    public void UpdateTopNumber() {
        switch(topNumber) {
            case 01:
                characterNumber += "01";
                UpdateBottomNumber();
                break;
            case 02:
                characterNumber += "02";
                UpdateBottomNumber();
                break;
            default:
                System.out.println("Error: Top number doesn't match");
        }
    }

    public void UpdateBottomNumber() {
        switch(bottomNumber) {
            case 01:
                characterNumber += "01";
                UpdateShoesNumber();
                break;
            case 02:
                characterNumber += "02";
                UpdateShoesNumber();
                break;
            default:
                System.out.println("Error: Bottom number doesn't match");
        }
    }

    public void UpdateShoesNumber() {
        switch(shoesNumber) {
            case 01:
                characterNumber += "01";
                UpdateCraftNumber();
                break;
            case 02:
                characterNumber += "02";
                UpdateCraftNumber();
                break;
            default:
                System.out.println("Error: Shoes number doesn't match");
        }
    }

    public void UpdateCraftNumber() {
        switch(craftNumber) {
            case 01:
                characterNumber += "01";
                UpdateStudioNumber();
                break;
            default:
                System.out.println("Error: Craft number doesn't match");
        }
    }

    public void UpdateStudioNumber() {
        switch(studioNumber) {
            case 01:
                characterNumber += "01";
                break;
            default:
                System.out.println("Error: Studio number doesn't match");
        }
    }

    /*--------------------------------------------Pictures to Display---------------------------------------------*/

    public void DisplayMatchingPicture() {
        switch(characterNumber) {
            case "010101010101010101":
                imageViewCharacter.setImage(new Image(getClass().getResource("src/sample/resources/images/F01010101010101.png").toExternalForm()));
                break;
            case "010101010101020101":
                imageViewCharacter.setImage(new Image(getClass().getResource("@src/sample/resources/images/F01010101010102.png").toExternalForm()));
                break;
            case "010101010102010101":
                imageViewCharacter.setImage(new Image("@src/sample/resources/images/F01010101010201.png"));
                break;
            case "010101010102020101":
                imageViewCharacter.setImage(new Image("src/sample/resources/images/F01010101010202.png"));
                break;
            case "010101010201010101":
                imageViewCharacter.setImage(new Image("src/sample/resources/images/F01010101020101.png"));
                break;
            case "010101010201020101":
                imageViewCharacter.setImage(new Image("src/sample/resources/images/F01010101020102.png"));
                break;
            case "010101010202010101":
                imageViewCharacter.setImage(new Image("src/sample/resources/images/F01010101020201.png"));
                break;
            case "010101010202020101":
                imageViewCharacter.setImage(new Image("src/sample/resources/images/F01010101020202.png"));
                break;
            case "010101020101010101":
                imageViewCharacter.setImage(new Image("src/sample/resources/images/F01010102010101.png"));
                break;
            case "010101020101020101":
                imageViewCharacter.setImage(new Image("src/sample/resources/images/F01010102010102.png"));
                break;
            case "010101020102010101":
                imageViewCharacter.setImage(new Image("src/sample/resources/images/F01010102010201.png"));
                break;
            case "010101020102020101":
                imageViewCharacter.setImage(new Image("src/sample/resources/images/F01010102010202.png"));
                break;
            case "010101020201010101":
                imageViewCharacter.setImage(new Image("src/sample/resources/images/F01010102020101.png"));
                break;
            case "010101020201020101":
                imageViewCharacter.setImage(new Image("src/sample/resources/images/F01010102020102.png"));
                break;
            case "010101020202010101":
                imageViewCharacter.setImage(new Image("src/sample/resources/images/F01010102020201.png"));
                break;
            case "010101020202020101":
                imageViewCharacter.setImage(new Image("src/sample/resources/images/F01010102020202.png"));
                break;
            case "010101030101010101":
                imageViewCharacter.setImage(new Image("src/sample/resources/images/F01010103010101.png"));
                break;
            case "010101030101020101":
                imageViewCharacter.setImage(new Image("src/sample/resources/images/F01010103010102.png"));
                break;
            case "010101030102010101":
                imageViewCharacter.setImage(new Image("src/sample/resources/images/F01010103010201.png"));
                break;
            case "010101030102020101":
                imageViewCharacter.setImage(new Image("src/sample/resources/images/F01010103010202.png"));
                break;
            case "010101030201010101":
                imageViewCharacter.setImage(new Image("src/sample/resources/images/F01010103020101.png"));
                break;
            case "010101030201020101":
                imageViewCharacter.setImage(new Image("src/sample/resources/images/F01010103020102.png"));
                break;
            case "010101030202010101":
                imageViewCharacter.setImage(new Image("src/sample/resources/images/F01010103020201.png"));
                break;
            case "010101030202020101":
                imageViewCharacter.setImage(new Image("src/sample/resources/images/F01010103020202.png"));
                break;
            case "010201010101010101":
                imageViewCharacter.setImage(new Image("src/sample/resources/images/F01020101010101.png"));
                break;
            case "010201010101020101":
                imageViewCharacter.setImage(new Image("src/sample/resources/images/F01020101010102.png"));
                break;
            case "010201010102010101":
                imageViewCharacter.setImage(new Image("src/sample/resources/images/F01020101010201.png"));
                break;
            case "010201010102020101":
                imageViewCharacter.setImage(new Image("src/sample/resources/images/F01020101010202.png"));
                break;
            case "010201010201010101":
                imageViewCharacter.setImage(new Image("src/sample/resources/images/F01020101020101.png"));
                break;
            case "010201010201020101":
                imageViewCharacter.setImage(new Image("src/sample/resources/images/F01020101020102.png"));
                break;
            case "010201010202010101":
                imageViewCharacter.setImage(new Image("src/sample/resources/images/F01020101020201.png"));
                break;
            case "010201010202020101":
                imageViewCharacter.setImage(new Image("src/sample/resources/images/F01020101020202.png"));
                break;
            case "010201020101010101":
                imageViewCharacter.setImage(new Image("src/sample/resources/images/F01020102010101.png"));
                break;
            case "010201020101020101":
                imageViewCharacter.setImage(new Image("src/sample/resources/images/F01020102010102.png"));
                break;
            case "010201020102010101":
                imageViewCharacter.setImage(new Image("src/sample/resources/images/F01020102010201.png"));
                break;
            case "010201020102020101":
                imageViewCharacter.setImage(new Image("src/sample/resources/images/F01020102010202.png"));
                break;
            case "010201020201010101":
                imageViewCharacter.setImage(new Image("src/sample/resources/images/F01020102020101.png"));
                break;
            case "010201020201020101":
                imageViewCharacter.setImage(new Image("src/sample/resources/images/F01020102020102.png"));
                break;
            case "010201020202010101":
                imageViewCharacter.setImage(new Image("src/sample/resources/images/F01020102020201.png"));
                break;
            case "010201020202020101":
                imageViewCharacter.setImage(new Image("src/sample/resources/images/F01020102020202.png"));
                break;
            case "010201030101010101":
                imageViewCharacter.setImage(new Image("src/sample/resources/images/F01020103010101.png"));
                break;
            case "010201030101020101":
                imageViewCharacter.setImage(new Image("src/sample/resources/images/F01020103010102.png"));
                break;
            case "010201030102010101":
                imageViewCharacter.setImage(new Image("src/sample/resources/images/F01020103010201.png"));
                break;
            case "010201030102020101":
                imageViewCharacter.setImage(new Image("src/sample/resources/images/F01020103010202.png"));
                break;
            case "010201030201010101":
                imageViewCharacter.setImage(new Image("src/sample/resources/images/F01020103020101.png"));
                break;
            case "010201030201020101":
                imageViewCharacter.setImage(new Image("src/sample/resources/images/F01020103020102.png"));
                break;
            case "010201030202010101":
                imageViewCharacter.setImage(new Image("src/sample/resources/images/F01020103020201.png"));
                break;
            case "010201030202020101":
                imageViewCharacter.setImage(new Image("src/sample/resources/images/F01020103020202.png"));
                break;
            default:
                System.out.println("Error: characterNumber doesn't match image ID");
        }
    }

    /*--------------------------------------------------Variables-------------------------------------------------*/

    int skinColorNumber = 01, hairColorNumber = 01, hairStyleNumber = 01, eyeColorNumber = 01, topNumber = 01,
    bottomNumber = 01, shoesNumber = 01, craftNumber = 01, studioNumber = 01;
    String characterNumber;





}
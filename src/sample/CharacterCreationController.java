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
import java.io.File;
import java.io.IOException;

public class CharacterCreationController {


    /*--------------------------------------------------Variables-------------------------------------------------*/

    int skinColorNumber = 1, hairColorNumber = 1, hairStyleNumber = 1, eyeColorNumber = 1, topNumber = 1,
            bottomNumber = 1, shoesNumber = 1, craftNumber = 1, studioNumber = 1;
    String characterNumber;

    /*-----------------------------------------------------FXML---------------------------------------------------*/

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
        if(!(bottomNumber == 1)) {
            bottomNumber = bottomNumber + 1;
            System.out.println(bottomNumber);
        }
        else {
            bottomNumber = 1;
        }
    }

    public void DecreaseBottomNumber() {
        if(bottomNumber !=2) {
            bottomNumber--;
        }
        else {
            bottomNumber = 2;
        }
    }

    public void IncreaseTopNumber() {
        if(topNumber != 1) {
            topNumber++;
        }
        else {
            topNumber = 1;
        }
    }

    public void DecreaseTopNumber() {
        if(topNumber != 2) {
            topNumber--;
        }
        else {
            topNumber = 2;
        }
    }

    public void IncreaseSkinColorNumber() {
        if(skinColorNumber != 1) {
            skinColorNumber++;
        }
        else {
            skinColorNumber = 1;
        }
    }

    public void DecreaseSkinColorNumber() {
        if(skinColorNumber != 2) {
            skinColorNumber--;
        }
        else {
            skinColorNumber = 2;
        }
    }

    public void IncreaseHairColorNumber() {
        if(hairColorNumber != 1){
            hairColorNumber++;
        }
        else {
            hairColorNumber = 1;
        }
    }

    public void DecreaseHairColorNumber() {
        if(hairColorNumber != 2) {
            hairColorNumber--;
        }
        else {
            hairColorNumber = 2;
        }
    }

    public void IncreaseHairStyleNumber() {
        if(hairStyleNumber != 1) {
            hairStyleNumber++;
        }
        else {
            hairStyleNumber = 1;
        }
    }

    public void DecreaseHairStyleNumber() {
        if(hairStyleNumber != 2) {
            hairStyleNumber--;
        }
        else {
            hairStyleNumber = 2;
        }
    }

    public void IncreaseEyeColorNumber() {
        if(eyeColorNumber != 1) {
            eyeColorNumber++;
        }
        else {
            eyeColorNumber = 1;
        }
    }

    public void DecreaseEyeColorNumber() {
        if(eyeColorNumber != 3) {
            eyeColorNumber--;
        }
        else {
            eyeColorNumber = 3;
        }
    }

    public void IncreaseShoesNumber() {
        if(shoesNumber != 1) {
            shoesNumber++;
        }
        else {
            shoesNumber = 1;
        }
    }

    public void DecreaseShoesNumber() {
        if(shoesNumber != 2) {
            shoesNumber--;
        }
        else {
            shoesNumber = 2;
        }
    }

    public void IncreaseCraftNumber() {
        if(craftNumber != 1) {
            craftNumber++;
        }
        else {
            craftNumber = 1;
        }
    }

    public void DecreaseCraftNumber() {
        if(craftNumber != 1) {
            craftNumber--;
        }
        else {
            craftNumber = 1;
        }
    }

    public void IncreaseStudioNumber() {
        if(studioNumber != 1) {
            studioNumber++;
        }
        else {
            studioNumber = 1;
        }
    }

    public void DecreaseStudioNumber() {
        if(studioNumber != 1) {
            studioNumber--;
        }
        else {
            studioNumber = 1;
        }
    }


    public void UpdateSkinColor() {
        characterNumber = "";
        switch(skinColorNumber) {
            case 1:
                characterNumber = "01";
                UpdateHairColor();
                break;
            default:
                System.out.println("Error: Skin color number doesn't match");
        }
    }

    public void UpdateHairColor() {
        switch(hairColorNumber) {
            case 1:
                characterNumber += "01";
                UpdateHairStyle();
                break;
            case 2:
                characterNumber += "02";
                UpdateHairStyle();
                break;
            default:
                System.out.println("Error: Hair color number doesn't match");
        }
    }

    public void UpdateHairStyle() {
        switch(hairStyleNumber) {
            case 1:
                characterNumber += "01";
                UpdateEyeColor();
                break;
            default:
                System.out.println("Error: Hair style number doesn't match");
        }
    }

    public void UpdateEyeColor() {
        switch(eyeColorNumber) {
            case 1:
                characterNumber += "01";
                UpdateTopNumber();
                break;
            case 2:
                characterNumber += "02";
                UpdateTopNumber();
                break;
            case 3:
                characterNumber += "03";
                UpdateTopNumber();
                break;
            default:
                System.out.println("Error: Eye color number doesn't match");
        }
    }

    public void UpdateTopNumber() {
        switch(topNumber) {
            case 1:
                characterNumber += "01";
                UpdateBottomNumber();
                break;
            case 2:
                characterNumber += "02";
                UpdateBottomNumber();
                break;
            default:
                System.out.println("Error: Top number doesn't match");
        }
    }

    public void UpdateBottomNumber() {
        switch(bottomNumber) {
            case 1:
                characterNumber += "01";
                UpdateShoesNumber();
                break;
            case 2:
                characterNumber += "02";
                UpdateShoesNumber();
                break;
            default:
                System.out.println("Error: Bottom number doesn't match");
        }
    }

    public void UpdateShoesNumber() {
        switch(shoesNumber) {
            case 1:
                characterNumber += "01";
                UpdateCraftNumber();
                break;
            case 2:
                characterNumber += "02";
                UpdateCraftNumber();
                break;
            default:
                System.out.println("Error: Shoes number doesn't match");
        }
    }

    public void UpdateCraftNumber() {
        switch(craftNumber) {
            case 1:
                characterNumber += "01";
                UpdateStudioNumber();
                break;
            default:
                System.out.println("Error: Craft number doesn't match");
        }
    }

    public void UpdateStudioNumber() {
        switch(studioNumber) {
            case 1:
                characterNumber += "01";
                break;
            default:
                System.out.println("Error: Studio number doesn't match");
        }
    }

    /*--------------------------------------------Pictures to Display---------------------------------------------*/

    public void DisplayMatchingPicture() {
        File file;
        Image image;
        switch(characterNumber) {
            case "010101010101010101":
                file = new File("src/sample/resources/images/F01010101010101.png");
                image = new Image(file.toURI().toString());
                imageViewCharacter.setImage(image);
                break;
            case "010101010101020101":
                file = new File("src/sample/resources/images/F01010101010102.png");
                image = new Image(file.toURI().toString());
                imageViewCharacter.setImage(image);
                break;
            case "010101010102010101":
                file = new File("src/sample/resources/images/F01010101010201.png");
                image = new Image(file.toURI().toString());
                imageViewCharacter.setImage(image);
                break;
            case "010101010102020101":
                file = new File("src/sample/resources/images/F01010101010202.png");
                image = new Image(file.toURI().toString());
                imageViewCharacter.setImage(image);
                break;
            case "010101010201010101":
                file = new File("src/sample/resources/images/F01010101020101.png");
                image = new Image(file.toURI().toString());
                imageViewCharacter.setImage(image);
                break;
            case "010101010201020101":
                file = new File("src/sample/resources/images/F01010101020102.png");
                image = new Image(file.toURI().toString());
                imageViewCharacter.setImage(image);
                break;
            case "010101010202010101":
                file = new File("src/sample/resources/images/F01010101020201.png");
                image = new Image(file.toURI().toString());
                imageViewCharacter.setImage(image);
                break;
            case "010101010202020101":
                file = new File("src/sample/resources/images/F01010101020202.png");
                image = new Image(file.toURI().toString());
                imageViewCharacter.setImage(image);
                break;
            case "010101020101010101":
                file = new File("src/sample/resources/images/F01010102010101.png");
                image = new Image(file.toURI().toString());
                imageViewCharacter.setImage(image);
                break;
            case "010101020101020101":
                file = new File("src/sample/resources/images/F01010102010102.png");
                image = new Image(file.toURI().toString());
                imageViewCharacter.setImage(image);
                break;
            case "010101020102010101":
                file = new File("src/sample/resources/images/F01010102010201.png");
                image = new Image(file.toURI().toString());
                imageViewCharacter.setImage(image);
                break;
            case "010101020102020101":
                file = new File("src/sample/resources/images/F01010102010202.png");
                image = new Image(file.toURI().toString());
                imageViewCharacter.setImage(image);
                break;
            case "010101020201010101":
                file = new File("src/sample/resources/images/F01010102020101.png");
                image = new Image(file.toURI().toString());
                imageViewCharacter.setImage(image);
                break;
            case "010101020201020101":
                file = new File("src/sample/resources/images/F01010102020102.png");
                image = new Image(file.toURI().toString());
                imageViewCharacter.setImage(image);
                break;
            case "010101020202010101":
                file = new File("src/sample/resources/images/F01010102020201.png");
                image = new Image(file.toURI().toString());
                imageViewCharacter.setImage(image);
                break;
            case "010101020202020101":
                file = new File("src/sample/resources/images/F01010102020202.png");
                image = new Image(file.toURI().toString());
                imageViewCharacter.setImage(image);
                break;
            case "010101030101010101":
                file = new File("src/sample/resources/images/F01010103010101.png");
                image = new Image(file.toURI().toString());
                imageViewCharacter.setImage(image);
                break;
            case "010101030101020101":
                file = new File("src/sample/resources/images/F01010103010102.png");
                image = new Image(file.toURI().toString());
                imageViewCharacter.setImage(image);
                break;
            case "010101030102010101":
                file = new File("src/sample/resources/images/F01010103010201.png");
                image = new Image(file.toURI().toString());
                imageViewCharacter.setImage(image);
                break;
            case "010101030102020101":
                file = new File("src/sample/resources/images/F01010103010202.png");
                image = new Image(file.toURI().toString());
                imageViewCharacter.setImage(image);
                break;
            case "010101030201010101":
                file = new File("src/sample/resources/images/F01010103020101.png");
                image = new Image(file.toURI().toString());
                imageViewCharacter.setImage(image);
                break;
            case "010101030201020101":
                file = new File("src/sample/resources/images/F01010103020102.png");
                image = new Image(file.toURI().toString());
                imageViewCharacter.setImage(image);
                break;
            case "010101030202010101":
                file = new File("src/sample/resources/images/F01010103020201.png");
                image = new Image(file.toURI().toString());
                imageViewCharacter.setImage(image);
                break;
            case "010101030202020101":
                file = new File("src/sample/resources/images/F01010103020202.png");
                image = new Image(file.toURI().toString());
                imageViewCharacter.setImage(image);
                break;
            case "010201010101010101":
                file = new File("src/sample/resources/images/F01020101010101.png");
                image = new Image(file.toURI().toString());
                imageViewCharacter.setImage(image);
                break;
            case "010201010101020101":
                file = new File("src/sample/resources/images/F01020101010102.png");
                image = new Image(file.toURI().toString());
                imageViewCharacter.setImage(image);
                break;
            case "010201010102010101":
                file = new File("src/sample/resources/images/F01020101010201.png");
                image = new Image(file.toURI().toString());
                imageViewCharacter.setImage(image);
                break;
            case "010201010102020101":
                file = new File("src/sample/resources/images/F01020101010202.png");
                image = new Image(file.toURI().toString());
                imageViewCharacter.setImage(image);
                break;
            case "010201010201010101":
                file = new File("src/sample/resources/images/F01020101020101.png");
                image = new Image(file.toURI().toString());
                imageViewCharacter.setImage(image);
                break;
            case "010201010201020101":
                file = new File("src/sample/resources/images/F01020101020102.png");
                image = new Image(file.toURI().toString());
                imageViewCharacter.setImage(image);
                break;
            case "010201010202010101":
                file = new File("src/sample/resources/images/F01020101020201.png");
                image = new Image(file.toURI().toString());
                imageViewCharacter.setImage(image);
                break;
            case "010201010202020101":
                file = new File("src/sample/resources/images/F01020101020202.png");
                image = new Image(file.toURI().toString());
                imageViewCharacter.setImage(image);
                break;
            case "010201020101010101":
                file = new File("src/sample/resources/images/F01020102010101.png");
                image = new Image(file.toURI().toString());
                imageViewCharacter.setImage(image);
                break;
            case "010201020101020101":
                file = new File("src/sample/resources/images/F01020102010102.png");
                image = new Image(file.toURI().toString());
                imageViewCharacter.setImage(image);
                break;
            case "010201020102010101":
                file = new File("src/sample/resources/images/F01020102010201.png");
                image = new Image(file.toURI().toString());
                imageViewCharacter.setImage(image);
                break;
            case "010201020102020101":
                file = new File("src/sample/resources/images/F01020102010202.png");
                image = new Image(file.toURI().toString());
                imageViewCharacter.setImage(image);
                break;
            case "010201020201010101":
                file = new File("src/sample/resources/images/F01020102020101.png");
                image = new Image(file.toURI().toString());
                imageViewCharacter.setImage(image);
                break;
            case "010201020201020101":
                file = new File("src/sample/resources/images/F01020102020102.png");
                image = new Image(file.toURI().toString());
                imageViewCharacter.setImage(image);
                break;
            case "010201020202010101":
                file = new File("src/sample/resources/images/F01020102020201.png");
                image = new Image(file.toURI().toString());
                imageViewCharacter.setImage(image);
                break;
            case "010201020202020101":
                file = new File("src/sample/resources/images/F01020102020202.png");
                image = new Image(file.toURI().toString());
                imageViewCharacter.setImage(image);
                break;
            case "010201030101010101":
                file = new File("src/sample/resources/images/F01020103010101.png");
                image = new Image(file.toURI().toString());
                imageViewCharacter.setImage(image);
                break;
            case "010201030101020101":
                file = new File("src/sample/resources/images/F01020103010102.png");
                image = new Image(file.toURI().toString());
                imageViewCharacter.setImage(image);
                break;
            case "010201030102010101":
                file = new File("src/sample/resources/images/F01020103010201.png");
                image = new Image(file.toURI().toString());
                imageViewCharacter.setImage(image);
                break;
            case "010201030102020101":
                file = new File("src/sample/resources/images/F01020103010202.png");
                image = new Image(file.toURI().toString());
                imageViewCharacter.setImage(image);
                break;
            case "010201030201010101":
                file = new File("src/sample/resources/images/F01020103020101.png");
                image = new Image(file.toURI().toString());
                imageViewCharacter.setImage(image);
                break;
            case "010201030201020101":
                file = new File("src/sample/resources/images/F01020103020102.png");
                image = new Image(file.toURI().toString());
                imageViewCharacter.setImage(image);
                break;
            case "010201030202010101":
                file = new File("src/sample/resources/images/F01020103020201.png");
                image = new Image(file.toURI().toString());
                imageViewCharacter.setImage(image);
                break;
            case "010201030202020101":
                file = new File("src/sample/resources/images/F01020103020202.png");
                image = new Image(file.toURI().toString());
                imageViewCharacter.setImage(image);
                break;
            default:
                System.out.println("Error: characterNumber doesn't match image ID");
        }
    }






}
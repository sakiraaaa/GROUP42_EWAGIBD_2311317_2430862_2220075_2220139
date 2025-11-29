package com.example.group42_ewagibd_2311317_2430862_2220075_2220139.Sakira;

import com.example.group42_ewagibd_2311317_2430862_2220075_2220139.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.time.LocalDate;

public class IntroducingNewWelfareProgramsController
{
    @javafx.fxml.FXML
    private Label IntroducingWelfareProgramLabel;
    @javafx.fxml.FXML
    private TableColumn<Programs,String> ProgramTitleTC;
    @javafx.fxml.FXML
    private TableColumn<Programs,String> ProgramDescriptionTC;
    @javafx.fxml.FXML
    private TableColumn<Programs,String> TargetBeneficiariesTC;
    @javafx.fxml.FXML
    private TextField ProgramTitleTF;
    @javafx.fxml.FXML
    private TableView<Programs> WelfareProgramsTV;
    @javafx.fxml.FXML
    private TableColumn<Programs, LocalDate> DateTC;
    @javafx.fxml.FXML
    private DatePicker DateDP;
    @javafx.fxml.FXML
    private TextField ProgramDescriptionTF;
    @javafx.fxml.FXML
    private ComboBox<String> ProgramCatagoryCB;
    @javafx.fxml.FXML
    private TableColumn<Programs,String> ProgramCatagoryTC;

    @javafx.fxml.FXML
    public void initialize() {
        ProgramCatagoryCB.getItems().addAll("health", "education",   "financial support", "skill development");
        ProgramTitleTC.setCellValueFactory(new PropertyValueFactory<Programs,String>("ProgramTitle"));
        ProgramDescriptionTC.setCellValueFactory(new PropertyValueFactory<Programs,String>("ProgramDescription"));
        TargetBeneficiariesTC.setCellValueFactory(new PropertyValueFactory<Programs,String>("TargetBeneficiaries"));
        ProgramCatagoryTC.setCellValueFactory(new PropertyValueFactory<Programs,String>("ProgramCatagory"));
        DateTC.setCellValueFactory(new PropertyValueFactory<Programs,LocalDate>("Date"));
    }

    @javafx.fxml.FXML
    public void NewWelfareProgramOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void AddProgramOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void BackToDashBoardOA(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Sakira/PresidentDashboard.fxml"));
            Scene nextScene = new Scene(fxmlLoader.load());
            Stage nextStage = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
            nextStage.setTitle("PresidentDashboard");
            nextStage.setScene(nextScene);
            nextStage.show();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


}
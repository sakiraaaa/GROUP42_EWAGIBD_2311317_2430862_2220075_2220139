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
import java.util.ArrayList;

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
    private TextField TargetBeneficiariesTF;
    ArrayList<Programs> programList = new ArrayList<>();

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
        if (ProgramTitleTF.getText().trim().isEmpty()){
            IntroducingWelfareProgramLabel.setText("Please Enter Program Title");
            return;
        }
        if (ProgramDescriptionTF.getText().trim().isEmpty()){
            IntroducingWelfareProgramLabel.setText("Please Enter Program Description");
            return;
        }
        if (TargetBeneficiariesTF.getText().trim().isEmpty()){
            IntroducingWelfareProgramLabel.setText("Please enter Target Beneficiaries");
            return;
        }
        if (ProgramCatagoryCB.getValue()==null){
            IntroducingWelfareProgramLabel.setText("Please select Program Catagory");
            return;
        }
        if (DateDP.getValue()== null){
            IntroducingWelfareProgramLabel.setText("Please select Date");
        }
        IntroducingWelfareProgramLabel.setText("new welfare program has been introduced successfully");
    }

    @javafx.fxml.FXML
    public void AddProgramOA(ActionEvent actionEvent) {
        if(ProgramTitleTF.getText().isEmpty()){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Invalid input");
            alert.setContentText("Please enter title to show it in the table");
            alert.showAndWait();
        }
        if (ProgramDescriptionTF.getText().isEmpty()){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Invalid input");
            alert.setContentText("Please enter Program Description to show it in the table");
            alert.showAndWait();
        }
        if (TargetBeneficiariesTF.getText().isEmpty()){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Invalid input");
            alert.setContentText("Please enter Target Beneficiaries to show it in the table");
            alert.showAndWait();
        }
        if (ProgramCatagoryCB.getValue()==null){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Invalid input");
            alert.setContentText("Please Select Program Catagory to show it in the table");
            alert.showAndWait();
        }
        if (DateDP.getValue()==null){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Invalid input");
            alert.setContentText("Please Select Delete to show it in the table");
            alert.showAndWait();
        }

        Programs programs = new Programs(
                ProgramTitleTF.getText(),
                ProgramDescriptionTF.getText(),
                TargetBeneficiariesTF.getText(),
                ProgramCatagoryCB.getValue(),
                DateDP.getValue()
        );
        programList.add(programs);
        WelfareProgramsTV.getItems().add(programs);

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


    @javafx.fxml.FXML
    public void RespondToIncidentReportDashboardOA(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Sakira/RespondToIncidentReport.fxml"));
            Scene nextScene = new Scene(fxmlLoader.load());
            Stage nextStage = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
            nextStage.setTitle("RespondToIncidentReport");
            nextStage.setScene(nextScene);
            nextStage.show();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @javafx.fxml.FXML
    public void LogOutOA(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("LogIn.fxml"));
            Scene nextScene = new Scene(fxmlLoader.load());
            Stage nextStage = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
            nextStage.setTitle("LogIn");
            nextStage.setScene(nextScene);
            nextStage.show();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
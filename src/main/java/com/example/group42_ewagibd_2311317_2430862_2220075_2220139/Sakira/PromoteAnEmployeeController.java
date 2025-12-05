package com.example.group42_ewagibd_2311317_2430862_2220075_2220139.Sakira;

import com.example.group42_ewagibd_2311317_2430862_2220075_2220139.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class PromoteAnEmployeeController
{
    @javafx.fxml.FXML
    private Label PromoteAnEmployeeLabel;
    @javafx.fxml.FXML
    private ComboBox<String> DesignationCB;
    @javafx.fxml.FXML
    private ComboBox<String> DepartmentCB;
    @javafx.fxml.FXML
    private ComboBox<String> NewDesignationCB;
    @javafx.fxml.FXML
    private DatePicker EffectiveDateDP;
    @javafx.fxml.FXML
    private TextField NameTF;
    @javafx.fxml.FXML
    private TextField PerformanceLevelTF;
    @javafx.fxml.FXML
    private TextField IDTF;

    @javafx.fxml.FXML
    public void initialize() {
        DesignationCB.getItems().addAll("HR Manager", "President", "Manager", "Training Officer", "System Administrator");
        DepartmentCB.getItems().addAll("Health & Medical Welfare Department", "Training & Skill Development Department" , "Childcare, Education & Family Support Department");
        NewDesignationCB.getItems().addAll("HR Manager", "President", "Manager", "Training Officer", "System Administrator");

    }

    @javafx.fxml.FXML
    public void PromoteOA(ActionEvent actionEvent) {
        String name = NameTF.getText().trim();
        String newDesignation = NewDesignationCB.getValue();
        if (NameTF.getText().trim().isEmpty()){
            PromoteAnEmployeeLabel.setText("Please Enter Name");
            return;
        }
        if (IDTF.getText().trim().isEmpty()){
            PromoteAnEmployeeLabel.setText("Please Enter ID");
            return;
        }
        if (PerformanceLevelTF.getText().trim().isEmpty()){
            PromoteAnEmployeeLabel.setText("Please Enter Performance Level");
            return;
        }
        if (DepartmentCB.getValue()==null){
            PromoteAnEmployeeLabel.setText("Select Department");
            return;
        }
        if (DesignationCB.getValue()==null){
            PromoteAnEmployeeLabel.setText("Please Select Designation");
            return;
        }
        if (NewDesignationCB.getValue()==null){
            PromoteAnEmployeeLabel.setText("Please select Promoted Designation");
        }
        PromoteAnEmployeeLabel.setText("Congratulations to Employee \"" + name + "\" promoted to  \"" + newDesignation + "\" successfully");
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
    public void WelfareProgramsOA(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Sakira/IntroducingNewWelfarePrograms.fxml"));
            Scene nextScene = new Scene(fxmlLoader.load());
            Stage nextStage = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
            nextStage.setTitle("Introducing New Welfare Programs");
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
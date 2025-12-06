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

import java.time.LocalDate;

public class SetNewTermsAndConditionsController
{
    @javafx.fxml.FXML
    private TextField ReasonTF;
    @javafx.fxml.FXML
    private ComboBox<String> DepartmentCB;
    @javafx.fxml.FXML
    private TextField NewTermStatementTF;
    @javafx.fxml.FXML
    private DatePicker DateDP;
    @javafx.fxml.FXML
    private TextField SpecificCriteriaTF;
    @javafx.fxml.FXML
    private Label AddNewTAndCLabel;

    @javafx.fxml.FXML
    public void initialize() {
        DepartmentCB.getItems().addAll("Health & Medical Welfare Department", "Training & Skill Development Department" , "Childcare, Education & Family Support Department");

    }

    @javafx.fxml.FXML
    public void AddNewTAndC(ActionEvent actionEvent) {
        if (NewTermStatementTF.getText().trim().isEmpty()) {
            AddNewTAndCLabel.setText("Please enter New Term Statement ");
            return;
        }
        if (DateDP.getValue() == null) {
            AddNewTAndCLabel.setText("Please enter Date ");
            return;
        }
        if (DepartmentCB.getValue() == null) {
            AddNewTAndCLabel.setText("Please enter Specific Department");
            return;
        }
        if (SpecificCriteriaTF.getText().trim().isEmpty()) {
            AddNewTAndCLabel.setText("Please Enter Specific Criteria");
            return;
        }
        if (ReasonTF.getText().trim().isEmpty()) {
            AddNewTAndCLabel.setText("Please Enter Valid Reason");
            return;
        }
        AddNewTAndCLabel.setText("New Term and condition updated successfully");

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
    public void AssociationDashboardOA(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Sakira/UpdateAssociationAnnouncements.fxml"));
            Scene nextScene = new Scene(fxmlLoader.load());
            Stage nextStage = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
            nextStage.setTitle("Update Association Announcements");
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
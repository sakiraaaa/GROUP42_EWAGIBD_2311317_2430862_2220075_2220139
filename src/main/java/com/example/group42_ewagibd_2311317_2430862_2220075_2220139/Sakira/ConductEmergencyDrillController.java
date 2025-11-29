package com.example.group42_ewagibd_2311317_2430862_2220075_2220139.Sakira;

import com.example.group42_ewagibd_2311317_2430862_2220075_2220139.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.time.LocalDate;

public class ConductEmergencyDrillController
{
    @javafx.fxml.FXML
    private TableView<EmergencyDrill> ConductEmergencyDrillTV;
    @javafx.fxml.FXML
    private TextField TeamMembersTF;
    @javafx.fxml.FXML
    private TableColumn<EmergencyDrill, LocalDate> DateTC;
    @javafx.fxml.FXML
    private DatePicker DateDP;
    @javafx.fxml.FXML
    private TableColumn<EmergencyDrill,String> LocationTC;
    @javafx.fxml.FXML
    private ComboBox<String> TypeCB;
    @javafx.fxml.FXML
    private TableColumn<EmergencyDrill,String> TypeTC;
    @javafx.fxml.FXML
    private Label ConductEmergencyDrillLabel;
    @javafx.fxml.FXML
    private TextField LocationTF;
    @javafx.fxml.FXML
    private TableColumn<EmergencyDrill,Integer> TeamMembersTC;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void ScheduleOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void ConductOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void BackToDashBoardOA(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Sakira/WelfareOfficerDashboard.fxml"));
            Scene nextScene = new Scene(fxmlLoader.load());
            Stage nextStage = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
            nextStage.setTitle("WelfareOfficerDashboard");
            nextStage.setScene(nextScene);
            nextStage.show();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
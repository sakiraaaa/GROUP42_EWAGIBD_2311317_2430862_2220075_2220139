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
    ArrayList<EmergencyDrill> drillList = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {

        TypeCB.getItems().addAll("Earthquake drill" , "Evacuation Drill" , "Lockdown Drill" , "Fire Drill");
        TeamMembersTC.setCellValueFactory(new PropertyValueFactory<EmergencyDrill,Integer>("TeamMembers"));
        TypeTC.setCellValueFactory(new PropertyValueFactory<EmergencyDrill,String>("Type"));
        LocationTC.setCellValueFactory(new PropertyValueFactory<EmergencyDrill,String>("Location"));
        DateTC.setCellValueFactory(new PropertyValueFactory<EmergencyDrill,LocalDate>("Date"));



    }

    @javafx.fxml.FXML
    public void ScheduleOA(ActionEvent actionEvent) {
        EmergencyDrill drill = new EmergencyDrill(
                Integer.parseInt(TeamMembersTF.getText()),
                TypeCB.getValue(),
                LocationTF.getText(),
                DateDP.getValue()
        );
        drillList.add(drill);
        ConductEmergencyDrillTV.getItems().clear();
        ConductEmergencyDrillTV.refresh();
        ConductEmergencyDrillTV.getItems().setAll(drillList);
    }

    @javafx.fxml.FXML
    public void ConductOA(ActionEvent actionEvent) {
        if (TeamMembersTF.getText().trim().isEmpty()) {
            ConductEmergencyDrillLabel.setText("Enter total team members");
            return;
        }
        if (TypeCB.getValue()==null) {
            ConductEmergencyDrillLabel.setText("Select Type");
            return;
        }
        if (LocationTF.getText().trim().isEmpty()) {
            ConductEmergencyDrillLabel.setText("Please Enter Location");
            return;
        }
        if (DateDP.getValue()==null){
            ConductEmergencyDrillLabel.setText("Please select Valid Date");
            return;
        }
        ConductEmergencyDrillLabel.setText("Emergency Drill conducted successfully");



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
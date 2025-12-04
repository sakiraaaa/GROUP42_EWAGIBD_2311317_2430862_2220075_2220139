package com.example.group42_ewagibd_2311317_2430862_2220075_2220139.Sakira;

import com.example.group42_ewagibd_2311317_2430862_2220075_2220139.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.time.LocalDate;

public class AnnounceAndScheduleAuthorityMeetingController
{
    @javafx.fxml.FXML
    private ComboBox<String> DepartmentCB;
    @javafx.fxml.FXML
    private ComboBox<String> ParticipantsCB;
    @javafx.fxml.FXML
    private TextField AgendaTF;
    @javafx.fxml.FXML
    private DatePicker DateDP;
    @javafx.fxml.FXML
    private TextField MeetingTitleTF;
    @javafx.fxml.FXML
    private Label MeetingLabel;

    @javafx.fxml.FXML
    public void initialize() {
        DepartmentCB.getItems().addAll("Health & Medical Welfare Department", "Training & Skill Development Department" , "Childcare, Education & Family Support Department");
        ParticipantsCB.getItems().addAll("4", "5","10","20");
    }

    @javafx.fxml.FXML
    public void ConfirmAnnouncementOA(ActionEvent actionEvent) {
        if (MeetingTitleTF.getText().trim().isEmpty()){
            MeetingLabel.setText("Please Enter Meeting Title");
            return;
        }
        if (AgendaTF.getText().trim().isEmpty()) {
            MeetingLabel.setText("Please Enter Agenda");
            return;
        }
        if (DepartmentCB.getValue()==null){
            MeetingLabel.setText("Please select Department");
            return;
        }
        if (ParticipantsCB.getValue()==null) {
            MeetingLabel.setText("Select total amount of participants");
            return;
        }
        if (DateDP.getValue()==null) {
            MeetingLabel.setText("Select date");
            return;
        }
        MeetingLabel.setText("Meeting schedule successfully");
    }

    @javafx.fxml.FXML
    public void AnnounceOA(ActionEvent actionEvent) {
        String meetingTitle = MeetingTitleTF.getText();
        String agenda = AgendaTF.getText();
        String department = DepartmentCB.getValue();
        Integer participants = Integer.parseInt(ParticipantsCB.getValue());
        LocalDate date = DateDP.getValue();

        Meeting meeting = new Meeting(meetingTitle,agenda,department,participants,date);
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Aid Request Submitted");
        alert.setHeaderText("The aid request has been successfully submitted!");
        alert.setContentText(
                "Meeting Title: " + meetingTitle + "\n" +
                        "Agenda: " + agenda + "\n" +
                        "Department: " + department + "\n" +
                        "Participants: " + participants + "\n" +
                        "Date " + date
        );
        alert.showAndWait();
    }

    @javafx.fxml.FXML
    public void BackToDashBoardOA(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Sakira/PresidentDashBoard.fxml"));
            Scene nextScene = new Scene(fxmlLoader.load());
            Stage nextStage = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
            nextStage.setTitle("PresidentDashBoard");
            nextStage.setScene(nextScene);
            nextStage.show();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
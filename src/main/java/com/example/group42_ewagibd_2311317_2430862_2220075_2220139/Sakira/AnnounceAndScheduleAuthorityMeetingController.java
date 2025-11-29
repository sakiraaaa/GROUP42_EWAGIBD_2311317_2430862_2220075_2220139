package com.example.group42_ewagibd_2311317_2430862_2220075_2220139.Sakira;

import com.example.group42_ewagibd_2311317_2430862_2220075_2220139.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

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
    public void initialize() {
        DepartmentCB.getItems().addAll("CSE" , "BBA" , "CS" , "Biotechnology");
        ParticipantsCB.getItems().addAll("4", "5","10","20");
    }

    @javafx.fxml.FXML
    public void ConfirmAnnouncementOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void AnnounceOA(ActionEvent actionEvent) {
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
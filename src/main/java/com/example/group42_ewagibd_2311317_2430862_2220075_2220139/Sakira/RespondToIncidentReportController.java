package com.example.group42_ewagibd_2311317_2430862_2220075_2220139.Sakira;

import com.example.group42_ewagibd_2311317_2430862_2220075_2220139.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.time.LocalDate;

public class RespondToIncidentReportController
{
    @javafx.fxml.FXML
    private TableView<Report> IncidentReportTV;
    @javafx.fxml.FXML
    private TableColumn<Report, LocalDate> DateTC;
    @javafx.fxml.FXML
    private TableColumn<Report,String> LocationTC;
    @javafx.fxml.FXML
    private TableColumn<Report,String> ReporterNameTC;
    @javafx.fxml.FXML
    private TextField ResponseMessageTF;
    @javafx.fxml.FXML
    private TableColumn<Report,String> TimeTC;

    @javafx.fxml.FXML
    public void initialize() {
        ReporterNameTC.setCellValueFactory(new PropertyValueFactory<Report , String>("ReporterName"));
        LocationTC.setCellValueFactory(new PropertyValueFactory<Report , String>("Location"));
        DateTC.setCellValueFactory(new PropertyValueFactory<Report , LocalDate>("Date"));
        TimeTC.setCellValueFactory(new PropertyValueFactory<Report , String>("Time"));
    }

    @Deprecated
    public void IncidentReportOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void RespondOA(ActionEvent actionEvent) {
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
    public void AuthorityMeetingDashboardOA(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Sakira/AnnounceAndScheduleAuthorityMeeting.fxml"));
            Scene nextScene = new Scene(fxmlLoader.load());
            Stage nextStage = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
            nextStage.setTitle("Announce And Schedule Authority Meeting");
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
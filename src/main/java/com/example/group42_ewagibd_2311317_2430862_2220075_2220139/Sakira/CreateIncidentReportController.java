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

public class CreateIncidentReportController
{
    @javafx.fxml.FXML
    private TableView<Report> CreateIncidentReportTV;
    @javafx.fxml.FXML
    private TableColumn<Report, LocalDate> DateTC;
    @javafx.fxml.FXML
    private DatePicker DateDP;
    @javafx.fxml.FXML
    private TableColumn<Report , String> LocationTC;
    @javafx.fxml.FXML
    private TableColumn<Report , String> TimeTC;
    @javafx.fxml.FXML
    private TextField TimeTF;
    @javafx.fxml.FXML
    private TextField LocationTF;
    @javafx.fxml.FXML
    private TextField ReporterNameTF;
    @javafx.fxml.FXML
    private TableColumn<Report , String> ReporterNameTC;



    @javafx.fxml.FXML
    public void initialize() {
        ReporterNameTC.setCellValueFactory(new PropertyValueFactory<Report , String>("ReporterName"));
        LocationTC.setCellValueFactory(new PropertyValueFactory<Report , String>("Location"));
        DateTC.setCellValueFactory(new PropertyValueFactory<Report , LocalDate>("Date"));
        TimeTC.setCellValueFactory(new PropertyValueFactory<Report , String>("Time"));
    }

    @javafx.fxml.FXML
    public void SubmitReportOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void CreateReportOA(ActionEvent actionEvent) {
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

    @javafx.fxml.FXML
    public void isAmRadioButton(ActionEvent actionEvent) {
    }
}
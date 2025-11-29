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

public class ScheduleTrainingProgramController
{
    @javafx.fxml.FXML
    private DatePicker TrainingDateDP;
    @javafx.fxml.FXML
    private TableColumn<TrainingProgram, LocalDate> TrainingDateTC;
    @javafx.fxml.FXML
    private TableColumn<TrainingProgram,String> TrainerIDTC;
    @javafx.fxml.FXML
    private TextField TrainingTimeTF;
    @javafx.fxml.FXML
    private TableColumn<TrainingProgram,String> ParticipatingDepartmentTC;
    @javafx.fxml.FXML
    private TextField ParticipatingDepartmentTF;
    @javafx.fxml.FXML
    private TableColumn<TrainingProgram,String> TopicTC;
    @javafx.fxml.FXML
    private TextField TopicTF;
    @javafx.fxml.FXML
    private TableView<TrainingProgram> ScheduleTrainingProgramTV;
    @javafx.fxml.FXML
    private Label ScheduleTrainingProgramLabel;
    @javafx.fxml.FXML
    private TextField TrainerIDTF;
    @javafx.fxml.FXML
    private TableColumn<TrainingProgram,String> LocationTC;
    @javafx.fxml.FXML
    private TextField LocationTF;
    @javafx.fxml.FXML
    private TableColumn<TrainingProgram,String> TrainingTimeTC;

    @javafx.fxml.FXML
    public void initialize() {
        TopicTC.setCellValueFactory(new PropertyValueFactory<TrainingProgram,String>("Topic"));
        TrainerIDTC.setCellValueFactory(new PropertyValueFactory<TrainingProgram,String>("TrainerID"));
        TrainingDateTC.setCellValueFactory(new PropertyValueFactory<TrainingProgram,LocalDate>("TrainingDate"));
        TrainingTimeTC.setCellValueFactory(new PropertyValueFactory<TrainingProgram,String>("TrainingTime"));
        LocationTC.setCellValueFactory(new PropertyValueFactory<TrainingProgram,String>("Location"));
        ParticipatingDepartmentTC.setCellValueFactory(new PropertyValueFactory<TrainingProgram,String>("ParticipatingDepartment"));

    }

    @javafx.fxml.FXML
    public void ShowScheduleOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void UploadOA(ActionEvent actionEvent) {
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
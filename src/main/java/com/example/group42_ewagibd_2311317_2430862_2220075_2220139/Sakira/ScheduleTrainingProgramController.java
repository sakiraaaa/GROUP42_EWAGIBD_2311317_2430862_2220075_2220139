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
    ArrayList<TrainingProgram> TrainingList = new ArrayList<>();

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
        if (TopicTF.getText().isEmpty()){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Invalid input");
            alert.setContentText("Please enter Specific Topic");
            alert.showAndWait();
        }
        if (TrainerIDTF.getText().isEmpty()){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Invalid input");
            alert.setContentText("Please enter Trainer ID");
            alert.showAndWait();
        }
        if (TrainingDateDP.getValue()==null){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Invalid input");
            alert.setContentText("Please enter Training Date");
            alert.showAndWait();
        }
        if (TrainingTimeTF.getText().isEmpty()){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Invalid input");
            alert.setContentText("Please enter training Time");
            alert.showAndWait();
        }
        if (LocationTF.getText().isEmpty()){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Invalid input");
            alert.setContentText("Please enter location");
            alert.showAndWait();
        }
        if (ParticipatingDepartmentTF.getText().isEmpty()){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Invalid input");
            alert.setContentText("Please enter Participating Department");
            alert.showAndWait();
        }
        TrainingProgram trainingProgram = new TrainingProgram(
                TopicTF.getText(),
                TrainerIDTF.getText(),
                TrainingDateDP.getValue(),
                TrainingTimeTF.getText(),
                LocationTF.getText(),
                ParticipatingDepartmentTF.getText()
        );
        TrainingList.add(trainingProgram);
        ScheduleTrainingProgramTV.getItems().clear();
        ScheduleTrainingProgramTV.getItems().setAll(TrainingList);
    }

    @javafx.fxml.FXML
    public void UploadOA(ActionEvent actionEvent) {
        if (TopicTF.getText().trim().isEmpty()) {
            ScheduleTrainingProgramLabel.setText("Please Enter Topic");
            return;
        }
        if (TrainerIDTF.getText().trim().isEmpty()) {
            ScheduleTrainingProgramLabel.setText("Enter Trainer ID");
            return;
        }
        if (TrainingDateDP.getValue()==null){
            ScheduleTrainingProgramLabel.setText("Please select training date");
            return;
        }
        if (TrainingTimeTF.getText().trim().isEmpty()){
            ScheduleTrainingProgramLabel.setText("Please enter training time");
            return;
        }
        if (LocationTF.getText().trim().isEmpty()){
            ScheduleTrainingProgramLabel.setText("Please Enter Location");
            return;
        }
        if (ParticipatingDepartmentTF.getText().trim().isEmpty()){
            ScheduleTrainingProgramLabel.setText("Please Enter Participating Department");
            return;
        }
        ScheduleTrainingProgramLabel.setText("Training program scheduled successfully");
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
    public void logOutOA(ActionEvent actionEvent) {
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

    @javafx.fxml.FXML
    public void AwarenessOA(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Sakira/PostAwarenessOnWorkersRightsAndBenefits.fxml"));
            Scene nextScene = new Scene(fxmlLoader.load());
            Stage nextStage = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
            nextStage.setTitle("Post Awareness On Workers Rights And Benefits");
            nextStage.setScene(nextScene);
            nextStage.show();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
package com.example.group42_ewagibd_2311317_2430862_2220075_2220139.Sakira;

import com.example.group42_ewagibd_2311317_2430862_2220075_2220139.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.util.ArrayList;

public class ConductWorkerServiceController
{
    @javafx.fxml.FXML
    private ComboBox<String> TypeOfServiceCB;
    @javafx.fxml.FXML
    private TableColumn<Worker , String> TypeOfServiceTC;
    @javafx.fxml.FXML
    private Label WorkerServiceLabel;
    @javafx.fxml.FXML
    private TableView<Worker> ConductWorkerServiceTV;
    @javafx.fxml.FXML
    private TableColumn<Worker , String> IDTC;
    @javafx.fxml.FXML
    private TableColumn<Worker , String> NameTC;
    @javafx.fxml.FXML
    private TextField NameTF;
    @javafx.fxml.FXML
    private TextField IDTF;
    ArrayList<Worker> ServiceList = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {
        TypeOfServiceCB.getItems().addAll("counseling","grievance handling", "welfare assistance");
        NameTC.setCellValueFactory(new PropertyValueFactory<Worker,String>("Name"));
        IDTC.setCellValueFactory(new PropertyValueFactory<Worker,String>("ID"));
        TypeOfServiceTC.setCellValueFactory(new PropertyValueFactory<Worker,String>("TypeOfService"));
    }

    @javafx.fxml.FXML
    public void LoadOA(ActionEvent actionEvent) {
        Worker worker = new Worker();
        worker.setTitle("");
        worker.setContent("");
        worker.setVisibility("");
        worker.setName(NameTF.getText());
        worker.setID(IDTF.getText());
        worker.setTypeOfServices(TypeOfServiceCB.getValue());
        worker.setTypeOfAid("");

        ServiceList.add(worker);
        ConductWorkerServiceTV.getItems().add(worker);
    }

    @javafx.fxml.FXML
    public void SubmitOA(ActionEvent actionEvent) {
        if (NameTF.getText().trim().isEmpty()){
            WorkerServiceLabel.setText("Please Enter Name");
            return;
        }
        if (IDTF.getText().trim().isEmpty()){
            WorkerServiceLabel.setText("Please Enter ID");
            return;
        }
        if (TypeOfServiceCB.getValue() == null){
            WorkerServiceLabel.setText("Please Enter type of services");
            return;
        }
        WorkerServiceLabel.setText("Worker service conducted successfully");
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

    @javafx.fxml.FXML
    public void IncidentReportDashboardOA(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Sakira/CreateIncidentReport.fxml"));
            Scene nextScene = new Scene(fxmlLoader.load());
            Stage nextStage = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
            nextStage.setTitle("Create Incident Report");
            nextStage.setScene(nextScene);
            nextStage.show();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
package com.example.group42_ewagibd_2311317_2430862_2220075_2220139.Sakira;

import com.example.group42_ewagibd_2311317_2430862_2220075_2220139.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

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

    @javafx.fxml.FXML
    public void initialize() {
        TypeOfServiceCB.getItems().addAll("");
        NameTC.setCellValueFactory(new PropertyValueFactory<Worker,String>("Name"));
        IDTC.setCellValueFactory(new PropertyValueFactory<Worker,String>("ID"));
        TypeOfServiceTC.setCellValueFactory(new PropertyValueFactory<Worker,String>("TypeOfService"));
    }

    @javafx.fxml.FXML
    public void LoadOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void SubmitOA(ActionEvent actionEvent) {
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
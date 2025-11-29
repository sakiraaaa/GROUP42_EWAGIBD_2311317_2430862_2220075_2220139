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

public class UploadHealthAndSafetyInformationController
{
    @javafx.fxml.FXML
    private Label InfoLabel;
    @javafx.fxml.FXML
    private DatePicker PublishedDateDP;
    @javafx.fxml.FXML
    private TableColumn<HealthAndSafetyData , LocalDate> PublishedDateTC;
    @javafx.fxml.FXML
    private TextField TitleTF;
    @javafx.fxml.FXML
    private ComboBox<String> DepartmentCB;
    @javafx.fxml.FXML
    private TableColumn<HealthAndSafetyData, String> DepartmentTC;
    @javafx.fxml.FXML
    private TableColumn<HealthAndSafetyData, String> DescriptionTC;
    @javafx.fxml.FXML
    private TableColumn<HealthAndSafetyData, String> TitleTC;
    @javafx.fxml.FXML
    private TextField DescriptionTF;
    @javafx.fxml.FXML
    private TableView<HealthAndSafetyData> HealthAndSafetyInfoTV;

    @javafx.fxml.FXML
    public void initialize() {
        DepartmentCB.getItems().addAll("CSE" , "CS" , "BBA" , "BioTechnology");
        TitleTC.setCellValueFactory(new PropertyValueFactory<HealthAndSafetyData, String>("Title"));
        DepartmentTC.setCellValueFactory(new PropertyValueFactory<HealthAndSafetyData, String>("Department"));
        PublishedDateTC.setCellValueFactory(new PropertyValueFactory<HealthAndSafetyData, LocalDate>("PublishedDate"));
        DescriptionTC.setCellValueFactory(new PropertyValueFactory<HealthAndSafetyData, String>("Description"));
    }

    @javafx.fxml.FXML
    public void UploadNewHealthAndSafetyInformationOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void BackToDashBoard(ActionEvent actionEvent) {
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
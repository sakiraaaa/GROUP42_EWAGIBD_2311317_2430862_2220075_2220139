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

    ArrayList<HealthAndSafetyData> dataList = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {
        DepartmentCB.getItems().addAll("Health & Medical Welfare Department", "Training & Skill Development Department" , "Childcare, Education & Family Support Department");
        TitleTC.setCellValueFactory(new PropertyValueFactory<HealthAndSafetyData, String>("Title"));
        DepartmentTC.setCellValueFactory(new PropertyValueFactory<HealthAndSafetyData, String>("Department"));
        PublishedDateTC.setCellValueFactory(new PropertyValueFactory<HealthAndSafetyData, LocalDate>("PublishedDate"));
        DescriptionTC.setCellValueFactory(new PropertyValueFactory<HealthAndSafetyData, String>("Description"));
    }

    @javafx.fxml.FXML
    public void UploadNewHealthAndSafetyInformationOA(ActionEvent actionEvent) {
        if (TitleTF.getText().trim().isEmpty()){
            InfoLabel.setText("Please Enter Title");
            return;
        }
        if (DepartmentCB.getValue()==null){
            InfoLabel.setText("Please Select Department");
            return;
        }
        if (PublishedDateDP.getValue()==null){
            InfoLabel.setText("Please Select Published Date");
            return;
        }
        if (DescriptionTF.getText().trim().isEmpty()){
            InfoLabel.setText("Please Enter Description");
            return;
        }
        InfoLabel.setText(" uploaded successfully");{

        }
        HealthAndSafetyData healthAndSafetyData = new HealthAndSafetyData(
                TitleTF.getText(),
                DepartmentCB.getValue(),
                PublishedDateDP.getValue(),
                DescriptionTF.getText()

        );
        dataList.add(healthAndSafetyData);
        HealthAndSafetyInfoTV.getItems().clear();
        HealthAndSafetyInfoTV.refresh();
        HealthAndSafetyInfoTV.getItems().setAll(dataList);



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
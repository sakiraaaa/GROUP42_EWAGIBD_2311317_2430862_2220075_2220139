package com.example.group42_ewagibd_2311317_2430862_2220075_2220139.Sakira;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class PostAwarenessOnWorkersRightsAndBenefitsController
{
    @javafx.fxml.FXML
    private Label AwarenessLabel;
    @javafx.fxml.FXML
    private TableColumn<Worker , String> VisibilityTC;
    @javafx.fxml.FXML
    private TextField ContentTF;
    @javafx.fxml.FXML
    private TableColumn<Worker , String> ContentTC;
    @javafx.fxml.FXML
    private TextField TitleTF;
    @javafx.fxml.FXML
    private TableView<Worker> PostAwarenessTV;
    @javafx.fxml.FXML
    private ComboBox<String> VisibilityCB;
    @javafx.fxml.FXML
    private TableColumn<Worker , String>  TitleTC;
    @javafx.fxml.FXML
    private Button CreateAwarenessPostOA;


    @javafx.fxml.FXML
    public void initialize() {
        VisibilityCB.getItems().addAll("private" , "public" , "employees" , "custom");
        TitleTC.setCellValueFactory(new PropertyValueFactory<Worker , String>("Title"));
        ContentTC.setCellValueFactory(new PropertyValueFactory<Worker , String>("Content"));
        VisibilityTC.setCellValueFactory(new PropertyValueFactory<Worker , String>("Visibility"));

    }

    @javafx.fxml.FXML
    public void PublishOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void CreateAwarenessPostOA(ActionEvent actionEvent) {
    }
}
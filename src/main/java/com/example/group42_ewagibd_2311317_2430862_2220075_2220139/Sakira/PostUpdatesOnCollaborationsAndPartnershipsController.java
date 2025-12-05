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

public class PostUpdatesOnCollaborationsAndPartnershipsController
{
    @javafx.fxml.FXML
    private TableColumn<Collaboration,String> VisibilityTC;
    @javafx.fxml.FXML
    private TableView<Collaboration> CollaborationAndPArtnershipsTV;
    @javafx.fxml.FXML
    private TextField TitleTF;
    @javafx.fxml.FXML
    private Label UpdateOnCollaborationLabel;
    @javafx.fxml.FXML
    private TableColumn<Collaboration,String> DescriptionTC;
    @javafx.fxml.FXML
    private TableColumn<Collaboration,String> TitleTC;
    @javafx.fxml.FXML
    private TableColumn<Collaboration,String> PartnerNameTC;
    @javafx.fxml.FXML
    private TextField PartnerNameTF;
    @javafx.fxml.FXML
    private TextField DescriptionTF;
    @javafx.fxml.FXML
    private ComboBox<String> VisibilityCB;
    ArrayList<Collaboration> UpdateList = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {
        VisibilityCB.getItems().addAll("Private", "Public", "employees","custom");
        TitleTC.setCellValueFactory(new PropertyValueFactory<>("Title"));
        PartnerNameTC.setCellValueFactory(new PropertyValueFactory<>("PartnerName"));
        DescriptionTC.setCellValueFactory(new PropertyValueFactory<>("Description"));
        VisibilityTC.setCellValueFactory(new PropertyValueFactory<>("Visibility"));
    }

    @javafx.fxml.FXML
    public void CreateNewUpdateOA(ActionEvent actionEvent) {
        if (TitleTF.getText().trim().isEmpty()){
            UpdateOnCollaborationLabel.setText("Please Enter Title");
            return;
        }
        if (PartnerNameTF.getText().trim().isEmpty()){
            UpdateOnCollaborationLabel.setText("Please enter partner Name");
            return;
        }
        if (DescriptionTF.getText().trim().isEmpty()){
            UpdateOnCollaborationLabel.setText("Please enter description");
            return;
        }
        if (VisibilityCB.getValue()==null){
            UpdateOnCollaborationLabel.setText("Please Select Visibility");
            return;
        }
        UpdateOnCollaborationLabel.setText("Collaboration update posted successfully");

        Collaboration collaboration = new Collaboration(
                TitleTF.getText(),
                PartnerNameTF.getText(),
                DescriptionTF.getText(),
                VisibilityCB.getValue()
        );

        UpdateList.add(collaboration);
        CollaborationAndPArtnershipsTV.getItems().add(collaboration);
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
    public void AidRequestDashboardOA(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Sakira/SubmitWorkerAidRequest.fxml"));
            Scene nextScene = new Scene(fxmlLoader.load());
            Stage nextStage = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
            nextStage.setTitle("Submit Worker Aid Request");
            nextStage.setScene(nextScene);
            nextStage.show();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
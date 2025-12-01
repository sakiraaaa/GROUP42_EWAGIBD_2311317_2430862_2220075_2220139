package com.example.group42_ewagibd_2311317_2430862_2220075_2220139.Mashrifa;

import com.example.group42_ewagibd_2311317_2430862_2220075_2220139.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class adminDashboardController
{

    @javafx.fxml.FXML
    private Label welcomeSystemLabel;
    @javafx.fxml.FXML
    private Label adminLabel;

    @javafx.fxml.FXML
    public void initialize() {
    }



    @javafx.fxml.FXML
    public void approveClaimsOnAction(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Mashrifa/approveClaims.fxml"));
            Scene nextScene = new Scene(fxmlLoader.load());
            Stage nextStage = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
            nextStage.setTitle("Approve Claims");
            nextStage.setScene(nextScene);
            nextStage.show();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @javafx.fxml.FXML
    public void managerUsersOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void announcementsOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void systemSettingsOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void openReportsOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void fundBalanceOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void accessPermissionsOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void nextOnAction(ActionEvent actionEvent) {
    }
}
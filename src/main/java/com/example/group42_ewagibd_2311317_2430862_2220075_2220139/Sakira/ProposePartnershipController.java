package com.example.group42_ewagibd_2311317_2430862_2220075_2220139.Sakira;

import com.example.group42_ewagibd_2311317_2430862_2220075_2220139.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class ProposePartnershipController
{
    @javafx.fxml.FXML
    private TextField OrganizationNameTF;
    @javafx.fxml.FXML
    private ComboBox<String> TypeOfPartnershipCB;
    @javafx.fxml.FXML
    private TextField OverviewTF;

    @javafx.fxml.FXML
    public void initialize() {
        TypeOfPartnershipCB.getItems().addAll("CSR collaboration", "training support", "healthcare benefit", "safety partnership");
    }

    @javafx.fxml.FXML
    public void ConfirmOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void SendProposalOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void BackToDashBoardOA(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Sakira/PresidentDashboard.fxml"));
            Scene nextScene = new Scene(fxmlLoader.load());
            Stage nextStage = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
            nextStage.setTitle("PresidentDashboard");
            nextStage.setScene(nextScene);
            nextStage.show();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
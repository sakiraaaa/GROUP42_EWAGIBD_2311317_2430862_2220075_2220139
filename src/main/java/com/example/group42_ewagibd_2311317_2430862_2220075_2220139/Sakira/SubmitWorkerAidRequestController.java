package com.example.group42_ewagibd_2311317_2430862_2220075_2220139.Sakira;

import com.example.group42_ewagibd_2311317_2430862_2220075_2220139.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class SubmitWorkerAidRequestController
{
    @javafx.fxml.FXML
    private TextField ReasonTF;
    @javafx.fxml.FXML
    private ComboBox<String> TypeOfAidCB;
    @javafx.fxml.FXML
    private TextField RequestedAmountTF;
    @javafx.fxml.FXML
    private TextField NameTF;
    @javafx.fxml.FXML
    private TextField IDTF;

    @javafx.fxml.FXML
    public void initialize() {
        TypeOfAidCB.getItems().addAll("educational","financial","housing","medical");
    }

    @javafx.fxml.FXML
    public void SubmitRequestOA(ActionEvent actionEvent) {
        String Name = NameTF.getText();
        String ID = IDTF.getText();
        String Type = TypeOfAidCB.getValue();
        String Reason = ReasonTF.getText();
        Float RequestedAmount = Float.parseFloat(RequestedAmountTF.getText());
        AidRequest request = new AidRequest(Name , ID , Type, Reason , RequestedAmount);
        WelfareOfficer officer = new WelfareOfficer("Welfare Officer");
        officer.submitAidRequest(request);
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Aid Request Submitted");
        alert.setHeaderText("The aid request has been successfully submitted!");
        alert.setContentText(
                "Worker Name: " + Name + "\n" +
                        "Worker ID: " + ID + "\n" +
                        "Type of Aid: " + Type + "\n" +
                        "Reason: " + Reason + "\n" +
                        "Requested Amount: " + RequestedAmount
        );
        alert.showAndWait();


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
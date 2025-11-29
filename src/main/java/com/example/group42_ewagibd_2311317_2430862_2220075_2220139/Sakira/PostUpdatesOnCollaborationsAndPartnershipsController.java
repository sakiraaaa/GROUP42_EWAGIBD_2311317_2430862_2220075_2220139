package com.example.group42_ewagibd_2311317_2430862_2220075_2220139.Sakira;

import com.example.group42_ewagibd_2311317_2430862_2220075_2220139.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

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

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void CreateNewUpdateOA(ActionEvent actionEvent) {
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
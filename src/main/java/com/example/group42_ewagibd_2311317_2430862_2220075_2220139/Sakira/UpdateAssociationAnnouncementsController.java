package com.example.group42_ewagibd_2311317_2430862_2220075_2220139.Sakira;

import com.example.group42_ewagibd_2311317_2430862_2220075_2220139.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class UpdateAssociationAnnouncementsController
{
    @javafx.fxml.FXML
    private TextField ContentTF;
    @javafx.fxml.FXML
    private TextField TitleTF;
    @javafx.fxml.FXML
    private ComboBox<String> DepartmentCB;
    @javafx.fxml.FXML
    private DatePicker AnnouncementDateDP;
    @javafx.fxml.FXML
    private Label AnnouncementLabel;


    @javafx.fxml.FXML
    public void initialize() {
        DepartmentCB.getItems().addAll("Health & Medical Welfare Department", "Training & Skill Development Department" , "Childcare, Education & Family Support Department");
    }

    @javafx.fxml.FXML
    public void PublishAnnouncementOA(ActionEvent actionEvent) {
        String title = TitleTF.getText().trim();
        if (TitleTF.getText().trim().isEmpty()) {
            AnnouncementLabel.setText("Please Enter Updated Title");
            return;
        }
        if (ContentTF.getText().trim().isEmpty()) {
            AnnouncementLabel.setText("Please Enter Updated Content");
            return;
        }
        if (DepartmentCB.getValue() == null){
            AnnouncementLabel.setText("Please Enter Department");
            return;
        }
        if (AnnouncementDateDP.getValue()==null) {
            AnnouncementLabel.setText("Please Enter Announcement Date");
            return;
        }

        AnnouncementLabel.setText("Announcement \"" + title + "\" has been published successfully.");


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
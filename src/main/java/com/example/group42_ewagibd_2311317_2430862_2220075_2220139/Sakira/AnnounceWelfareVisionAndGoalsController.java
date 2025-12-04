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

public class AnnounceWelfareVisionAndGoalsController
{
    @javafx.fxml.FXML
    private TableView<Announcement> AnnounceWelfareVisionAndGoalsTV;
    @javafx.fxml.FXML
    private TextField TitleTF;
    @javafx.fxml.FXML
    private ComboBox<String> SelectiveVisibilityCB;
    @javafx.fxml.FXML
    private TableColumn<Announcement, String> SelectiveVisibilityTC;
    @javafx.fxml.FXML
    private TableColumn<Announcement, String> DescriptionTC;
    @javafx.fxml.FXML
    private TableColumn<Announcement, String> TitleTC;
    @javafx.fxml.FXML
    private Label AnnouncWelfareVisionAndGoalsLabel;
    @javafx.fxml.FXML
    private TextField DescriptionTF;
    ArrayList<Announcement> AnnouncementList = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {
        //AnnouncementList = new ArrayList<>();

        SelectiveVisibilityCB.getItems().addAll("employees", "private" , "public" , "custom");
        TitleTC.setCellValueFactory(new PropertyValueFactory<Announcement,String>("Title"));
        DescriptionTC.setCellValueFactory(new PropertyValueFactory<Announcement,String>("Description"));
        SelectiveVisibilityTC.setCellValueFactory(new PropertyValueFactory<Announcement,String>("SelectiveVisibility"));
    }

    @javafx.fxml.FXML
    public void UploadOA(ActionEvent actionEvent) {
        if (TitleTF.getText().trim().isEmpty()) {
            AnnouncWelfareVisionAndGoalsLabel.setText("Enter Title ");
            return;
        }
        if (DescriptionTF.getText().trim().isEmpty()) {
            AnnouncWelfareVisionAndGoalsLabel.setText("Please enter specific description");
            return;
        }
        if (SelectiveVisibilityCB.getValue() == null) {
            AnnouncWelfareVisionAndGoalsLabel.setText("Please select visibility");
        }
        AnnouncWelfareVisionAndGoalsLabel.setText("New Announcement has been uploaded successfully");
    }

    @javafx.fxml.FXML
    public void AddNewAnnouncementOA(ActionEvent actionEvent) {
        if (TitleTF.getText().isEmpty()){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Invalid input");
            alert.setContentText("Please enter title to show it in the table");
            alert.showAndWait();
        }
        if (DescriptionTF.getText().isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Invalid input");
            alert.setContentText("Please enter Description to show it in the table");
            alert.showAndWait();

        }
        if (SelectiveVisibilityCB.getValue()== null){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Invalid input");
            alert.setContentText("Please select visibility to show it in the table");
            alert.showAndWait();
        }


        Announcement announcement = new Announcement();
        announcement.setTitle(TitleTF.getText());
        announcement.setDescription(DescriptionTF.getText());
        announcement.setSelectiveVisibility(SelectiveVisibilityCB.getValue());
        announcement.setContent("");
        announcement.setDepartment("");
        announcement.setAnnouncementDate("");

        AnnouncementList.add(announcement);
        AnnounceWelfareVisionAndGoalsTV.getItems().add(announcement);



    }


    @javafx.fxml.FXML
    public void BackToDashBoardOA(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Sakira/PresidentDashBoard.fxml"));
            Scene nextScene = new Scene(fxmlLoader.load());
            Stage nextStage = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
            nextStage.setTitle("PresidentDashBoard");
            nextStage.setScene(nextScene);
            nextStage.show();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
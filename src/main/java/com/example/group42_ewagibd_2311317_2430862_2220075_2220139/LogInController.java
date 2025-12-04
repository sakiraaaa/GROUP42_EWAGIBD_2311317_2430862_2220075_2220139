package com.example.group42_ewagibd_2311317_2430862_2220075_2220139;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LogInController
{
    @javafx.fxml.FXML
    private TextField LogInIDTF;
    @javafx.fxml.FXML
    private TextField PasswordTF;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void LogInOA(ActionEvent actionEvent) {
        if((LogInIDTF.getText().isEmpty()) && (PasswordTF.getText().isEmpty())){

            return;
        }
        if (LogInIDTF.getText().isEmpty()){

            return;
        }
        if (PasswordTF.getText().isEmpty()){

            return;
        }
        if ((LogInIDTF.getText().equals("00001")) && (PasswordTF.getText().equals("12345"))){
            try {
                FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Sakira/WelfareOfficerDashboard.fxml"));
                Scene nextScene = new Scene(fxmlLoader.load());
                Stage nextStage = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
                nextStage.setTitle("Welfare Officer Dashboard");
                nextStage.setScene(nextScene);
                nextStage.show();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }

        } else if ((LogInIDTF.getText().equals("00002")) && (PasswordTF.getText().equals("12345"))){
            try {
                FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Sakira/PresidentDashboard.fxml"));
                Scene nextScene = new Scene(fxmlLoader.load());
                Stage nextStage = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
                nextStage.setTitle("President Dashboard");
                nextStage.setScene(nextScene);
                nextStage.show();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }

        } else if ((LogInIDTF.getText().equals("00003")) && (PasswordTF.getText().equals("12345"))){
            try {
                FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Mashrifa/SystemAdministratorDashboard.fxml"));
                Scene nextScene = new Scene(fxmlLoader.load());
                Stage nextStage = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
                nextStage.setTitle("System Administrator Dashboard");
                nextStage.setScene(nextScene);
                nextStage.show();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }

        } else if ((LogInIDTF.getText().equals("00004")) && (PasswordTF.getText().equals("12345"))){
            try {
                FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Mashrifa/EmployeeDashboard.fxml"));
                Scene nextScene = new Scene(fxmlLoader.load());
                Stage nextStage = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
                nextStage.setTitle("Employee Dashboard");
                nextStage.setScene(nextScene);
                nextStage.show();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }

        } else if ((LogInIDTF.getText().equals("00005")) && (PasswordTF.getText().equals("12345"))){
            try {
                FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Anamika/HROfficerDashboard.fxml"));
                Scene nextScene = new Scene(fxmlLoader.load());
                Stage nextStage = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
                nextStage.setTitle("HR Officer Dashboard");
                nextStage.setScene(nextScene);
                nextStage.show();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }

        } else if ((LogInIDTF.getText().equals("00006")) && (PasswordTF.getText().equals("12345"))){
            try {
                FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Anamika/ITSupportOfficerDashboard.fxml"));
                Scene nextScene = new Scene(fxmlLoader.load());
                Stage nextStage = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
                nextStage.setTitle("IT Support Officer Dashboard");
                nextStage.setScene(nextScene);
                nextStage.show();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }

        } else if ((LogInIDTF.getText().equals("00007")) && (PasswordTF.getText().equals("12345"))){
            try {
                FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Tahsina/AccountantDashboard.fxml"));
                Scene nextScene = new Scene(fxmlLoader.load());
                Stage nextStage = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
                nextStage.setTitle("Accountant Dashboard");
                nextStage.setScene(nextScene);
                nextStage.show();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }

        } else if ((LogInIDTF.getText().equals("00008")) && (PasswordTF.getText().equals("12345"))){
            try {
                FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Tahsina/Training&DevelopmentOfficer.fxml"));
                Scene nextScene = new Scene(fxmlLoader.load());
                Stage nextStage = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
                nextStage.setTitle("Training & Development Officer Dashboard");
                nextStage.setScene(nextScene);
                nextStage.show();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }



        }
    }
}
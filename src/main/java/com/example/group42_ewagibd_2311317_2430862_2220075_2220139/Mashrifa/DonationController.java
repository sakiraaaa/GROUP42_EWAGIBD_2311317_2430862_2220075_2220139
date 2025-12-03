package com.example.group42_ewagibd_2311317_2430862_2220075_2220139.Mashrifa;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class DonationController
{
    @javafx.fxml.FXML
    private TableColumn methodCol;
    @javafx.fxml.FXML
    private Label dateLabel;
    @javafx.fxml.FXML
    private Label paymentMethodLabel;
    @javafx.fxml.FXML
    private Label amountLabel;
    @javafx.fxml.FXML
    private Label donationLabel;
    @javafx.fxml.FXML
    private DatePicker dateDatePicker;
    @javafx.fxml.FXML
    private TableColumn amountCol;
    @javafx.fxml.FXML
    private TableColumn dateCol;
    @javafx.fxml.FXML
    private TextField amountTextField;
    @javafx.fxml.FXML
    private ComboBox paymentMethodComboBox;
    @javafx.fxml.FXML
    private TableView donationTableView;
    @javafx.fxml.FXML
    private Label errorLabel;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @Deprecated
    public void submitButtonOnAction(ActionEvent actionEvent) {
    }
}
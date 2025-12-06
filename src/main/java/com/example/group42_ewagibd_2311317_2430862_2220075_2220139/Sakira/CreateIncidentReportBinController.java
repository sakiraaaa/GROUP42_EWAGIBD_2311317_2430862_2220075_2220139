package com.example.group42_ewagibd_2311317_2430862_2220075_2220139.Sakira;

import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class CreateIncidentReportBinController
{
    @javafx.fxml.FXML
    private TableView<Report> CreateIncidentReportTV;
    @javafx.fxml.FXML
    private TableColumn<Report, LocalDate> DateTC;
    @javafx.fxml.FXML
    private TableColumn<Report,String> LocationTC;
    @javafx.fxml.FXML
    private TableColumn<Report,String> TimeTC;
    @javafx.fxml.FXML
    private TableColumn<Report,String> ReporterNameTC;
    ArrayList<Report> incidentList = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {
        ReporterNameTC.setCellValueFactory(new PropertyValueFactory<Report , String>("ReporterName"));
        LocationTC.setCellValueFactory(new PropertyValueFactory<Report , String>("Location"));
        DateTC.setCellValueFactory(new PropertyValueFactory<Report , LocalDate>("Date"));
        TimeTC.setCellValueFactory(new PropertyValueFactory<Report , String>("Time"));
    }

    @javafx.fxml.FXML
    public void LoadBinFileOA(ActionEvent actionEvent) {
        File f = new File("CreateIncidentReport.bin");
        try {
            FileInputStream fis = new FileInputStream(f);
            ObjectInputStream ois = new ObjectInputStream(fis);

            while (true) {
                try {
                    incidentList.add((Report) ois.readObject());
                } catch (EOFException e) {
                    break;
                }
            }
        } catch (IOException | ClassNotFoundException e) {
        }

    }
}
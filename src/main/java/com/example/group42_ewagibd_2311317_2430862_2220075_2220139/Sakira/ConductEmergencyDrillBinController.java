package com.example.group42_ewagibd_2311317_2430862_2220075_2220139.Sakira;

import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class ConductEmergencyDrillBinController
{
    @javafx.fxml.FXML
    private TableView<EmergencyDrill> ConductEmergencyDrillTV;
    @javafx.fxml.FXML
    private TableColumn<EmergencyDrill, LocalDate> DateTC;
    @javafx.fxml.FXML
    private TableColumn<EmergencyDrill, String> LocationTC;
    @javafx.fxml.FXML
    private TableColumn<EmergencyDrill, String> TypeTC;
    @javafx.fxml.FXML
    private TableColumn<EmergencyDrill, Integer> TeamMembersTC;
    ArrayList<EmergencyDrill> emergencyList = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {
        TeamMembersTC.setCellValueFactory(new PropertyValueFactory<EmergencyDrill,Integer>("TeamMembers"));
        TypeTC.setCellValueFactory(new PropertyValueFactory<EmergencyDrill,String>("Type"));
        LocationTC.setCellValueFactory(new PropertyValueFactory<EmergencyDrill,String>("Location"));
        DateTC.setCellValueFactory(new PropertyValueFactory<EmergencyDrill,LocalDate>("Date"));
    }

    @javafx.fxml.FXML
    public void LoadTableFromBinFileOA(ActionEvent actionEvent) {
        File f = new File("ConductEmergencyDrill.bin");
        try {
            FileInputStream fis = new FileInputStream(f);
            ObjectInputStream ois = new ObjectInputStream(fis);

            while (true) {
                try {
                    emergencyList.add((EmergencyDrill) ois.readObject());
                } catch (EOFException e) {
                    break;
                }
            }
        } catch (IOException | ClassNotFoundException e) {
        }
    }
}
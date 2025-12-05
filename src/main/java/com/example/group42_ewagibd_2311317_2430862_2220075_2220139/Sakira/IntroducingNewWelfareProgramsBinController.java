package com.example.group42_ewagibd_2311317_2430862_2220075_2220139.Sakira;

import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class IntroducingNewWelfareProgramsBinController
{
    @javafx.fxml.FXML
    private TableColumn<Programs,String> ProgramTitleTC;
    @javafx.fxml.FXML
    private TableColumn<Programs,String> ProgramDescriptionTC;
    @javafx.fxml.FXML
    private TableColumn<Programs,String> TargetBeneficiariesTC;
    @javafx.fxml.FXML
    private TableView<Programs> WelfareProgramsTV;
    @javafx.fxml.FXML
    private TableColumn<Programs,LocalDate> DateTC;
    @javafx.fxml.FXML
    private TableColumn<Programs,String> ProgramCatagoryTC;
    ArrayList<Programs> welfareList = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {
        ProgramTitleTC.setCellValueFactory(new PropertyValueFactory<Programs,String>("ProgramTitle"));
        ProgramDescriptionTC.setCellValueFactory(new PropertyValueFactory<Programs,String>("ProgramDescription"));
        TargetBeneficiariesTC.setCellValueFactory(new PropertyValueFactory<Programs,String>("TargetBeneficiaries"));
        ProgramCatagoryTC.setCellValueFactory(new PropertyValueFactory<Programs,String>("ProgramCatagory"));
        DateTC.setCellValueFactory(new PropertyValueFactory<Programs, LocalDate>("Date"));
    }

    @javafx.fxml.FXML
    public void LoadTableFromBinFileOA(ActionEvent actionEvent) {
        File f = new File("IntroducingNewWelfarePrograms.bin");
        try {
            FileInputStream fis = new FileInputStream(f);
            ObjectInputStream ois = new ObjectInputStream(fis);

            while (true) {
                try {
                    welfareList.add((Programs) ois.readObject());
                } catch (EOFException e) {
                    break;
                }
            }
        } catch (IOException | ClassNotFoundException e) {
        }
    }
}
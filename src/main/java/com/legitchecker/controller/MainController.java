package com.legitchecker.controller;

import com.legitchecker.model.MainModel;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {
    
    private MainModel model;
    
    public MainController() {
        this.model = new MainModel();
    }
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // Initialize controller
        // This method is called after the FXML file has been loaded
    }
}

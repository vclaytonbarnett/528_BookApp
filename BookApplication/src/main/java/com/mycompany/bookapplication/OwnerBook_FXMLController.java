/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.mycompany.bookapplication;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import javafx.scene.control.Button;
import javafx.scene.control.TableView;
/**
 * FXML Controller class
 *
 * @author victorbarnett
 */
public class OwnerBook_FXMLController implements Initializable {


    @FXML
    private Button deleteBookButton;
    @FXML
    private TableView<?> bookTable;
    @FXML
    private Button backButton;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    

    @FXML
    private void deleteBook(ActionEvent event) {
    }

    @FXML
    private void backToOwnerHome(ActionEvent event) {
    }

}

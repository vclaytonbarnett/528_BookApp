package demoExamples;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.scene.layout.*;
import javafx.geometry.Insets;
import java.io.*;
import java.text.ParseException;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.text.Font;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.stage.WindowEvent;

public class COE528SingleWindowExample extends Application {
    Button okButton = new Button("OK-1");
    Label aLabel = new Label("Enter text and hit Enter key");
    TextField aTextField = new TextField();
    
    @Override //Override the start method in the Application class
    public void start(Stage primaryStage) {
        //primaryStage refers to the only stage (i.e. window) that
        //we care about in this app.
        
        //Set title of stage
        primaryStage.setTitle("Single Window Example");  
        //Create a scene and place it in the stage.
        //Note that call to createFirstGridPane creates a GridPane 
        //inside that scene.
        primaryStage.setScene(new Scene(createFirstGridPane(), 300, 200));
        //display the stage
        primaryStage.show(); 
        
        //handle the ActionEvent when okButton is clicked
        okButton.setOnAction(
            new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent e) {
                   System.out.println("OK-1 button of anonymous clicked"); 
                   //Create a scene and place it in the stage.
                   //(the call to createSecondGridPane creates a GridPane 
                   //inside that scene)
                   primaryStage.setScene(new Scene(createSecondGridPane(), 500, 200));
                }
            }    
        );
        
        //handle the ActionEvent when the [Enter] key is hit by user
        aTextField.setOnAction(
            new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent e) {
                    TextField tf = (TextField)e.getSource();
                    System.out.println("You typed: " + tf.getText()); 
                }
            } 
        );
        
        
        //called when the "close" icon [x] at the window's top-right is clicked
        primaryStage.setOnCloseRequest(
            new EventHandler<WindowEvent>() {
                 @Override
                 public void handle(WindowEvent e) {
                     System.out.println("window (i.e stage) is closing");
                }  
            }
        );
    }
    
    public GridPane createFirstGridPane() {
        GridPane gp1 = new GridPane();
        gp1.setAlignment(Pos.CENTER); 
        //add a Button in the GridPane at column 0 and row 0
        gp1.add(okButton, 0, 0);
        return gp1;
    }
    
    public GridPane createSecondGridPane() {
        GridPane gp1 = new GridPane();
        gp1.setAlignment(Pos.CENTER); 
        //add a Label in the GridPane at column 0 and row 0
        gp1.add(aLabel, 0, 0);
        //add a TextField in the GridPane at column 0 and row 1
        gp1.add(aTextField, 0, 1);
        return gp1;
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}




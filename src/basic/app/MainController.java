/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic.app;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 *
 * @author Hp
 */
public class MainController implements Initializable {
    
    @FXML
    private Label label;
    @FXML 
    private Button button;
    
    @FXML
    private TextField myInput;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        String text = myInput.getText();
        label.setText(text);
        button.setText("Clicked");
    }
    
    @FXML
    private void showAboutWindow(ActionEvent event) throws IOException{
//        System.out.println("You Click Me!");
   
      Parent root = FXMLLoader.load(getClass().getResource("about.fxml"));
      
      Scene scene = new Scene(root);
      Stage stage = new Stage();
      stage.setScene(scene);
      
      Stage mainStage = (Stage)label.getScene().getWindow();
      stage.initOwner(mainStage);
      
      stage.initModality(Modality.WINDOW_MODAL);

      stage.show();
      
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) { 
        // TODO
    }    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package coderealm;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author User
 */
public class AboutUsController implements Initializable {

    @FXML
    private ImageView exitIcon;
    @FXML
    private Label exit;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void goBack(MouseEvent event) {
        try {
              FXMLLoader loader = new FXMLLoader(getClass().getResource("Home.fxml"));
              Parent root = loader.load();
              Scene scene = new Scene(root);
              HomeController sc = loader.getController();
              Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
              stage.setScene(scene);
              stage.show();
              
           } catch (IOException ex) {
               //Logger.getLogger(ToDoListWindowController.class.getName()).log(Level.SEVERE, null, ex);
               System.out.println(ex);
           }
    }
    
}

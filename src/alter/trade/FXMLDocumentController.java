/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alter.trade;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;

/**
 *
 * @author KLoverated Geek
 */
public class FXMLDocumentController extends StackPane implements Initializable {
    
    @FXML
    private StackPane homeSection;
    
    @FXML
    private StackPane aboutSection;
    
    @FXML
    private StackPane loginSection;
    
    @FXML
    private StackPane settingsSection;
    
    @FXML
    private void setHomeSection(){
        homeSection.toFront();
    }
    
    @FXML
    private void setAboutSection(){
        aboutSection.toFront();
    }

    @FXML
    private void setLoginSection(){
        loginSection.toFront();
    }
    
    @FXML
    private void setSettingsSection(){
        settingsSection.toFront();
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        homeSection.toFront();
    }    
    
}

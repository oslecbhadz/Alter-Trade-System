package alter.trade;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class FXMLHomeController implements Initializable {
    
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

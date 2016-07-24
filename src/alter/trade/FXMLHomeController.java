package alter.trade;

import javafx.scene.control.Button;
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
    private Button btnLogin;
    
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
    
    @FXML
    private void opneAdminPanel() throws IOException{
        Stage stage;
        Parent root;
        
        stage = (Stage) btnLogin.getScene().getWindow();
        root = FXMLLoader.load(getClass().getResource("FXMLAdminPanel.fxml"));
        
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setMaximized(true);
        stage.setTitle("Admin Panel | Alter Trade System");
        stage.setMinHeight(600);
        stage.setMinWidth(800);      
        stage.show();
    }
    
    
 
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        homeSection.toFront();
    }    
    
}

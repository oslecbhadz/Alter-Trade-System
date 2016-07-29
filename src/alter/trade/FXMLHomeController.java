package alter.trade;

import dbConfig.clsConnection;
import javafx.scene.control.Button;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class FXMLHomeController implements Initializable {

    clsConnection Connect = new clsConnection();
    Connection conn;
    String sql;
    
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
    private void setHomeSection() {
        homeSection.toFront();
    }

    @FXML
    private void setAboutSection() {
        aboutSection.toFront();
    }

    @FXML
    private void setLoginSection() {
        loginSection.toFront();
    }

    @FXML
    private void setSettingsSection() {
        loginSection.toFront();
    }

    @FXML
    private void opneAdminPanel() throws IOException {
        Stage stage;
        Parent root;

        stage = (Stage) btnLogin.getScene().getWindow();
        root = FXMLLoader.load(getClass().getResource("FXMLAdminPanel.fxml"));

        Scene scene = new Scene(root);
        stage.setScene(scene);
        //   stage.setMaximized(true);
        stage.setTitle("Admin Panel | Alter Trade System");
        stage.setMinHeight(600);
        stage.setMinWidth(800);
        stage.show();

    }

    @FXML
    private void testConnection() throws IOException {
        mysqlConnect();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        homeSection.toFront();
    }

    //
    //       D A T A B A S E 
    //     I N T E R CO U R S E
    //           D A T A
    //
    public void mysqlConnect() {
        try {
            conn = Connect.setConnection(conn, "root", "");
            System.out.println("Connected");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
  

}

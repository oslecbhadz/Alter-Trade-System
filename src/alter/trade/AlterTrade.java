package alter.trade;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AlterTrade extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLHomePanel.fxml"));

        Scene scene = new Scene(root);
        stage.setScene(scene);
       // stage.setMaximized(true);
        stage.setTitle("Alter Trade System");
        stage.setMinHeight(600);
        stage.setMinWidth(800);
        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }

}

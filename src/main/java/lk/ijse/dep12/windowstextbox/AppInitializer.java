package lk.ijse.dep12.windowstextbox;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class AppInitializer extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        URL resourse = getClass().getResource("/view/MainView.fxml");
        AnchorPane container = FXMLLoader.load(resourse);
        Scene mainScene = new Scene(container);
        primaryStage.setTitle("Hello Note Pad - NotePad");
        primaryStage.setScene(mainScene);
        primaryStage.show();
        primaryStage.centerOnScreen();


    }
}

package lk.ijse.dep12.windowstextbox.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.paint.Color;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class MainViewController {
    public Label hdr;
    public Button btnedt;
    public Button btnfmt;
    public Button btnvw;
    public Button btn1;
    public Button btn2;
    public Button btn3;
    public AnchorPane root;


    public void initialize(){
        hdr.setTextFill(Color.BLUE);
    }

   
    public void btnHelpApplicatioOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage = new Stage();
        AnchorPane container = FXMLLoader.load(getClass().getResource("/view/AboutUs.fxml"));
        Scene scene = new Scene(container);
        stage.setScene(scene);
        stage.setTitle("About Us");
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.show();
        stage.centerOnScreen();
    }
    public void btnMinimizeOnAction(ActionEvent actionEvent) {
        (root.getScene().getWindow()).hide();
    }
    public void btnMaxiOnAction(ActionEvent actionEvent) {
        ((Stage)root.getScene().getWindow()).setFullScreen(true);
    }
    public void btnCrossOnAction(ActionEvent actionEvent) {
        ((Stage)root.getScene().getWindow()).close();
    }
}

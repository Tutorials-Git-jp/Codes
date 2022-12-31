package com.example.demo15;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class Contoler {
    private Stage stage;
    private Scene scene;
    private Parent root;

    public void switchTologgine(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("loggine.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.getScene();
        stage.show();


    }

    public void switchToscene2(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("scene2.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene  = new Scene(root);
        stage.getScene();
        stage.show();


    }
}

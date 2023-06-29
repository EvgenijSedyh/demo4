package com.example.demo4.Controler;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class RegistrationController {

    @FXML
    private Button buttonExit;

    @FXML
    private Button buttonRegistration;

    @FXML
    private TextField stringCity;

    @FXML
    private TextField stringCountry;

    @FXML
    private TextField stringHome;

    @FXML
    private TextField stringLogin;

    @FXML
    private TextField stringName;

    @FXML
    private TextField stringNumberPassport;

    @FXML
    private TextField stringPassword;

    @FXML
    private TextField stringPasswordRepit;

    @FXML
    private TextField stringSeriesPassport;

    @FXML
    private TextField stringStreet;
    @FXML
    void initialize(){
        buttonExit.setOnAction(event -> {
            buttonExit.getScene().getWindow().hide();

            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/com/example/demo4/EntryWindow.fxml"));
            try {
                loader.load();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            Parent root = loader.getRoot();
            Stage stage = new Stage();
            stage.setTitle("Автоизация");
            stage.setResizable(false);
            stage.setScene(new Scene(root));
            stage.show();
        });

    }

}

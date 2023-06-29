package com.example.demo4.Controler;


import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class EntryController {

    @FXML
    private Button buttonEmty;

    @FXML
    private Button buttonRegistration;

    @FXML
    private TextField login;

    @FXML
    private PasswordField password;

    @FXML
    void initialize(){
        buttonRegistration.setOnAction(event -> {
            buttonRegistration.getScene().getWindow().hide();

            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/com/example/demo4/RegistrationWindow.fxml"));
            try {
                loader.load();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            Parent root = loader.getRoot();
            Stage stage = new Stage();
            stage.setTitle("Регистрация");
            stage.setResizable(false);
            stage.setScene(new Scene(root));
            stage.show();
        });

    }

}

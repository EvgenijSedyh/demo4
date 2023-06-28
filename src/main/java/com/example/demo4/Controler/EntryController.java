package com.example.demo4.Controler;


import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

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
        buttonEmty.setOnAction(event -> {
            System.out.println("Вы успешно вошли");
        });
    }

}

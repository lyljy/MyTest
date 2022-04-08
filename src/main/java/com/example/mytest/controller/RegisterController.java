package com.example.mytest.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: LiangYong
 * @Date: 2022/04/07/21:58
 * @Description:注册控制器
 */

public class RegisterController {
    @FXML
    private Button backButn;

    @FXML
    private Button registerButn;

    @FXML
    private TextField registerEmail;

    @FXML
    private TextField registerID;

    @FXML
    private PasswordField registerPassword;

    @FXML
    private TextField registerPhone;

    @FXML
    void backEvn(ActionEvent event) {
        Stage stage= (Stage) backButn.getScene().getWindow();
        stage.close();
    }

    public void registerEvn(ActionEvent actionEvent) {
    }
}

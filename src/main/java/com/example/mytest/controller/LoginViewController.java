package com.example.mytest.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: LiangYong
 * @Date: 2022/04/07/21:13
 * @Description:登录控制器
 */
public class LoginViewController {

    @FXML // fx:id="loginBut"
    private Button loginBut; // Value injected by FXMLLoader

    @FXML // fx:id="passwordFiled"
    private PasswordField passwordFiled; // Value injected by FXMLLoader

    @FXML // fx:id="registerBut"
    private Button registerBut; // Value injected by FXMLLoader

    @FXML // fx:id="usernameFiled"
    private TextField usernameFiled; // Value injected by FXMLLoader

    @FXML
    void loginEvn(ActionEvent event) {

    }

    @FXML
    void registerEvn(ActionEvent event) throws Exception {
       LibSystemApplication application=new LibSystemApplication();
       Stage s=new Stage();
       application.Register(s);
    }
}

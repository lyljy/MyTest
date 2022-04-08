package com.example.mytest.controller;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: LiangYong
 * @Date: 2022/04/08/9:55
 * @Description:
 */
public class LibSystemApplication extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader=new FXMLLoader(LibSystemApplication.class.getResource("loginView.fxml"));
        Scene scene=new Scene(fxmlLoader.load());
        stage.setTitle("图书管理系统");
        stage.setScene(scene);
        stage.show();
    }

    public void Register(Stage stage) throws Exception{
        try {
            FXMLLoader fxmlLoader=new FXMLLoader(LibSystemApplication.class.getResource("registerView.fxml"));
            Scene scene=new Scene(fxmlLoader.load());
            stage.setScene(scene);
            stage.show();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void back(Button button){

    }

    public static void main(String[] args) {
        launch(args);
    }
}

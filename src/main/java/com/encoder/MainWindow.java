package com.encoder;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;


public class MainWindow extends Application{


    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainWindow.class.getResource("Coding.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 700, 400);
        stage.setResizable(false);
        stage.setTitle("кодировщик сообщений");
        stage.setScene(scene);
        stage.show();
    }


    public void open(String window){
        FXMLLoader loader=new FXMLLoader();
        //путь к окну загрузки
        loader.setLocation(getClass().getResource(window));
        //загружаем окно
        try {
            loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //путь к файлу загрузки
        Parent root=loader.getRoot();
        Stage stage=new Stage();
        stage.setResizable(false);
        //
        stage.setScene(new Scene(root));
        stage.setTitle("кодировщик сообщений");
        //показать загруженное окно
        stage.show();
    }


    public static void main(String... args) {launch();}
}
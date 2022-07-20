package com.encoder;


import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;


public class Coding {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button decoding;

    @FXML
    private TextField textInput;

    @FXML
    private TextField textOutput;


    @FXML
    void initialize() {


        textInput.setOnKeyPressed(keyEvent -> {
            //если нажали клавишу ENTER
            if(keyEvent.getCode()== KeyCode.ENTER) {
                String s = textInput.getText().trim();
                // Преобразование текста в символьный массив:
                char[] sym=s.toCharArray();
                // Кодирование символов:
                for(int k=0;k<sym.length;k++){
                    sym[k]=(char)(sym[k]+k+11);
                }
                // Создание текста на основе массива:
                s=new String(sym);
                // Вывод текста
                textOutput.setText(s);
            }
        });

        decoding.setOnAction(actionEvent -> {
            //прячем окно при нажатии на кнопку
            decoding.getScene().getWindow().hide();
            //отображаем нужное нам окно, вызывая анонимный объект
            new MainWindow().open("Decoding.fxml");
        });
    }
}

package controller;

import java.io.FileWriter;
import java.io.IOException;

import Setting.Setting;
import model.User;
import view.ViewShoow;

public class UserFileManagger {
    public static void userWriteFile(User user) throws RuntimeException{
        String filename = Setting.pathSaveFileUser + user.getName()+user.getSurname() + ".txt";
        ViewShoow.shoowResponse("Сохрянется по пути: " + filename + "\n ДЛЯ ИЗМЕНЕНИЯ ПУТИ СОХРАНЕНИЯ ПОМЕНЯТЕ ПУТЬ В Setting\\Setting.java");

        try(FileWriter file = new FileWriter(filename, true)) {
            file.write(user.toString() + "\n");
        } catch(Exception e) {
            new RuntimeException("Произошла ошибка при работе с файлом");
        } 
    }
}

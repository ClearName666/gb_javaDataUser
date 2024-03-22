package controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Pattern;

import model.User;

public class UserValid {

    public static User GetChackValidStrUser(String dataStr) throws RuntimeException{

        String surname = "";
        String name = "";
        String lastname = "";
        String date = "";
        Long numberPhone = (long) 0;
        char gender;

        String[] data = dataStr.split(" ");
        if (data.length != 6) throw new RuntimeException("Данных недостаточно введите заного!");
        surname = data[0];
        name = data[1];
        lastname = data[2];
        date = data[3];

        try {
            System.out.println(data[4]);
            
        } catch(Exception e) {
            throw new RuntimeException("Номер телефона был введен не валидно!");
        }
        gender = data[5].charAt(0);

        User user = new User(surname, name, lastname, date, numberPhone, gender);
        return user;
    }

    public static boolean validChackUser(User user) throws RuntimeException{
        if (!validNSL(user.getName())) {
            throw new RuntimeException("Имя было введено не валидно!");
        }
        else if (!validNSL(user.getSurname())) {
            throw new RuntimeException("Фамилия было введено не валидно!");
        }
        else if (!validNSL(user.getLastname())) {
            throw new RuntimeException("Отчество было введено не валидно!");
        }
        else if (!validDate(user.getDate())) {
            throw new RuntimeException("Дата была введена не валидно!");
        }
        else if (!validGander(user.getGender())) {
            throw new RuntimeException("Пол был введен не валидно!");
        }
        return true;
    }

    private static boolean validNSL(String n) {
        return n.length() > 2 && n.length() < 50;
    }
    private static boolean validDate(String date) {
        String regex = "^([0-2][0-9]|3[0-1])\\.(0[1-9]|1[0-2])\\.(\\d{4})$";
        return Pattern.matches(regex, date);
    }
    private static boolean validGander(char gender) {
        return gender == 'f' || gender == 'm';
    }
}

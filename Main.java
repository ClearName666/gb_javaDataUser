import java.io.Reader;
import java.util.Scanner;

import controller.UserFileManagger;
import controller.UserValid;
import view.ViewShoow;
import model.User;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        while (true) {
            ViewShoow.shoowResponse("\nВведите даные - Фамилия Имя Отчество дата _ рождения номер _ телефона пол\nend команда выхода\n");
            Scanner in = new Scanner(System.in);
            String data = in.nextLine();
            if (data == "end") break;
            try {
                User user = UserValid.GetChackValidStrUser(data);
                if (UserValid.validChackUser(user)) {
                    UserFileManagger.userWriteFile(user);
                }
                ViewShoow.shoowResponse("Сохраненеие данных прошло успешно!");

            } catch(RuntimeException e) {
                ViewShoow.shoowResponse(e.getMessage());
            }            
        }

    }

}
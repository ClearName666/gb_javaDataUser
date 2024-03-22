package model;
/*фамилия, имя, отчество - строки
дата _ рождения - строка формата dd.mm.yyyy
номер _ телефона - целое беззнаковое число без форматирования
пол - символ латиницей f или m. */

public class User {

    private String surname;
    private String name;
    private String lastname;
    private String date;
    private Long numberPhone;
    private char gender;

    public User(String surname, String name, String lastname, String date, Long numberPhone, char gender) {
        this.surname = surname;
        this.name = name;
        this.lastname = lastname;
        this.date = date;
        this.numberPhone = numberPhone;
        this.gender = gender;
    }

    public String getSurname() {
        return surname;
    }
    public String getName() {
        return name;
    }
    public String getLastname() {
        return lastname;
    }
    public String getDate() {
        return date;
    }
    public Long getNumberPhone() {
        return numberPhone;
    }
    public char getGender() {
        return gender;
    }
    @Override
    public String toString() {
        return getSurname() + " " + 
        getName() + " " + 
        getLastname() + " " + 
        getDate() + " " +
        String.valueOf(getNumberPhone()) + " " + 
        String.valueOf(getGender());
    }
}

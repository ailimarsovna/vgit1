package com.company;

public class Validator {
    public boolean checkAge(User user) {
        if (user.getAge() >= 18) return true;
        return false;
    }

    public boolean checkPassword(User user) {
        String passwd = user.getPassword();
        if (passwd.matches("(.*)\\p{Upper}(.*)") && passwd.matches("(.*)\\p{Lower}(.*)") &&
                passwd.matches("(.*)\\d(.*)") && passwd.matches("(.*)\\p{Punct}(.*)")) {
            return true;
        }
        return false;
    }


    public boolean checkDate(User user) {
        char[] date = new char[10];
        for (int i = 0; i < user.getDateOfBirth().length(); i++) {
            date[i] = user.getDateOfBirth().charAt(i);
        }
        if (user.getDateOfBirth().length() == 10 && date[2] == '/' && date[5] == '/'
                && Character.isDigit(date[0]) && Character.isDigit(date[1])
                && Character.isDigit(date[3]) && Character.isDigit(date[4])
                && Character.isDigit(date[6]) && Character.isDigit(date[7])
                && Character.isDigit(date[8]) && Character.isDigit(date[9])) return true;
        return false;
    }
}

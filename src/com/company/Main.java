package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("To create new user type 1");
        int n = sc.nextInt();
        while (n == 1) {
            System.out.println("Enter first name: ");
            String name = sc.next();
            System.out.println("Enter last name: ");
            String lastName = sc.next();
            System.out.println("Enter age: ");
            int age = sc.nextInt();
            System.out.println("Enter gender: ");
            String gender = sc.next();
            System.out.println("Enter password: ");
            String passwd = sc.next();
            System.out.println("Enter date of birth: ");
            String dateOfBirth = sc.next();

            User user = new User(name, lastName, age, gender, passwd, dateOfBirth);

            Validator validator = new Validator();

            if (!validator.checkAge(user)) System.out.println("age < 18");
            if (!validator.checkDate(user)) System.out.println("Incorrect date");
            if (!validator.checkPassword(user)) System.out.println("Incorrect password");

            n = 0;
        }
    }
}



package com.company;

public class Main {
    public static void main(String[] args) {
        String login = "Эллина";
        String password = "week";
        if ((args[0].equals(login)) && (args[1].equals(password))){
            System.out.println("Вас узнали. Добро пожаловать!");
        }
        else{
            System.out.println("Логин и пароль не распознаны. Доступ запрещен.");
        }
    }
}

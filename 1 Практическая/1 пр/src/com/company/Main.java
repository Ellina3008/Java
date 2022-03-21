package com.company;

public class Main {
    public static void main(String[] args) {
        if (args[0].isEmpty()){
            System.out.println("Hello world!");
        }
        else {
            System.out.println("Hello " + args[0] + "!");
        }
    }

}


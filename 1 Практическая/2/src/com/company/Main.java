package com.company;

public class Main {
    public static void main(String[] args) {
        int N = args.length;
        if (N == 0){
            System.out.println("Вы не передавли параметров");
        }
        else{
            System.out.println("Вы ввели " + N + " параметров");
        }
    }
}

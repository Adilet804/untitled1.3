package com.company;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println(helloWorld(20,30));
        System.out.println(helloWorld(25,23));
        System.out.println(helloWorld(40,27));
        System.out.println(helloWorld(35,30));
        System.out.println(helloWorld(43,28));
        System.out.println(generateRandomAge());
    }

    public static String helloWorld(int age, int temp) {
        if (age >= 20 && age <= 40 && temp >= -20 && temp <= 30) {
            return ("Можно идти гулять");
        } else if (age < 20 && temp >= 0 && temp < 28) {
            return ("Можно идти гулять");
        } else if (age > 45 && temp > -10 && temp < 25) {
            return ("Можно идти гулять");
        } else {
            return ("Остовайтесь дома");
        }
    }
    public static int generateRandomAge() {
        Random random = new Random();
        int age = random.nextInt(90);
        return age;


    }
}
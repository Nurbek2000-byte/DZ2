package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println(prognoz(generateRandomAge(), generateRandomTemp()));
        System.out.println(prognoz(generateRandomAge(), generateRandomTemp()));
        System.out.println(prognoz(generateRandomAge(), generateRandomTemp()));
        System.out.println(prognoz(generateRandomAge(), generateRandomTemp()));
        System.out.println(prognoz(generateRandomAge(), generateRandomTemp()));
        System.out.println(generateRandomAge());

    }

    public static String prognoz(int age, int temp) {
        if (age > 20 && age < 45 && temp > -20 && temp < 30) {
            return "Можно идти гулять";
        } else if (age < 20 && temp > 0 && temp < 28) {
            return "Можно идти гулять2";
        } else if (age > 45 && temp > -10 && temp < 25) {
            return "Можно иди гулять3";
        } else {
            return "Оставайтесь дома";
        }
    }

    public static int generateRandomAge() {
        Random random = new Random();
        int Age = random.nextInt(99);
        return Age;

    }


    public static int generateRandomTemp() {
        Random random = new Random();
        int temp = random.nextInt(99);
        return temp;
    }
}
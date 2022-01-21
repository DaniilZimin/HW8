package com.company;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        leapYear(2000);
        versionOs(0, 2022);
        estimatedDeliveryTime(48);
        String abc = "aabccddefgghiijjkk";
        searchForADuplicate(abc);
        searchForADuplicate2(abc);
        int[] number = {3, 2, 1, 6, 5, 4, 3, 4, 10};
        flippingAnArray(number);
    }

    // Задание 1
    public static void leapYear(int year) {
        boolean leapYear = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
        if (leapYear) {
            System.out.println(year + " год является високосным!");
        } else {
            System.out.println(year + " год не является високосным!");
        }
    }

    // Задание 2
    public static void versionOs(int clientOS, int clientDeviceYear) {
        int yearOfSmartphonesImprovement = LocalDate.now().getYear();
        if (clientOS == 0) {
            if (clientDeviceYear < yearOfSmartphonesImprovement) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else if (clientOS == 1 && clientDeviceYear < yearOfSmartphonesImprovement) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    // Задание 3
    public static int estimatedDeliveryTime(int deliveryDistance) {
        int estimatedDeliveryTime = 1;
        if (deliveryDistance <= 20) {
            return estimatedDeliveryTime;
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            return estimatedDeliveryTime + 1;
        } else {
            return estimatedDeliveryTime + 2;
        }
    }

    // Задание 4
    public static void searchForADuplicate(String abc) {
        char[] symbols = abc.toCharArray();
        char a = 0;
        for (int i = 0; i < symbols.length; i++) {
            for (int j = symbols.length - 1; j >= 0; j--) {
                if (j != i) {
                    if (symbols[j] == symbols[i] && symbols[i] != a) {
                        a = symbols[i];
                        System.out.println("Найден дубль символа: " + symbols[i]);
                        return;
                    }
                }
            }
        }
        System.out.println("Дублей не найдено!");
    }

    //Задание 4 второй вариант
    public static void searchForADuplicate2(String abc){
        char[] symbols = abc.toCharArray();
        for (int i = 0; i < symbols.length - 1; i++) {
            if (symbols[i] == symbols[i + 1]){
                System.out.println("Найден дубль символа: " + symbols[i]);
                return;
            }
        }
        System.out.println("Дублей не найдено!");
    }


    // Задание 5
    public static void flippingAnArray(int[] numbers) {
        for (int i = 0, j = numbers.length - 1; i < numbers.length / 2; i++, j--) {
            int c = numbers[j];
            numbers[j] = numbers[i];
            numbers[i] = c;
        }
    }
}

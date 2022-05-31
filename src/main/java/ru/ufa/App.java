package ru.ufa;

import java.util.Scanner;

class Main {

    public static final double PI = 3.14;

    public static void main(String[] args) {
//        System.out.println("Программа расчета площади круга и длины окружности");
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите радиус окружности в сантиметрах:");
//        int radius = scanner.nextInt();
        int radius = 4;
        int area = calculateCircleArea(radius);
        int length = calculateCircleLength(radius);
        System.out.println("Площадь круга: " + area + " см.кв.");
        System.out.println("Длина окружности: " + length + " см.");
    }

    public static int calculateCircleArea(int radius) {
        return (int) (PI * radius * radius);
    }

    public static int calculateCircleLength(int radius) {
        return (int) (2 * PI * radius);
    }

    public static String theCapitalOfGreatBritian() {
        return "London";
    }
}
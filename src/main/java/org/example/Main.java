package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        int inp = 0;
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\\R");
        System.out.println("Введите число больше 7 (7 не входит) : ");
        if (sc.hasNextInt()) {
            inp = sc.nextInt();
            if (inp > 7) {
                System.out.println("Привет");
            }
        } else {
            System.out.println("Извините, но это число не подходит");
        }

        String name = "";
        System.out.println("Введите Имя  (с учетом Регистра): ");
        if (sc.hasNext()) {
            name = sc.next();
            System.out.println(name);
        }
        if (name.equals("Вячеслав")) {
            System.out.println("Привет, " + name);

        } else {
            System.out.println("Нет такого имени");
        }


        String newString = "";
        System.out.println("Введите массив целых чисел с разделителем ',' : ");

        if (sc.hasNext()) {
            newString = sc.next();
        }
        String[] arrStr = newString
                .replaceAll(" ", "")
                .replaceAll("[a-zA-Zа-яА-Я_]", "")
                .replaceAll("\\]", "").replaceAll("\\[", "")
                .replaceAll("[;!#$%&<>:|]", ",")
                .split(",");
        int[] arr = new int[arrStr.length];
        int counterWrite = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arrStr == null || arrStr.equals("")) {
                System.out.println("Введенный массив пустой или не содержит целых чисел");
            } else {
                try {
                    arr[counterWrite] = Integer.valueOf(arrStr[i]);
                    counterWrite++;
                } catch (NumberFormatException e) {
                    System.out.println("Введенный массив содержит символы, включая пробел, дробные числа или он не содержит чисел. допустим только массив целых чисел");
                }
            }
        }

        for (int i = 0; i < counterWrite; i++) {
            if (arr[i] % 3 == 0) {
                System.out.println(arr[i]);
            }
        }
    }

}
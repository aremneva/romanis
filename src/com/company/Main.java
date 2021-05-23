package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Roman rom = new Roman();
        int num=1;
        System.out.println("Перевести:\n 1. Cyrillic -> Latin \n 2. Latin -> Cyrillic \n Enter 1 or 2:");
        Scanner scan = new Scanner(System.in);
        do{
            num = scan.nextInt();
            if (!(num==1||num==2)){
                System.out.println("Неверный ввод");
            }
        }
        while(!(num==1 || num==2));

        System.out.println("Введите текст:");
        scan = new Scanner(System.in);
        String text = scan.nextLine();

        if (num == 1){
            System.out.println(rom.CyrillicToLatin(text));
        }
        if (num == 2){
            System.out.println(rom.LatinToCyrillic(text));
        }
    }
}

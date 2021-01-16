package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        Scanner b = new Scanner(System.in);
        int pilih1, pilih2;
        int nilai;

        konverter c = new konverter();



        System.out.println("==================");
        System.out.println("||     Awal     ||");
        System.out.println("==================");
        System.out.println("|| 1. KiloByte  ||");
        System.out.println("|| 2. MegaByte  ||");
        System.out.println("|| 3. GigaByte  ||");
        System.out.println("==================");
        System.out.print("Masukkan Pilihan : ");
        pilih1 = a.nextInt();
        c.setPilih1(pilih1);

        System.out.println();

        System.out.print("Masukkan Nilai = ");
        nilai = b.nextInt();
        c.setHasil(nilai);

        System.out.println();

        System.out.println("==================");
        System.out.println("||   Konversi   ||");
        System.out.println("==================");
        System.out.println("|| 1. KiloByte  ||");
        System.out.println("|| 2. MegaByte  ||");
        System.out.println("|| 3. GigaByte  ||");
        System.out.println("==================");
        System.out.print("Masukkan Pilihan : ");
        pilih2 = a.nextInt();
        c.setPilih2(pilih2);

        c.convertion();

    }
}

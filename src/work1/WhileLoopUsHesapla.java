package work1;

import java.util.Scanner;

public class WhileLoopUsHesapla {

    public static void main(String[] args) {
/*
        Kullanicidan bir sayi ve hesaplamak istedigi ussunu isteyin. While loop
        kullanarak verilen sayinin istenen ussunu hesaplayip yazdiran bir method
        olusturun.

 */
        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen sayı girin : ");
        int sayi = scan.nextInt();

        System.out.println("Üs sayısını girin : ");
        int usSayi = scan.nextInt();

        int a = 1;
        int carp = 1;

// döngü üssayısı şartı ile üs sayının kendisi kadar döngü dönsün ve sayi kendini üssayı kadar çarpıp döngüyü tamamlasın

        while (usSayi!=0){


                carp = carp*sayi*a;
                 usSayi--;

        }
        System.out.println(carp);




    }



}

package work1;

import java.util.Scanner;

public class MukemmelSayi {

    public static void main(String[] args) {

 /* Perfect Number (Mukemmel sayi)
      Kullanici tarafindan bir sayiya kadar olan sayilarin,
      mukemmel olup olmadigini bulan method yaziniz.
      Mukemmel sayi : bir sayinin kendisi haric bolenlerinin toplami,
      kendisine esitse o sayi mukemmeldir. (1+2+3 = 6 = 6 (Mukemmel))
      ORNEK: (6, 28, 496, 8128)
      INPUT      : 6
      OUTPUT     :  1,2,3
    */


        Scanner scan = new Scanner(System.in);
        System.out.println("sayı girin : ");
        int   girilenSayi=scan.nextInt();

        int bolenSayilarinToplami = 0;
        int toplam=0;
        int bolenSayi=1;

        while (bolenSayi<girilenSayi){


            if (bolenSayi<girilenSayi) {

                bolenSayi = girilenSayi / bolenSayi;
                System.out.println(bolenSayi);

                bolenSayilarinToplami += bolenSayi;
            }




    }
        System.out.println(bolenSayilarinToplami);
/*
 if ( toplam==girilenSayi){

            System.out.println("girilen sayı : " + girilenSayi + " toplam : " + toplam + " girilen " + girilenSayi + " sayısı mükemmel sayıdır...");
        }






        if (toplam!=girilenSayi){

            System.out.println("mükemmel sayı değil!");
        }
 */




    }


}

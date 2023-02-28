package work1;

import java.util.Scanner;

public class forloop {

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
        int girilenSayi = scan.nextInt();

        int bolenSayi = 1;
        int bolenSayiToplami = 0;


        for (int i = bolenSayi; bolenSayi < girilenSayi; bolenSayi++) {

            if (girilenSayi % bolenSayi == 0 ) {

                bolenSayiToplami += bolenSayi;


            }
        }
        if (girilenSayi == bolenSayiToplami) {

            System.out.println("girilen sayı : " + girilenSayi + " bölen sayılar toplamı : " + bolenSayiToplami + " mükemmel sayıdır");

        } else
        System.out.println(girilenSayi + " mükemmel sayı değildir");
    }
}

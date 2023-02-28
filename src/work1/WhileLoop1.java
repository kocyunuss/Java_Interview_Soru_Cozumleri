package work1;

import java.util.Scanner;

public class WhileLoop1 {

    public static void main(String[] args) {

    /*    Kullanicidan Kullanicidan sifre
        isteyin asagidaki sartlari saglamayan
        sifrelerde hatalari yazdirip,
                kullanicinin yeni sifre girmesi isteyin
        Gecerli bir sifre yazilincaya kadar bu
        islemi tekrar edin gecerli sifre
        yazilinca “sifreniz basari ile
        kaydedildi” yazdirin
        sartlar :
        - sifrenin ilk karakteri kucuk harf
        olmali
                - sifrenin son karakteri sayi olmali

*/


        Scanner scan = new Scanner(System.in);
       String sifre = "";
       boolean sifreDogruMu = false;
        char ilkKarakter ;
        char sonKarakter ;


        while (!sifreDogruMu) {
            System.out.println("Oluşturmak istediğiniz şifrenizi girin :");
             sifre = scan.nextLine();
            ilkKarakter = sifre.charAt(0);
            sonKarakter = sifre.charAt(sifre.length() - 1);

            if (ilkKarakter < 'a' || ilkKarakter > 'z') {

                System.out.println("ilk karakter küçük harf ile başlamalı");

            } else if (sonKarakter < '0' || sonKarakter > '9') {

                System.out.println("son karakter rakam ile bitmeli");
            } else {

                System.out.println("Şifre başarı ile kaydedildi : ");
                sifreDogruMu=true;

            }


        }
    }
}
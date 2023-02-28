package work1;

import java.util.Scanner;

public class ornek1 {

    public static void main(String[] args) {

/*
          Kullanicidan toplanmak uzere sayilar isteyin
             sayi adedi 10'u gecerse veya toplam 500 'u gecerse
             bu kadar sayi yeter
             ".... adet sayi girdiniz , toplami..." yazdirin

 */

        Scanner scan = new Scanner(System.in);

        int girilenSayi;

        int toplam = 0;
        int sayiadedi = 0;

        while (toplam < 500) {
            System.out.println("lütfen sayı girin");
            girilenSayi = scan.nextInt();
            toplam += girilenSayi;

            if (sayiadedi < 10) {

                sayiadedi++;
            }
        }

        System.out.println(sayiadedi + " adet sayı ,  toplamları : " + toplam );


    }
}
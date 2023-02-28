package work1;

import java.util.Scanner;

public class DoWhileLoop1 {


    public static void main(String[] args) {


        // Kullanicidan toplanmak uzere sayilar alin
        // kullaniciya bitirmek icin 0'a basmasini soyleyin
        // kullanici 0'a bastiginda
        // 0 haric kac sayi girildigini ve toplamlarini yazdirin


        Scanner scan = new Scanner(System.in);

        int girilenSayi=0;
        int toplam=0;
        int sayiAdedi=0;

        do {
            System.out.println("sayı girin : ");
            girilenSayi= scan.nextInt();

       if (girilenSayi!=0){

         toplam+=girilenSayi;
         sayiAdedi++;


      }
        }while (girilenSayi!=0);



        System.out.println("girilen sayı adedi : " + sayiAdedi + " toplanan sayı : " + toplam);



    }

}

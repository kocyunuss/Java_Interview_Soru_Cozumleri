package work1;

import java.util.Scanner;

public class whileSıfırileDurdur {


    public static void main(String[] args) {

//        While loop kullanarak 2 basamakli 7 ile bolunebilen pozitif tamsayilari
        //      yazdirin.

/*
        int sayi = 10;
        while (sayi<100){

            if (sayi%7==0){

                System.out.println(sayi);
            }
               sayi++;
        }


*/


        // While loop kullanarak kullanicidan alinan sayinin rakamlar toplamini bulun.

/*
           Scanner scan = new Scanner(System.in);
        System.out.println("toplanacak sayıları girin : ");



        System.out.println("Bir sayi girin");
        int girilenSayi = scan.nextInt();
        int birlerBasamagi = 0;
        int toplam=0;


        while (girilenSayi>0){

           birlerBasamagi =girilenSayi%10;
            System.out.println("birler : " +birlerBasamagi);
           toplam+=birlerBasamagi;
            System.out.println("Toplam : " + toplam);
           girilenSayi/=10;
            System.out.println("girilensayi" +girilenSayi);



        }
        System.out.println("Toplam : " + toplam);


*/

        //  While loop kullanarak verilen bir String’i terse cevirip, bu halini bize
        // donduren bir method olusturun.

/*
       String isim = "Ahmet";

       String ters ="";
       int count =isim.length()-1;
       boolean isValid = true;
     while (count>=0){
        ters += isim.charAt(count);
        count--;
*/
        // }
//      for(int i = isim.length()-1; i>=0; i--){
//          ters += isim.charAt(i);
//      }
        //      System.out.println(ters);


 /*   Kullanicidan toplanmak uzere pozitif tamsayilar isteyin
 Kullaniciya bitirmek
    istediginde 0'a basmasini soyleyin
    Kullanici bitirmek istediginde toplam kac adet pozitif tam sayi girdiginive
    bunlarin toplaminin kac oldugunu yazdirin
    Kullanici negatif sayi girerse "negatif sayi kullanamazsiniz " yazdirin bu
    negatif sayiyi sayi adedine ve toplama eklemeyin

*/


        Scanner scan = new Scanner(System.in);

        int sayi =-1;

         int sayiAdedi = 0;
        int toplam = 0;

       while (sayi!=0){
           System.out.println("Programdan cıkmak için sıfıra basınız.");
           System.out.println("sayı girin : ");
           sayi = scan.nextInt();
           if (sayi>-1){

               toplam+=sayi;
               sayiAdedi++;
           } else  {
               System.out.println("negatif sayı giremezsin !");

           }


       }

        System.out.println("sayıadedi : " +( sayiAdedi-1) + " toplam : " + toplam);




    }

}
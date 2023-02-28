package work1;

import java.util.Scanner;

public class WhileLoop {

    public static void main(String[] args) {
       // Kullanicidan toplanmak uzere sayilar isteyin toplam 500 olur veya gecerse
        // toplami yazdirin.

        Scanner scan = new Scanner(System.in);


        int toplam = 0;
        int sayiAdedi = 0;



        while (toplam<=500) {
            System.out.println("lütfen toplanmak üzere sayı girin");
            int  gelenSayi = scan.nextInt();

            toplam+=gelenSayi;
            sayiAdedi++;



            System.out.println("girilen sayı adedi " + sayiAdedi + " ve girilen sayıların toplamı : " + toplam);

        }




        String[] sehir = {"Trabzon","İstanbul"};






    }


}
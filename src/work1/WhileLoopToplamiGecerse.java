package work1;

import java.util.Scanner;

public class WhileLoopToplamiGecerse {

    public static void main(String[] args) {

  //      Kullanicidan toplanmak uzere sayilar isteyin toplam 500 olur veya gecerse
    //    toplami yazdirin.


        Scanner scan = new Scanner(System.in);

        int girilenSayi;
        int toplam = 0;

    while (toplam<500){
        System.out.println("sayı girin : ");
        girilenSayi = scan.nextInt();
        toplam+=girilenSayi;




    }
        System.out.println("toplam : " + toplam);








    }


}

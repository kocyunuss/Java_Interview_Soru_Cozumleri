package work1;

import java.util.Scanner;

public class AsalSayiMethod {


    public static void main(String[] args) {
    //    Kullanicidan toplanmak uzere sayilar isteyin toplam 500 olur veya gecerse
      //   toplami yazdirin.


    /*  Scanner scan = new Scanner(System.in);
        System.out.println("Şifre girin : ");
        String sifre = scan.nextLine();

        int i = 0;
        while (i<sifre.length()){

            if (sifre.charAt(0)<'a' || sifre.charAt(0)>'z'){


            }
            System.out.println("şifre küçük harf ile başlayacak !");

        }
*/



        char ch = 'a';

        while(ch<'d') {

            System.out.print(ch + " ");

            ch++;

        }


        for(char i='a'; i<'d'; i++) {

            System.out.print(i + " ");

        }


        System.out.print('a' + " " +  'b' + " " + 'c' + " ");

        System.out.print('a' + 'b' + 'c');
    }


}










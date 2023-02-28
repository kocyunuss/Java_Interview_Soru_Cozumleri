package work1;

public class DoWhileLoop {


    public static void main(String[] args) {

         /*
               While loop'da bitis sarti kontrolu her zaman body'den bir fazla calisir
               while loop'da kullanicidan alacagimiz degerlere once bizim deger atamamiz gerekir
               bu da bazan hatalara sebep olur
         */





        int sayi = -10;
        int toplam = 0;

        while (sayi>0){


            toplam+=sayi*sayi;
            sayi--;

        }

        System.out.println("while ile toplam : " + toplam);


sayi = -10;
toplam = 0;

do {

    toplam+=sayi;
    sayi--;


}while (sayi>0);

        System.out.println("do while ile toplam : " + toplam);

    }


}

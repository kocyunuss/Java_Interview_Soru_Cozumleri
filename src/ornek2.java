import java.util.Scanner;

public class ornek2 {

    public static void main(String[] args) {

/*  soru1: Check if the integer is an Armstrong numbers to 4 digit numbers(4 digit-> exclusive)
        Armstrong sayi:herhangi bir 3 basamakli sayinin rakamlarinin kupleri toplami o sayiyi veriyorsa sayi  Armstrong sayidir
            (0, 1, 153, 370, 371, 407)
            153 = 1*1*1 + 5*5*5 + 3*3*3 = 153
            370 = 3*3*3 + 7*7*7 + 0*0*0 = 370
          soru2: Birden baslayarak girilen sayıya kadar her bir tamsayının amstrong sayı olup olmadıgını
          gösteren program yazınız */


        Scanner scan = new Scanner(System.in);



        int sonBasamagi ;
        int ortaBasamagi;
        int ilkBasamagi;

        int kupAl1;
        int kupAl2;
        int kupAl3;

        int kupleriTopla;
            int girilenSayi = 99;
        while (girilenSayi<1000) {

            System.out.println("sayı girin : ");
            girilenSayi = scan.nextInt();
            sonBasamagi = girilenSayi % 10;
            kupAl1 = sonBasamagi * sonBasamagi * sonBasamagi;

            System.out.println("son basamak " + sonBasamagi);

            ortaBasamagi = (girilenSayi / 10) % 10;
            kupAl2 = ortaBasamagi * ortaBasamagi * ortaBasamagi;
            System.out.println("orta basamak : " + ortaBasamagi);

            ilkBasamagi = ((girilenSayi / 10) / 10) ;
            kupAl3 = ilkBasamagi * ilkBasamagi * ilkBasamagi;
            System.out.println("ilk basamak : " + ilkBasamagi);

            kupleriTopla = kupAl1 + kupAl2 + kupAl3;
            if (girilenSayi == kupleriTopla) {


                System.out.println("girilen sayı : " + girilenSayi + "  Amostrong sayı : " + kupleriTopla);

            }else {
                System.out.println("girilen sayı " + girilenSayi +  "toplanan sayı " + kupleriTopla+"amostrong sayı Değil ! ");
            }

        }



    }


}

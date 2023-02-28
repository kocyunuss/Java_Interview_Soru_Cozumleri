package work1;

public class RakamlarToplamiMethod {

// verilen pozitif bir tamsayinin
    // rakamlar toplamini bize döndüren method olusturun


    public static int rakamlarToplaminiBul(int VerilenSayi){


        int sayi = VerilenSayi;
        int birlerBasamagi = 0;
        int rakamlarToplami = 0;


        int basamakSayisi = (sayi + "").length();

        for (int i = 1; i<=basamakSayisi; i++){

            birlerBasamagi=sayi%10;
            rakamlarToplami+=birlerBasamagi;
            sayi/=10;

        }
        return rakamlarToplami;




    }








}

package Giris;

import java.util.Scanner;

public class NotOrtalamasi {
    public static void main(String[] args) {

        //Değişkenleri oluşturuyoruz.
        int mat, fizik, kimya,turkce, tarih,muzik;


        // Scanner sınıfı tamnımlandı
        Scanner a = new Scanner(System.in);

        // kullanıcıdan değerleri al
        System.out.println("Matematik Notunuz: ");
        mat = a.nextInt();
        // System.out.println (mat);

        System.out.println("Fizik Notunuz: ");
        fizik = a.nextInt();
        //System.out.println (fizik);

        System.out.println("Kimya Notunuz: ");
        kimya = a.nextInt();
        //System.out.println (kimya)

        System.out.println("Türkçe Notunuz: ");
        turkce = a.nextInt();
        // System.out.println (turkce);

        System.out.println("Tarih  Notunuz: ");
        tarih = a.nextInt();
        //System.out.println (tarih);

        System.out.println("Müzik Notunuz: ");
        muzik = a.nextInt();
        //System.out.println (muzik);

        int average=(mat+fizik+kimya+tarih+turkce+muzik)/6;
        System.out.println("Genel Not Ortalamanız:"+ average);

        boolean result= average >=60;
        String str =  result ?"Tebrikler ,Sınıfı geçtiniz . ": "Üzgünüz Sınıfta kaldınız" ;
        System.out.println(str);



    }
}

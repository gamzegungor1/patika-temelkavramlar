package Giris;
import java.util.Scanner;
public class KdvHesaplama {
  public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      System.out.print("Tutarı Girinia: ");
      double price = input.nextDouble();

      System.out.print("Lütfen Kdv Oranı Giriniz(%): ");
      double rate = input.nextDouble();
      double kdv1=1.08;
      double kdv2=1.18;


      // KDV tutarını hesapla
      double kdv_tutar = price * (rate / 100);
      // Toplam fiyatı hesapla
      double toplam_tutar = price + kdv_tutar;

      // Sonuçları ekrana yazdır
      System.out.println("KDV amount: " + kdv_tutar);
      System.out.println("Total price: " + toplam_tutar);


      if      (price>=1000) {
          System.out.println("Ürünün KDV'siz Fiyatı: "+price+" TL");
          System.out.println("Ürüne Uygulanan KDV Fiyatı: "+((price*kdv1)-price)+" TL");
          System.out.println("Ürünün KDV Dahil Fiyatı: "+(price*kdv1)+(" TL"));
      }
      else if (price<1000) {
          System.out.println("Ürünün KDV'siz Fiyatı: "+price+" TL");
          System.out.println("Ürüne Uygulanan KDV Fiyatı: "+((price*kdv2)-price)+" TL");
          System.out.println("Ürünün KDV Dahil Fiyatı: "+price*kdv2+" TL");

      }
  }




}

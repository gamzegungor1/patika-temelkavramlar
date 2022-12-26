package Giris;

import java.util.Scanner;

public class Taksimetre {
    public static  void main(String [] args){
        int km;
        double perKm= 2.20 , total, startPrice=10;

        Scanner inp =new Scanner(System.in);
        System.out.println("Mesafeyi km cinsinden giriniz :");
        km =inp.nextInt();
        total =(km+perKm);
        total +=startPrice;
        total =(total<20) ? 20 :total;
        System.out.println("Toplam tutar" + total);



    }
}

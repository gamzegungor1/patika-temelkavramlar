package Giris;

import java.util.Scanner;

public class Hipotenus {
   /*public static void main(String[] args){
       //Değikenlerimizi oluşturalım
       int a, b;
       double c;
       // Kullanıcıdan vverileri alalım
       Scanner k = new Scanner(System.in);

       System.out.print("1.Kenarı Giriniz:");

       a = k.nextInt();
       System.out.print("2. Kenarı Giriniz");
       b = k.nextInt();
//matg.sqrt(); bir sayının karekökünü almamızı sağlıyor.
       c= Math.sqrt( (a*a)+(b*b));
       System.out.println("Hipotenüs: " +c);


   }*/

    public static void main(String[] args){
        int kenar1,kenar2,kenar3;
        int u;
        int ucgen_alan;




        Scanner alan = new Scanner(System.in);
        System.out.print("1.Kenarı Giriniz:");
        kenar1 = alan.nextInt();

        System.out.print("1.Kenarı Giriniz:");
        kenar2 = alan.nextInt();

        System.out.print("1.Kenarı Giriniz:");
        kenar3 = alan.nextInt();

        u = (kenar1 + kenar2 + kenar3) / 2;



        ucgen_alan =(int)Math.sqrt(u*(u-kenar1)*(u-kenar2 )*(u - kenar3));
        System.out.println("Üçgenin alanı = " + ucgen_alan);











    }


}

/*
 * Ad Soyad: [Adını Soyadını Yaz]
 * Ogrenci No: [Öğrenci Numaran]
 * Tarih: 30.10.2025
 * Aciklama: Görev 1 - Ogrenci Bilgi Sistemi
 */

import java.util.Scanner;

public class OgrenciBilgi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== OGRENCI BILGI SISTEMI ===");

        System.out.print("Adinizi girin: ");
        String ad = input.nextLine();

        System.out.print("Soyadinizi girin: ");
        String soyad = input.nextLine();

        System.out.print("Ogrenci numaraniz: ");
        int numara = input.nextInt();

        System.out.print("Yasiniz: ");
        int yas = input.nextInt();

        System.out.print("GPA (0.00-4.00): ");
        double gpa = input.nextDouble();

        System.out.println("\n=== OGRENCI BILGI SISTEMI ===");
        System.out.printf("Ad Soyad: %s %s\n", ad, soyad);
        System.out.printf("Ogrenci No: %d\n", numara);
        System.out.printf("Yas: %d\n", yas);
        System.out.printf("GPA: %.2f\n", gpa);

        if (gpa >= 2.50)
            System.out.println("Durum: Basarili Ogrenci");
        else
            System.out.println("Durum: Gelisim Gerekli");

        input.close();
    }
}

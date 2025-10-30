/*
 * Ad Soyad: [Adını Soyadını Yaz]
 * Ogrenci No: [Öğrenci Numaran]
 * Tarih: 30.10.2025
 * Aciklama: Görev 3 - Maas Hesaplama Sistemi
 */

import java.util.Scanner;

public class MaasHesap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final double SGK_ORANI = 0.14;
        final double GELIR_VERGISI_ORANI = 0.15;
        final double DAMGA_VERGISI_ORANI = 0.00759;

        System.out.println("====================================");
        System.out.println("MAAS BORDROSU");
        System.out.println("====================================");

        System.out.print("Calisan adi soyadi: ");
        String adSoyad = input.nextLine();

        System.out.print("Aylik brut maas (TL): ");
        double brutMaas = input.nextDouble();

        System.out.print("Haftalik calisma saati: ");
        int haftalikSaat = input.nextInt();

        System.out.print("Mesai saati sayisi: ");
        int mesaiSaati = input.nextInt();

        double mesaiUcreti = (brutMaas / 160) * mesaiSaati * 1.5;
        double toplamGelir = brutMaas + mesaiUcreti;

        double sgk = toplamGelir * SGK_ORANI;
        double gelirVergisi = toplamGelir * GELIR_VERGISI_ORANI;
        double damgaVergisi = toplamGelir * DAMGA_VERGISI_ORANI;
        double toplamKesinti = sgk + gelirVergisi + damgaVergisi;

        double netMaas = toplamGelir - toplamKesinti;

        double kesintiOrani = (toplamKesinti / toplamGelir) * 100;
        double saatlikNetKazanc = netMaas / 176.0;
        double gunlukNetKazanc = netMaas / 22.0;

        System.out.println("\nGELIRLER:");
        System.out.printf("Brut Maas : %.2f TL\n", brutMaas);
        System.out.printf("Mesai Ucreti (%d saat) : %.2f TL\n", mesaiSaati, mesaiUcreti);
        System.out.println("------------------------");
        System.out.printf("TOPLAM GELIR : %.2f TL\n\n", toplamGelir);

        System.out.println("KESINTILER:");
        System.out.printf("SGK Kesintisi (%.1f%%) : %.2f TL\n", SGK_ORANI * 100, sgk);
        System.out.printf("Gelir Vergisi (%.1f%%) : %.2f TL\n", GELIR_VERGISI_ORANI * 100, gelirVergisi);
        System.out.printf("Damga Vergisi (%.1f%%) : %.2f TL\n", DAMGA_VERGISI_ORANI * 100, damgaVergisi);
        System.out.println("------------------------");
        System.out.printf("TOPLAM KESINTI : %.2f TL\n\n", toplamKesinti);

        System.out.printf("NET MAAS : %.2f TL\n", netMaas);
        System.out.println("====================================");
        System.out.printf("Kesinti Orani : %.1f%%\n", kesintiOrani);
        System.out.printf("Saatlik Net Kazanc : %.2f TL\n", saatlikNetKazanc);
        System.out.printf("Gunluk Net Kazanc : %.2f TL\n", gunlukNetKazanc);

        input.close();
    }
}

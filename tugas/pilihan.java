package p_10.tugas;

import javax.swing.*;

public class pilihan {
    public static void main(String[] args) {
        int pilih;
        boolean menu = true;
        while (menu) {

            System.out.println("===PILIHAN====");
            System.out.println(
                    "\n 1. Bintang Rata Kiri \n 2. Bintang Rata Kanan \n 3. Belah Ketupat \n 4. Rata Kiri dan Kanan \n 5. Kotak (Tengahnya kosong) \n 6. Bintang Sama Sisi (Tengahnya kosong) \n 7. Segitiga Sama Sisi Penuh \n 8. Segitiga Kebalik \n 9. Bintang Angka 8 \n 10. Segitiga Plus \n 11. Trapesium \n 12. Triangular 1,2,3");
            pilih = Integer.parseInt(JOptionPane.showInputDialog(
                    "Pilihan : \n 1. Bintang Rata Kiri \n 2. Bintang Rata Kanan \n 3. Belah Ketupat \n 4. Rata Kiri dan Kanan \n 5. Kotak (Tengahnya kosong) \n 6. Bintang Sama Sisi (Tengahnya kosong) \n 7. Segitiga Sama Sisi Penuh \n 8. Segitiga Kebalik \n 9. Bintang Angka 8 \n 10. Segitiga Plus \n 11. Trapesium \n 12. Triangular 1,2,3 \n\n Masukan pilihan :"));
            System.out.println("==============");

            switch (pilih) {
                case 1: // Bintang Rata Kiri
                    int bintang;

                    bintang = Integer.parseInt(JOptionPane.showInputDialog("masukkan banyaknya bintang segitiga = "));
                    for (int i = 1; i <= bintang; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println("");
                    }
                    break;
                case 2: // Bintang Rata Kanan
                    int bintangrk;

                    bintangrk = Integer.parseInt(JOptionPane.showInputDialog("Masukkan jumlah Bintang = "));
                    for (int i = 1; i <= bintangrk; i++) {
                        // membuat spasi
                        for (int j = bintangrk - 1; j >= i; j--) {
                            System.out.print(" ");
                        }
                        // membuat bintangrk
                        for (int k = 1; k <= i; k++) {
                            System.out.print("*");
                        }
                        System.out.println("");
                    }
                    break;
                case 3: // Belah Ketupat
                    int BintangBK;

                    BintangBK = Integer.parseInt(JOptionPane.showInputDialog("Masukkan jumlah bintang = "));

                    for (int i = 1; i <= BintangBK - 1; i++) {
                        for (int j = BintangBK - 1; j >= i; j--) {
                            System.out.print(" ");
                        }
                        for (int k = 1; k <= i; k++) {
                            System.out.print("*");
                        }
                        for (int l = 1; l <= i - 1; l++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    for (int i = 1; i <= BintangBK; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print(" ");
                        }
                        for (int m = BintangBK; m >= i; m--) {
                            System.out.print("*");
                        }
                        for (int n = BintangBK - 1; n >= i; n--) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 4: // Rata Kiri dan Kanan
                    int bintangRKK;

                    bintangRKK = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Jumlah bintang = "));

                    for (int i = 0; i < bintangRKK; i++) {
                        for (int j = 0; j < bintangRKK; j++)
                            System.out.print("*");
                        System.out.println();
                    }
                    break;
                case 5: // Kotak (Tengahnya kosong)
                    int panjang, lebar;

                    panjang = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Jumlah/panjang Bintang = "));
                    lebar = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Jumlah/Lebar Bintang = "));

                    for (int i = 1; i <= panjang; i++) {
                        for (int j = 0; j <= lebar; j++) {
                            if (i == 1 || i == panjang || j == 0 || j == lebar) {
                                System.out.print("*");
                            } else {
                                System.out.print(" ");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case 6: // Bintang Sama Sisi (Tengahnya kosong)
                    int bintangBSS;

                    bintangBSS = Integer.parseInt(JOptionPane.showInputDialog("Masukkan jumlah bintang = "));

                    int l = bintangBSS;
                    int m = bintangBSS - 1;

                    for (int i = 1; i <= bintangBSS; i++) {
                        int j = 1;
                        for (int k = 1; k <= l; k++) {
                            if (j <= m) {
                                System.out.print(" ");
                                j++;
                            } else {
                                if (k == j || k == l || m == 0) {
                                    System.out.print("*");
                                } else
                                    System.out.print(" ");
                            }
                        }
                        m--;
                        l++;
                        System.out.print("\n");
                    }
                    break;
                case 7: // Segitiga Sama Sisi Penuh
                    int bintangPenuh;

                    bintangPenuh = Integer.parseInt(JOptionPane.showInputDialog("Masukkan jumlah bintang = "));

                    for (int i = 1; i <= bintangPenuh; i++) {
                        for (int j = bintangPenuh - 1; j >= i; j--) {
                            System.out.print(" ");
                        }
                        for (int k = 1; k <= i; k++) {
                            System.out.print('*');
                        }
                        for (int o = 1; o <= i - 1; o++) {
                            System.out.print('*');
                        }
                        System.out.println();
                    }
                    break;
                case 8: // Segitiga Kebalik
                    int bintangST;
                    bintangST = Integer.parseInt(JOptionPane.showInputDialog("masukkan jumlah bintang = "));

                    int a, b, c;

                    for (a = 0; a <= bintangST; a++) {
                        for (b = 0; b <= a; b++) {
                            System.out.print(" ");
                        }
                        for (c = 0; c >= (a - bintangST); c--) {
                            System.out.print("*");
                        }
                        for (c = 0; c < (bintangST - a); c++) {
                            System.out.print("*");
                        }
                        System.out.println("");
                    }
                    break;
                case 9: // angka 8
                    int bintang8;

                    bintang8 = Integer
                            .parseInt(JOptionPane.showInputDialog("Masukkan jumlah (angka ganjil) bintang = "));

                    int t = bintang8;

                    if (t > 2) {
                        for (int r = 0; r < t; r++) {
                            for (int u = 0; u < t; u++) {
                                if ((r == 0) || (r == t - 1) || (u == 0) || (u == t - 1)) {
                                    System.out.print("*");
                                } else {
                                    if (t % 2 == 1) {
                                        if ((r == t / 2) && (u == t / 2)) {
                                            System.out.print("*");
                                        } else {
                                            System.out.print(" ");
                                        }
                                    } else {

                                        System.out.print(" ");
                                    }
                                }
                            }
                            System.out.println();
                        }
                    }
                    break;
                case 10: // Segitiga Plus
                    int BintangPls;

                    BintangPls = Integer.parseInt(JOptionPane.showInputDialog("Masukkan jumlah bintang = "));

                    for (int i = 1; i <= BintangPls - 1; i++) {
                        for (int j = BintangPls / 2; j >= i; j--) {
                            System.out.print("  ");
                            System.out.println("*");
                        }
                    }
                    for (int p = 0; p <= BintangPls; p++) {
                        for (int k = BintangPls; k >= p; k--) {
                            System.out.print("*");
                        }
                    }
                    for (int i = 1; i <= BintangPls - 1; i++) {
                        for (int j = BintangPls / 2; j >= i; j--) {
                            System.out.print("  ");
                            System.out.println("*");
                        }
                    }
                    System.out.println();
                    break;
                case 11: // trapesium
                    int bintangTP;

                    bintangTP = Integer.parseInt(JOptionPane.showInputDialog("Masukkan jumlah bintang = "));

                    for (int i = 6; i <= bintangTP; i++) {
                        for (int j = bintangTP - 1; j >= i; j--) {
                            System.out.print(" ");
                        }
                        for (int k = 1; k <= i; k++) {
                            System.out.print('*');
                        }
                        for (int q = 1; q <= i - 1; q++) {
                            System.out.print('*');
                        }
                        System.out.println();
                    }
                    break;
                case 12: // triangular
                    int bintangTGL;

                    bintangTGL = Integer.parseInt(JOptionPane.showInputDialog("Masukkan jumlah bintang = "));

                    for (int i = 1; i <= bintangTGL; i++) {
                        for (int j = bintangTGL; j > i; j--) {
                            System.out.print(" ");
                        }
                        for (int k = 1; k <= i; k++) {
                            System.out.print(k + " ");
                        }
                        System.out.println();
                    }
                    break;
            }
            String lagi = JOptionPane.showInputDialog("\nIngin Mencoba lagi \n iya \n tidak ?:");

            if (lagi.equalsIgnoreCase("tidak")) {
                menu = false;
            } else if (lagi.equalsIgnoreCase("iya")) {
                menu = true;
            } else
                System.exit(0);
        }
    }
}

package p_10.tugas;

import javax.swing.*;

public class Belahketupat {
    public static void main(String[] args) {

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
    }
}

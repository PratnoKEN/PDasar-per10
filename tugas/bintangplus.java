package p_10.tugas;

import javax.swing.*;

public class bintangplus {
    public static void main(String[] args) {

        int BintangPls;

        BintangPls = Integer.parseInt(JOptionPane.showInputDialog("Masukkan jumlah bintang = "));

        for (int i = 1; i <= BintangPls - 1; i++) {
            for (int j = BintangPls / 2; j >= i; j--) {
                System.out.print("  ");
                System.out.println("*");
            }
        }
        for (int l = 0; l <= BintangPls; l++) {
            for (int k = BintangPls; k >= l; k--) {
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
    }
}

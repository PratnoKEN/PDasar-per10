package p_10.tugas;

import javax.swing.*;

public class Triangular {
    public static void main(String[] args) {
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
    }
}

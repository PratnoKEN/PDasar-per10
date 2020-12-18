package p_10.tugas;

import javax.swing.*;

public class BintangKanan {
    public static void main(String[] args) {
        int bintang;

        bintang = Integer.parseInt(JOptionPane.showInputDialog("Masukkan jumlah Bintang = "));
        for (int i = 1; i <= bintang; i++) {
            // membuat spasi
            for (int j = bintang - 1; j >= i; j--) {
                System.out.print(" ");
            }
            // membuat bintang
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }

}

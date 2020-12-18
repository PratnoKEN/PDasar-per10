package p_10.tugas;

import javax.swing.*;

public class bintangtrapesium {
    public static void main(String[] args) {
        int bintangTP;

        bintangTP = Integer.parseInt(JOptionPane.showInputDialog("Masukkan jumlah bintang = "));

        for (int i = 6; i <= bintangTP; i++) {
            for (int j = bintangTP - 1; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print('*');
            }
            for (int l = 1; l <= i - 1; l++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}

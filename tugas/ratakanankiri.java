package p_10.tugas;

import javax.swing.*;

public class ratakanankiri {
    public static void main(String[] args) {
        int bintangRKK;

        bintangRKK = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Jumlah bintang = "));

        for (int i = 0; i < bintangRKK; i++) {
            for (int j = 0; j < bintangRKK; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}

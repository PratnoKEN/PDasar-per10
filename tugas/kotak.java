package p_10.tugas;

import javax.swing.*;

public class kotak {
    public static void main(String[] args) {

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
    }
}

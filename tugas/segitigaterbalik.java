package p_10.tugas;

import javax.swing.*;

public class segitigaterbalik {
    public static void main(String[] args) {

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
    }
}

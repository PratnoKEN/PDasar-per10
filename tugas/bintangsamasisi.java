package p_10.tugas;

import javax.swing.*;

public class bintangsamasisi {
    public static void main(String[] args) {

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

    }
}

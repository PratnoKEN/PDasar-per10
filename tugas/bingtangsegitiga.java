package p_10.tugas;

import javax.swing.*;

public class bingtangsegitiga {
    public static void main(String[] args) {
        int bintangPenuh;

        bintangPenuh = Integer.parseInt(JOptionPane.showInputDialog("Masukkan jumlah bintang = "));

        for (int i = 1; i <= bintangPenuh; i++) {
            for (int j = bintangPenuh - 1; j >= i; j--) {
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

package p_10.tugas;

import javax.swing.*;

public class BintangKiriinput {
    public static void main(String[] args) {
        int bintang;

        bintang = Integer.parseInt(JOptionPane.showInputDialog("masukkan banyaknya bintang segitiga = "));
        for (int i = 1; i <= bintang; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}

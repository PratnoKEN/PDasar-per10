package p_10;

public class LatPor {
    public static void main(String[] args) {
        int bilangan = 5;
        int hasil = 1;

        for (int i = 2; i <= bilangan; i++) {
            System.out.println(hasil + "*" + i + "=");
            hasil *= i;
            System.out.println(hasil);
        }
        System.out.println(bilangan + "!=" + hasil);
    }

}

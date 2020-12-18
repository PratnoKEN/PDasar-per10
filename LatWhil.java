package p_10;

public class LatWhil {
    public static void main(String[] args) {
        int bilangan = 5;
        int x = 2;
        int hasil = 1;

        while (x <= bilangan) {
            System.out.println(hasil + "*" + x + "=");
            hasil = hasil * x;
            System.out.println(hasil);
            x++;
        }
        System.out.println(bilangan + "!=" + hasil);
    }

}

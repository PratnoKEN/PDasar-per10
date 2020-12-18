package p_10;

public class bintangkiri {
    public static void main(String[] args) {
        int batas = 5;
        for (int i = 1; i <= batas; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

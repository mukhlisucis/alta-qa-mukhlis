package Tugas;

public class Draw {
    private static void DrawXYZ(int n) {
        int hitung = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                hitung = hitung + 1;
                if (hitung % 2 == 0) {
                    System.out.print("Z ");
                } else if (hitung % 3 == 0) {
                    System.out.print("X ");
                } else {
                    System.out.print("Y ");
                }

            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        DrawXYZ(2);
        DrawXYZ(7);
        DrawXYZ(6);
        DrawXYZ(4);
    }
}

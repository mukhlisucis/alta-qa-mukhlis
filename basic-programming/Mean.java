package Tugas;

public class Mean {
    private static float Mean(float[] numbers) {
        float result = 0;
        float rataRata = 0;
        float[] array = numbers;
        for (int i = 0; i < array.length; i++) {
            result = result + array[i];
            rataRata = result / array.length;
        }

        return rataRata;
    }

    public static void main(String[] args) {
        float[] value = {1, 2, 3, 4};
        System.out.print("Hasil Rata-Rata : ");
        System.out.println(Mean(value));
    }
}

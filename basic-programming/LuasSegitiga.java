package Tugas;
import java.util.Scanner ;
public class LuasSegitiga {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        float alas , tinggi , result ;
        System.out.println("===========Menghitung Luas Segitiga===========");
        System.out.println("Masukkan Nilai Alas : ");
        alas = sc.nextFloat() ;
        System.out.println("Masukkan Nilai Tinggi : ");
        tinggi = sc.nextFloat() ;
        result = (alas*tinggi)/2 ;
        System.out.println("Hasil Luas Segitiga adalah : "+ result);

    }
}

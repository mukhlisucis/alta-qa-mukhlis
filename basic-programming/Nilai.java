package Tugas;
import java.util.Scanner ;
public class Nilai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nilai ;
        System.out.println("Masukkan Nilai : ");
        nilai = sc.nextInt() ;
        if (nilai>=80 && nilai <=100){
            System.out.println("Mendapatkan Nilai A");
        } else if (nilai >=65 && nilai<80) {
            System.out.println("Mendapatkan Nilali B+");
        }else if (nilai >=50 && nilai<65) {
            System.out.println("Mendapatkan Nilali B");
        }else if (nilai >=35 && nilai<50) {
            System.out.println("Mendapatkan Nilali C");
        }else if (nilai >=0 && nilai<35) {
            System.out.println("Mendapatkan Nilali D");
        }else {
            System.out.println("Nilai yang anda masukkan salah");
        }
    }
}

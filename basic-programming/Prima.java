package Tugas;
import java.util.Scanner ;
public class Prima {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(primeNumber(11));
        System.out.println(primeNumber(12));
        System.out.println("Masukkan Angka : ");
        int angka = sc.nextInt();
        System.out.println("Apakah prima ? " +primeNumber(angka));

    }
    private static boolean primeNumber(int number){
        int faktor = 0 ;
        boolean hasil;
        for(int i=1; i <= number ; i++){
            if (number%i==0){
                faktor++;
            }
        }
        if(faktor==2){
            hasil = true ;
        }else {
            hasil = false ;
        }
        return hasil ;
    }
}

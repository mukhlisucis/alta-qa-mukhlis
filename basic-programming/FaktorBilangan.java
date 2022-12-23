package Tugas;
import java.util.Scanner ;
public class FaktorBilangan {
    public static void main(String[] args) {


    Scanner sc = new Scanner(System.in) ;
    int bilangan ;
        System.out.println("Masukkan bilangan : ");
        bilangan = sc.nextInt();
        for (int i=1 ; i<=bilangan ; i++) {
            if (bilangan%i==0){
                System.out.print(i +" ");
            }
        }
}
}

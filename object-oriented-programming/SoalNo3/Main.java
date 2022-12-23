package SoalNo3;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hasil : ");
        Penjumlahan jumlah1= new Penjumlahan(3,4);
        System.out.println("Penjumlahan : "+jumlah1.hasilJumlah());
        Pengurangan kurang1 = new Pengurangan(15,4) ;
        System.out.println("Pengurangan : "+kurang1.hasilKurang());
        Perkalian kali1 = new Perkalian(10 , 10);
        System.out.println("Perkalian : "+kali1.hasilPerkalian());
        Pembagian bagi1 = new Pembagian(12 , 3);
        System.out.println("Pembagian : "+bagi1.hasilPembagian());

    }
}

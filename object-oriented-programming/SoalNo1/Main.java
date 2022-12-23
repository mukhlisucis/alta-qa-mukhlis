package SoalNo1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Luas");
        Persegi persegi1 = new Persegi(4);
        System.out.println("Persegi : "+ persegi1.hitungLuasPersegi());
        Segitiga segitiga1 = new Segitiga(3,4);
        System.out.println("Segitiga : "+ segitiga1.hitungLuasSegitiga());
        PersegiPanjang persegipanjang1 = new PersegiPanjang(7,8);
        System.out.println("Persegi Panjang : "+ persegipanjang1.hitungLuasPersegiPanjang());

        System.out.println("Keliling");
        System.out.println("Persegi : "+ persegi1.hitungKelilingPersegi());
        System.out.println("Segitiga : "+segitiga1.hitungKelilingSegitiga());
        System.out.println("Persegi Panjang : " +persegipanjang1.hitungKelilingPersegiPanjang());
    }
}

package SoalNo2;

public class Tabung {
    double r , tinggi ;

    public Tabung(double r, double tinggi) {
        this.r = r;
        this.tinggi = tinggi;
    }
    public double volumeTabung(){
        double volume = (3.14*(this.r*this.r)*this.tinggi) ;
        return volume ;
    }
}

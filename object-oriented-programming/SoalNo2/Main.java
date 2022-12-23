package SoalNo2;

public class Main {
    public static void main(String[] args) {
        System.out.println("Volume");
        Kubus kubus1 = new Kubus(10);
        System.out.println("Kubus : "+kubus1.volumeKubus());
        Balok balok1= new Balok(3,6,10);
        System.out.println("Balok : "+balok1.volumeBalok());
        Tabung tabung1 = new Tabung(7,10);
        System.out.println("Tabung : "+tabung1.volumeTabung());
    }
}

package Pertemuan10.Tugas;

public class InheritanceMain {
    public static void main(String[] args) {
        Motor motor = new Motor("Honda", "Merah", "B 1234 ABC");
        System.out.println("Plat Nomor: " + motor.getPlatNomor());
        System.out.println("Merk: " + motor.getMerk());
        System.out.println("Warna: " + motor.getWarna());
    }
}

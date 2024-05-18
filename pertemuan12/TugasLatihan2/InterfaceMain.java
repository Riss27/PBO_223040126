package pertemuan12.TugasLatihan2;

public class InterfaceMain {
    public static void main(String[] args) {
        Kendaraan mobil = new Mobil("Toyota");
        Kendaraan motor = new Motor("Honda");
        Kendaraan sepeda = new Sepeda("Polygon");

        mobil.start();
        motor.start();
        sepeda.start();

        mobil.stop();
        motor.stop();
        sepeda.stop();

        // Output kecepatan akhir
        System.out.println("Kecepatan akhir Mobil: " + ((Mobil)mobil).getKecepatan() + " km/jam.");
        System.out.println("Kecepatan akhir Motor: " + ((Motor)motor).getKecepatan() + " km/jam.");
        System.out.println("Kecepatan akhir Sepeda: " + ((Sepeda)sepeda).getKecepatan() + " km/jam.");
    }
}
package pertemuan12.TugasLatihan2;

public class Mobil implements Kendaraan {
    private String merek;
    private int kecepatan;

    public Mobil(String merek) {
        this.merek = merek;
        this.kecepatan = 0;
    }

    @Override
    public void start() {
        kecepatan = 60;
        System.out.println("Mobil " + merek + " mulai berjalan dengan kecepatan " + kecepatan + " km/jam.");
    }

    @Override
    public void stop() {
        kecepatan = 0;
        System.out.println("Mobil " + merek + " berhenti.");
    }

    public int getKecepatan() {
        return kecepatan;
    }
}

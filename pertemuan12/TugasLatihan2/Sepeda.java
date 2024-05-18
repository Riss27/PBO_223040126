package pertemuan12.TugasLatihan2;

public class Sepeda implements Kendaraan {
    private String merek;
    private int kecepatan;

    public Sepeda(String merek) {
        this.merek = merek;
        this.kecepatan = 0;
    }

    @Override
    public void start() {
        kecepatan = 20;
        System.out.println("Sepeda " + merek + " mulai berjalan dengan kecepatan " + kecepatan + " km/jam.");
    }

    @Override
    public void stop() {
        kecepatan = 0;
        System.out.println("Sepeda " + merek + " berhenti.");
    }

    public int getKecepatan() {
        return kecepatan;
    }
}
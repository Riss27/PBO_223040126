package pertemuan12.TugasLatihan2;

public class Motor implements Kendaraan {
    private String merek;
    private int kecepatan;

    public Motor(String merek) {
        this.merek = merek;
        this.kecepatan = 0;
    }

    @Override
    public void start() {
        kecepatan = 40;
        System.out.println("Motor " + merek + " mulai berjalan dengan kecepatan " + kecepatan + " km/jam.");
    }

    @Override
    public void stop() {
        kecepatan = 0;
        System.out.println("Motor " + merek + " berhenti.");
    }

    public int getKecepatan() {
        return kecepatan;
    }
}

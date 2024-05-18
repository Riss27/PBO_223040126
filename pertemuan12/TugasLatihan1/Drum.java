package pertemuan12.TugasLatihan1;

public class Drum extends AlatMusik {
    private int jumlahDrum;

    public Drum(String nama, int jumlahDrum) {
        super(nama, "Drum");
        this.jumlahDrum = jumlahDrum;
    }

    @Override
    public void mainkan() {
        System.out.println(nama + " dengan " + jumlahDrum + " drum sedang dimainkan.");
    }

    @Override
    public void setel() {
        System.out.println(nama + " sedang disetel.");
    }

    public int getJumlahDrum() {
        return jumlahDrum;
    }

    public void setJumlahDrum(int jumlahDrum) {
        this.jumlahDrum = jumlahDrum;
    }
}

package pertemuan12.TugasLatihan1;

public class Piano extends AlatMusik {
    private int jumlahTuts;

    public Piano(String nama, int jumlahTuts) {
        super(nama, "Piano");
        this.jumlahTuts = jumlahTuts;
    }

    @Override
    public void mainkan() {
        System.out.println(nama + " dengan " + jumlahTuts + " tuts sedang dimainkan.");
    }

    @Override
    public void setel() {
        System.out.println(nama + " sedang disetel.");
    }

    public int getJumlahTuts() {
        return jumlahTuts;
    }

    public void setJumlahTuts(int jumlahTuts) {
        this.jumlahTuts = jumlahTuts;
    }
}

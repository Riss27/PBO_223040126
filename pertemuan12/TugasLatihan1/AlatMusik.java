package pertemuan12.TugasLatihan1;

public abstract class AlatMusik {
    protected String nama;
    protected String jenis;

    public AlatMusik(String nama, String jenis) {
        this.nama = nama;
        this.jenis = jenis;
    }

    public abstract void mainkan();
    public abstract void setel();

    public String getNama() {
        return nama;
    }

    public String getJenis() {
        return jenis;
    }
}

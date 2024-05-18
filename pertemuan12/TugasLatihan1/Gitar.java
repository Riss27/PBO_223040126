package pertemuan12.TugasLatihan1;

public class Gitar extends AlatMusik {
    private int jumlahSenar;

    public Gitar(String nama, int jumlahSenar) {
        super(nama, "Gitar");
        this.jumlahSenar = jumlahSenar;
    }

    @Override
    public void mainkan() {
        System.out.println(nama + " dengan " + jumlahSenar + " senar sedang dimainkan.");
    }

    @Override
    public void setel() {
        System.out.println(nama + " sedang disetel.");
    }

    public int getJumlahSenar() {
        return jumlahSenar;
    }

    public void setJumlahSenar(int jumlahSenar) {
        this.jumlahSenar = jumlahSenar;
    }
}
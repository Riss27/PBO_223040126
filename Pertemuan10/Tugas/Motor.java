package Pertemuan10.Tugas;

public class Motor extends Kendaraan 
{
    private String platNomor;

    public Motor(String merk, String warna, String platNomor) {
        super(merk, warna);
        this.platNomor = platNomor;
    }

    public String getPlatNomor() {
        return platNomor;
    }

    public void setPlatNomor(String platNomor) {
        this.platNomor = platNomor;
    }
}


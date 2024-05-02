package Pertemuan10.Latihan4;

public class Mahasiswa extends Orang
{
    private String nrp;
    public Mahasiswa(String nama, String alamat, String nrp) 
    {
        super(nama, alamat);
        setNRP(nrp);
    }

    public String getNrp() 
    {
        return nrp;
    }

    public void setNRP(String nrp) 
    {
        this.nrp = nrp;
    }
}

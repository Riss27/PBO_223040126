package Pertemuan5;

public class MataKuliah {
    public static Object mk3;
    public static Object mk2;
    public static Object mk1;
    private String kode;
    private String nama;
    private String index;
    private int sks;

    public MataKuliah(String kode, String nama, String index, int sks) 
    {
        this.kode = kode;
        this.nama = nama;
        this.index = index;
        this.sks = sks;
    }

    public double nilaiIndex() 
    {
        switch (index) {
            case "A":
                return 4.0;
            case "AB":
                return 3.5;
            case "B":
                return 3.0;
            case "BC":
                return 2.5;
            case "C":
                return 2.0;
            case "D":
                return 1.0;
            case "E":
                return 0.0;
            default:
                return 0;

                //menghitung nilai index mata kuliah dari data yang ada dalam objek mata kuliah berdasarkan index

        }
    }

    public int getSKS() 
    {
        return sks;
        //menghitung total sks mata kuliah dari data yang ada dalam objek mata kuliah
    }

    public static double hitungIPK(MataKuliah[] matKul) 
    {
        double totalNilai = 0;
        int totalSKS = 0;

        for(MataKuliah mataKuliah : matKul) 
        {
            totalNilai += mataKuliah.nilaiIndex() * mataKuliah.getSKS();
            totalSKS += mataKuliah.getSKS();
        }
        return totalSKS > 0 ? totalNilai / totalSKS : 0.0;
        
        // menghitung IPK dari data yang ada dalam objek mata kuliah 
    }
    public String display() 
    {
        return kode + " - " + nama + " - " + index ;
    }
}

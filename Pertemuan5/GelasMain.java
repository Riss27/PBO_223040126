package Pertemuan5;

public class GelasMain 
{
    public static void main(String[] args) 
    {
        Gelas g1 = new Gelas("Hitam");
        Gelas g2 = new Gelas("Biru");

        tukarWarnaGelas(g1, g2);
        System.out.println("Warna g1:" + g1.getWarna());
        System.out.println("Warna g2:" + g2.getWarna());

        // Hasil dari penampilan warna gelas telah diolah sebelumnya dalam fungsi tukarWarnaGelas
        
    }

    static void tukarWarnaGelas(Gelas g1, Gelas g2)
    {
        Gelas gTemp = new Gelas("Temp");
        gTemp.setWarna(g1.getWarna());
        g1.setWarna(g2.getWarna());
        g2.setWarna(gTemp.getWarna());

        // Fungsi ini bertujuan untuk menukar warna antara dua objek gelas. Warna dari masing-masing gelas disimpan sementara dalam sebuah variabel. Kemudian, warna gelas pertama diganti dengan warna gelas kedua, dan sebaliknya. Sehingga warna antara kedua gelas berhasil ditukar.

    }
}

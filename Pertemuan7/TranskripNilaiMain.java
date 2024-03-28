package Pertemuan7;

public class TranskripNilaiMain {
    public static void main(String[] args) {
        //create objek matakuliah
    MataKuliah mk1 = new MataKuliah("001", "Algoritma Pemorgraman 1", "A", 3);
    MataKuliah mk2 = new MataKuliah("002", "Algoritma Pemorgraman 2", "BC", 3);
    MataKuliah mk3 = new MataKuliah("003", "Pemrograman Berorientasi Objek", "B", 3);

    //membuat objek KHS
    KartuHasilStudi khs = new KartuHasilStudi("20222");
    khs.addMataKuliah(mk1);
    khs.addMataKuliah(mk2);
    khs.addMataKuliah(mk3);

    //membuat objek mahasiswa
    Mahasiswa mhs = new Mahasiswa("303040001", "John");

    //membuat objek transkrip nilai
    TranskripNilai transkrip = new TranskripNilai(mhs);
    transkrip.addKHS(khs);
    transkrip.hitungIPK();
    transkrip.display();
    }
}
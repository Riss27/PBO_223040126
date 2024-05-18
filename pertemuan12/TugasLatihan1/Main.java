package pertemuan12.TugasLatihan1;

public class Main {
    public static void main(String[] args) {
        Gitar gitar = new Gitar("Gitar Akustik", 6);
        Piano piano = new Piano("Piano Grand", 88);
        Drum drum = new Drum("Drum Set", 5);

        System.out.println("== Gitar ==");
        gitar.mainkan();
        gitar.setel();

        System.out.println("== Piano ==");
        piano.mainkan();
        piano.setel();

        System.out.println("== Drum ==");
        drum.mainkan();
        drum.setel();
    }
}
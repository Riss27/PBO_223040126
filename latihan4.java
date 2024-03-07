public class latihan4 {
    public static void main(String[] args) {
        
        Lingkaran l1 = new Lingkaran(5);
        Lingkaran l2 = l1;
        Lingkaran l3 = new Lingkaran(7);

        System.out.println(l1.getJari2());
        System.out.println(l2.getJari2());
        System.out.println(l3.getJari2());

        l2 = null;

        System.out.println(l1.getJari2());
        
        // Memeriksa apakah l2 tidak null sebelum mencoba mengaksesnya
        if(l2 != null) {
            System.out.println(l2.getJari2());
        }
        System.out.println(l3.getJari2());
    }
}

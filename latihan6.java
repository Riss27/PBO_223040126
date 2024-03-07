public class latihan6 {
    public static void main(String[] args) {
        Student x = new Student(0);
        Student y = x;

        x.setNrp(01);
        y.setNrp(02);

        System.out.println(x.getNrp()); //sehingga x disini itu 1
        Student z = new Student(0);

        z.setNrp(03);
        x = z; //terikat dengan z

        System.out.println(x.getNrp()); //sehingga x disini itu 3
        System.out.println(y.getNrp()); //sehingga y disini itu 2
    }
}

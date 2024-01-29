public class Table {
    public static void main(String[] args) {
        System.out.printf("%10s %10s %10s %10s %n", "N", "N2", "N3", "N4");
        for(int i = 1; i <= 5; i++) {
            System.out.printf("%10d %10d %10d %10d %n", i, i*i, i*i*i, i*i*i*i);


        }
    }
}

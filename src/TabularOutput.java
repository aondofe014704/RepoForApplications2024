public class TabularOutput {
    public static void main(String[] args) {
        int t = 1;
        System.out.printf("%5s %5s %5s %5s %n","N1","N2","N3","N4");
        for (int i = 0; i <5 ; i++) {
            System.out.printf("%5d %5d %5d %5d %n", t,t*t,t*t*t,t*t*t*t);
            t++;

        }
    }
}

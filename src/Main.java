public class Main {

    public static void main(String[] args) {
        double vklad = 1000;
        double percent = 0.02;

        for (int year = 1; year <=10; year++) {
        vklad += vklad*percent;
        }
        System.out.println(vklad);
    }
}

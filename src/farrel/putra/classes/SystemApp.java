package farrel.putra.classes;

public class SystemApp {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());
        System.out.println(System.nanoTime());

        System.out.println(System.getenv());
        System.out.println(System.getenv("HOME"));
        System.out.println(System.getenv("JAVA_HOME"));

        System.gc();

        System.exit(1);

        System.out.println("HI");
    }
}

package farrel.putra.classes;

public class StringApp {
    public static void main(String[] args) {

        /**
         * <p>When a String is created,
         * its data is immutable.</p>
         */
        String name = "Farrel Athaillah Putra";
        String nameLowerCase = name.toLowerCase();
        String nameUpperCase = name.toUpperCase();

        System.out.println(name);
        System.out.println(nameLowerCase);
        System.out.println(nameUpperCase);
        System.out.println(name.length());

        System.out.println("\n==========\n");

        System.out.println(name.startsWith("far"));
        System.out.println(name.startsWith("Far"));
        System.out.println(name.endsWith("ra"));
        System.out.println(name.endsWith("Ra"));

        System.out.println("\n==========\n");

        String[] names = name.split(" ");
        System.out.println(names);
        for (var value : names) {
            System.out.println(value);
        }

        System.out.println("\n==========\n");

        System.out.println(" ".isBlank());
        System.out.println(" ".isEmpty());
        System.out.println("".isEmpty());
        System.out.println(name.charAt(7));

        System.out.println("\n==========\n");

        char[] chars = name.toCharArray();
        for (var value : chars) {
            System.out.println(value);
        }
    }
}

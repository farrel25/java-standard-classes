package farrel.putra.classes;

import java.util.Arrays;

public class StringApp {
    public static void main(String[] args) {

        /**
         * <p>When a String is created,
         * its data is immutable.</p>
         */
        String name = "Farrel Athaillah Putra";
        String nameLowerCase = name.toLowerCase();
        String nameUpperCase = name.toUpperCase();

        System.out.println("name: " + name);
        System.out.println("nameLowerCase: " + nameLowerCase);
        System.out.println("nameUpperCase: " + nameUpperCase);
        System.out.println("name.length(): " + name.length());

        System.out.println("\n==========\n");

        System.out.println("name.startsWith(\"far\"): " + name.startsWith("far"));
        System.out.println("name.startsWith(\"Far\"): " + name.startsWith("Far"));
        System.out.println("name.endsWith(\"ra\"): " + name.endsWith("ra"));
        System.out.println("name.endsWith(\"Ra\"): " + name.endsWith("Ra"));

        System.out.println("\n==========\n");

        String[] names = name.split(" ");
        System.out.println("names: " + names);
        System.out.println("Arrays.toString(names): " + Arrays.toString(names));
        for (var value : names) {
            System.out.println("value: " + value);
        }

        System.out.println("\n==========\n");

        System.out.println("\" \".isBlank(): " + " ".isBlank());
        System.out.println("\" \".isEmpty(): " + " ".isEmpty());
        System.out.println("\"\".isEmpty(): " + "".isEmpty());
        System.out.println("name.charAt(7): " + name.charAt(7));

        System.out.println("\n==========\n");

        char[] chars = name.toCharArray();
        for (var value : chars) {
            System.out.println(value);
        }
    }
}

package farrel.putra.classes;

import java.util.StringJoiner;

public class StringJoinerApp {
    public static void main(String[] args) {

        StringJoiner joiner = new StringJoiner(" | ", "[", "]");

        joiner.add("Farrel");
        joiner.add("Athaillah");
        joiner.add("Putra");

        String value = joiner.toString();
        System.out.println(value);
    }
}

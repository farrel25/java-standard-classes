package farrel.putra.classes;

import java.util.StringTokenizer;

public class StringTokenizerApp {
    public static void main(String[] args) {

        String value = "Farrel Athaillah Putra";
        StringTokenizer tokenizer = new StringTokenizer(value," ");

        while (tokenizer.hasMoreTokens()) {
            String result = tokenizer.nextToken();
            System.out.println(result);
        }

    }
}

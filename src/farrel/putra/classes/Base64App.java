package farrel.putra.classes;

import java.util.Base64;

public class Base64App {
    public static void main(String[] args) {
        String ori = "Farrel Athaillah Putra";

        String encoded = Base64.getEncoder().encodeToString(ori.getBytes());
        System.out.println(encoded);

        byte[] bytes = Base64.getDecoder().decode(encoded);
        System.out.println(bytes);

        String result = new String(bytes);
        System.out.println(result);
    }
}

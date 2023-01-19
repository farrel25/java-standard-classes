package farrel.putra.classes;

import java.util.Arrays;
import java.util.Base64;

public class Base64App {
    public static void main(String[] args) {
        String ori = "Farrel Athaillah Putra";
        System.out.println("\nori: " + ori);

        String encoded = Base64.getEncoder().encodeToString(ori.getBytes());
        System.out.println("\nencoded: " + encoded);

        byte[] bytes = Base64.getDecoder().decode(encoded);
        System.out.println("\nbytes: " + bytes);
        System.out.println("Arrays.toString(bytes): " + Arrays.toString(bytes));

        String result = new String(bytes);
        System.out.println("\nresult: " + result);
    }
}

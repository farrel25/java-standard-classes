package farrel.putra.classes;

public class StringBuilderApp {
    public static void main(String[] args) {
        /**
         * actually java creates 3 new object data in different memory, there are:
         * 1. Farrel
         * 2. Farrel Athaillah
         * 3. Farrel Athaillah Putra
         *
         * It is because String is immutable.
         */
        String name = "Farrel";
        name = name + " " + "Athaillah";
        name = name + " " + "Putra";
        System.out.println(name);

        /**
         * by using StringBuilder, then all strings in append method
         * will become 1 object that stored in 1 memory.
         * So the String data is not created many times, and it saves more memory.
         */
        StringBuilder builder = new StringBuilder();
        builder.append("Farrel");
        builder.append(" ");
        builder.append("Athaillah");
        builder.append(" ");
        builder.append("Putra");

        String name2 = builder.toString();

        System.out.println(name2);
    }
}

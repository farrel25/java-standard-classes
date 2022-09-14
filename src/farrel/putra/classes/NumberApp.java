package farrel.putra.classes;

public class NumberApp {

    public static void main(String[] args) {

        Integer intNum = 10;
        Long longNum = intNum.longValue();
        Double doubleNum = intNum.doubleValue();
        Short shortNum = doubleNum.shortValue();

        String example = "1000";

        Integer exampleInt = Integer.valueOf(example);
        System.out.println(exampleInt);

        String example2 = "100.19";
        Double example2Double = Double.valueOf(example2);
        System.out.println(example2Double);
    }
}

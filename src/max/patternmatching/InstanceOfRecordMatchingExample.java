package max.patternmatching;

public class InstanceOfRecordMatchingExample {

    private record Pair(String k, String v) {
    }

    private static void handleObject(Object o) {
        // we can omit p if we're not going to use it
        if (o instanceof Pair(String k, String v) p) {
            System.out.printf("got a Pair with k %s and v : %s%n", k, v);
            System.out.printf("pair : %s%n", p);
        }
    }

    public static void main(String[] args) {
        handleObject(new Pair("key1", "value1"));
    }
}

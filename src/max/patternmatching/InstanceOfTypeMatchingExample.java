package max.patternmatching;

public class InstanceOfTypeMatchingExample {

    public static void main(String[] args) {
        handleNumber(1);
        handleNumber(1.5);
    }

    static void handleNumber(Object o) {
        if (o == null) {
            System.out.println("got a null");
        }
        if (o instanceof Integer i) {
            handleInteger(i);
        } else if (o instanceof Double d) {
            handleDouble(d);
        } else {
            System.out.println("unknown value");
        }
    }

    private static void handleDouble(Double d) {
        System.out.printf("we've got a double : %s%n", d);
    }

    private static void handleInteger(Integer i) {
        System.out.printf("we've got and integer : %d%n", i);
    }

    void scopeExample(Object o) {
        if (!(o instanceof Number n)) {
            return;
        }
        // n available here
        System.out.println(n);
    }
}

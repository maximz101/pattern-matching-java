package max.patternmatching;

public class SwitchCaseTypeMatchingExample {
    public static void main(String[] args) {
        handleNumber(1);
        handleNumber(1.5d);
        handleNumber(1.5f);
        handleNumber(null);
    }

    static void handleNumber(Object o) {
        switch (o) {
            case null -> System.out.println("got a null");
            case Integer i -> handleInteger(i);
            case Double d -> handleDouble(d);
            default -> System.out.println("unknown value");
        }
    }

    static void handleNumberWithCaseRefinement(Object o) {
        switch (o) {
            case null -> System.out.println("got a null");
            case Integer i when i > 10 -> handleInteger(i);
            case Double d -> handleDouble(d);
            default -> System.out.println("unknown value");
        }
    }

    static void handleNumberWithParentClass(Object o) {
        switch (o) {
            case null -> System.out.println("got a null");
//            case Number n -> System.out.println("");
            case Integer i -> handleInteger(i);
            case Double d -> handleDouble(d);
            default -> System.out.println("unknown value");
        }
    }

    private static void handleDouble(Double d) {
        System.out.printf("we've got a double : %s%n", d);
    }

    private static void handleInteger(Integer i) {
        System.out.printf("we've got and integer : %d%n", i);
    }
}

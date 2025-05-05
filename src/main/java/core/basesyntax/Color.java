package core.basesyntax;

public enum Color {
    YELLOW("Yellow"),
    RED("Red"),
    GREEN("Green"),
    BLACK("Black"),
    WHITE("White");

    private final String value;

    Color(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}

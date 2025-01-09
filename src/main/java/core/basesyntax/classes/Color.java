package core.basesyntax.classes;

public enum Color {
    RED, GREEN, BLUE, YELLOW, VIOLET, BLACK;

    @Override
    public String toString() {
        return name();
    }
}

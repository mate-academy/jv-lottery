package core.basesyntax;

public record Ball(ColorSupplier.Color color, int number) {

    @Override
    public String toString() {
        return "color: " + color + "; " + "number: " + number;
    }
}

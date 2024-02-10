package core.basesyntax;

public record Ball(Color color, int number) {

    @Override
    public String toString() {
        return color().name() + " ball with number " + number();
    }
}

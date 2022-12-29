package core.basesyntax;

public class Ball {
    String color;
    int number;
    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "color: " + this.color + ", number: " + this.number;
    }
}

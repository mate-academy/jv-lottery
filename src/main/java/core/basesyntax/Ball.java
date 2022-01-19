package core.basesyntax;

public class Ball {
    private String collor;
    private int number;

    public Ball(String collor, int number) {
        this.collor = collor;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Ball{"
                +
                "collor='"
                + collor
                + '\''
                +
                ", number="
                + number
                +
                '}';
    }
}

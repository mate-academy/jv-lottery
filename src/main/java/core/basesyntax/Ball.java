package core.basesyntax;

class Ball {
    private final Color color;
    private final int number;

    public Ball(Color color, int number) {
        this.color = color;
        this.number = number;
    }

    public String toString() {
        var s = "Ball{"
                +
                "color="
                + color
                +
                ", number="
                + number
                +
                '}';
        return s;
    }
}



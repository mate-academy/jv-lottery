package core.basesyntax;

class Ball {
    private final Colors color;
    private final int number;

    public Ball(Colors color, int number) {
        this.color = color;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Ball{"
                +
                "color='" + color + '\''
                +
                ", number=" + number
                +
                '}';
    }
}

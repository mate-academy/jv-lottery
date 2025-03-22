package core.basesyntax;

enum Color {
    RED, BLUE, GREEN, YELLOW, ORANGE, PURPLE, BLACK, WHITE
}

class Ball {
    private final Color color;
    private final int number;

    public Ball(Color color, int number) {
        this.color = color;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Ball{color=" + color + ", number=" + number + "}";
    }
}


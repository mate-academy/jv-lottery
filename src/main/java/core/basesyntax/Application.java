package core.basesyntax;
enum Color {
    RED, GREEN, BLUE, YELLOW, ORANGE, PURPLE
}
class Ball {
    private final Color color ;
    private final int number;

    public Ball(Color color, int number) {
        this.color = color;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Ball [color=" + color + ", number=" + number + "]";
    }
}
class Lottery {
    public static Ball getRandomBall() {
        Color randomColor = ColorSupplier.getRandomColor();
        int randomNumber = (int) (Math.random() * 100) + 1;
        return new Ball(randomColor,randomNumber);
    }
}

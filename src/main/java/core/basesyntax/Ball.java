package core.basesyntax;

public class Ball {
    private final String randomColor;
    private final int nextInt;

    public Ball(Color randomColor, int nextInt) {
        this.randomColor = String.valueOf(randomColor);
        this.nextInt = nextInt;
    }

    public String getColor() {
        return randomColor;
    }

    public int getNumber() {
        return nextInt;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "color='" + randomColor + '\'' +
                ", number=" + nextInt +
                '}';
    }
}

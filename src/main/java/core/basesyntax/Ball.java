package core.basesyntax;

public class Ball {
    private String color;
    private int number;
    private final int ballCount = 100;

    public int getBallCount() {
        return ballCount;
    }

    public String toString(String color) {
        return String.valueOf(color);
    }

    public String toString(int number) {
        return String.valueOf(number);
    }

}

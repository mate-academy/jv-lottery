package core.basesyntax;

public class Ball {
    private final Colors color;
    private final int number;

    public Ball(Colors color, int number) {
        this.color = color;
        this.number = number;
    }

    public String getBallInfo() {
        return new StringBuilder()
                .append("Ball color = ")
                .append(color)
                .append(", ")
                .append("number = ")
                .append(number)
                .toString();
    }
}

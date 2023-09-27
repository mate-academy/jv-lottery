package core.basesyntax;

public class Ball {
    private final Color color;
    private final int number;

    public Ball(Color color, int number) {
        this.color = color;
        this.number = number;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Color of ball is ").append(color)
               .append(" and its number is ").append(number);
        return builder.toString();
    }
}

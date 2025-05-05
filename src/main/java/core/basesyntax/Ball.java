package core.basesyntax;

public class Ball {
    public static final int MIN_VALUE = 1;
    public static final int MAX_VALUE = 100;

    private String color;
    private int number;

    public Ball(String color, int number) {
        this.color = color;
        this.number = number;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.color);
        stringBuilder.append(" ball with number ");
        stringBuilder.append(this.number);

        return stringBuilder.toString();
    }
}

package core.basesyntax;

public class Ball {
    private String color;
    private int number;

    public Ball(Color ballColor, int ballNumber) {
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        return builder.append("color: ").append(color).append("number: ").append(number).toString();
    }
}
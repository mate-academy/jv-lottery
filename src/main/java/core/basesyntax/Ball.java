package core.basesyntax;

public class Ball {
    private String color;
    private int number;

    public Ball(String color, int number) {
        this.color = color;
        this.number = number;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Ball{");
        sb.append("color='").append(color).append('\'');
        sb.append(", number=").append(number);
        sb.append('}');
        return sb.toString();
    }
}

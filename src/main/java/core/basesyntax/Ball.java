package core.basesyntax;

public class Ball {
    private String color;
    private Long number;

    public Ball(String color, Long number) {
        this.color = color;
        this.number = number;
    }

    public Ball() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Ball{"
                + "color='" + color + '\''
                + ", number=" + number
                + '}';
    }
}

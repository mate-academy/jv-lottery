package core.basesyntax;

public class Ball {
    private String color;
    private Integer number;

    public Ball(String color, Integer number) {
        this.color = color;
        this.number = number;
    }

    public String toString() {
        return color + " color and number " + number.toString() + " win!";
    }
}

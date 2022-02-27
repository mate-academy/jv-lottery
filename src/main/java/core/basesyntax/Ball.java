package core.basesyntax;

/**
 * @version 1.0
 * @autor shd
 * @created by 27/02/2022 - 17:45
 * @project jv-lottery
 */
public class Ball {
    private int number;
    private String color;

    public Ball(int number, String color) {
        this.number = number;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "number=" + number +
                ", color='" + color + '\'' +
                '}';
    }
}
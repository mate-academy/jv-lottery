package core.basesyntax;

public class Ball {
    private String color;
    private int number;

    public Ball(Color randomColor, int randomNumber) {
        this.color = color;
        this.number = number;
    }

    @Override
    public String toString() {
        return color + number;
    }
}

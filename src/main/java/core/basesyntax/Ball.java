package core.basesyntax;

public class Ball {
    private int number = 1;
    private String color = "BLACK";

    public Ball(int number, String color) {
        this.color = color;
        this.number = number;
    }

    @Override
    public String toString() {
        String str = "Ball №: " + number + " color: " + color;
        return str;
    }
}

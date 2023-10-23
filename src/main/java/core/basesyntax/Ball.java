package core.basesyntax;

public class Ball {
    private Colors color;
    private int number;

    public Ball(Colors color, int number) {
        this.color = color;
        this.number = number;
    }

    public String toString() {
        return "The winner is a " + color + " ball with a number - " + number + ";";
    }
}

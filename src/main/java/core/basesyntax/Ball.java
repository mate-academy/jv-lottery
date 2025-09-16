package core.basesyntax;

public class Ball {
    private Colors color;
    private int number;

    public Ball() {
        this.color = Colors.RED;
        this.number = -1;
    }

    public Ball(Colors col, int num) {
        this.color = col;
        this.number = num;
    }

    @Override
    public String toString() {
        return number + " " + color;
    }
}

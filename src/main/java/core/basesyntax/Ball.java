package core.basesyntax;

public class Ball {
    Colors color;
    int number;

    public Ball(Colors color, int number) {
        this.color = color;
        this.number = number;
    }

    public String toString() {
        return "Ball number: "+ this.number + " color: " + color;
    }


}

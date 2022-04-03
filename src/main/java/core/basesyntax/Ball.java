package core.basesyntax;

public class Ball extends Lottery {
     String color;
     int number;

    @Override
    public String toString() {
        return "Ball`s color: " + color +
                "\nBall`s number: " + number;
    }
}

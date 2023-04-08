package core.basesyntax;

public class Ball {
    private Color COLOR;
    private int NUMBER;

    public Ball(Color COLOR, int NUMBER) {
        this.COLOR = COLOR;
        this.NUMBER = NUMBER;
    }

    public String toString() {
        return "Ball {" + "color = " + COLOR + ", number = " + NUMBER + '}';
    }
}


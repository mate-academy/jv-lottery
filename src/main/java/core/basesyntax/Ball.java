package core.basesyntax;

public class Ball {
    private Colors color;
    private int number;

    public void setNumber(int n) {
        number = n;
    }

    public void setColor(Colors c) {
        color = c;
    }

    @Override
    public String toString() {
        String ball = "ball";
        return ball;
    }

}

package core.basesyntax;

public class Ball {
    private BallColors color;
    private int number;

    public Ball(BallColors color, int number) {
        this.color = color;
        this.number = number;
    }

    @Override
    public String toString() {
        return "We have ball # " + this.number + " whith color: " + this.color;
    }

}

package core.basesyntax;

public class Ball {

    private int numberBall;
    private String colorBall;

    public Ball(String colorBall, int numberBall) {
        this.colorBall = colorBall;
        this.numberBall = numberBall;
    }

    public String toString() {
        return "Color: " + colorBall + " and Number: " + numberBall;
    }
}

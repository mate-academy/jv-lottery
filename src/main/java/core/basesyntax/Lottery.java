package core.basesyntax;

public class Lottery extends RandoM {
    public String getRandomBall() {
        return "color of the ball: " + getRandomColor() + ", number of the ball: "
                + getRandomNumber() + ".";
    }
}

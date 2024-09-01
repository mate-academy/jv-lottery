package core.basesyntax;

public class Lottery extends RandomValue {
    public static String getRandomBall() {
        return "color of the ball: " + getRandomColor()
                + ", number of the ball: " + getRandomNumber() + ".";
    }
}

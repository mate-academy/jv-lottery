package core.basesyntax;

public class Ball extends Application {
    @Override
    public String toString() {
        return "Ball{"
                + "color='"
                + getRandomColor()
                + '\''
                + ", number=" + getRandomBall()
                + '}';
    }
}

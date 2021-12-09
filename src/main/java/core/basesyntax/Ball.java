package core.basesyntax;

public class Ball extends Application {
    private String color;
    private int number;


    @Override
    public String toString() {
        return "Ball{" +
                "color='" + getRandomColor() + '\'' +
                ", number=" + getRandomBall() +
                '}';
    }
}

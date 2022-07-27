package core.basesyntax;

public class Lottery {
    public String getRandomBall() {
        StringBuilder balls = new StringBuilder();

        for (int i = 0; i < 3; i++) {
            balls.append(new Ball().toString()).append("\n");
        }

        return balls.toString();
    }
}

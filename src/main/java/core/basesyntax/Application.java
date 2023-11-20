package core.basesyntax;

public class Application {
    public void main(String[] args) {
        int numberOfBallsToGenerate = 5;
        Ball[] balls = new Ball[numberOfBallsToGenerate];

        for (int i = 0; i < numberOfBallsToGenerate; i++) {
            balls[i] = Lottery.getRandomBall();
        }
    }
}

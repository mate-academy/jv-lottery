package core.basesyntax;

import main.java.core.basesyntax.Lottery;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        int numberOfBalls = 100;

        List<Ball> balls = generateBalls(lottery, numberOfBalls);

        printBalls(balls);
    }

    private static List<Ball> generateBalls(Lottery lottery, int numberOfBalls) {
        List<Ball> balls = new ArrayList<>();
        for (int i = 0; i < numberOfBalls; i++) {
            balls.add(lottery.getRandomBall());
        }
        return balls;
    }

    private static void printBalls(List<Ball> balls) {
        for (int i = 0; i < balls.size(); i++) {
            System.out.println((i + 1) + ". " + balls.get(i));
        }
    }
}

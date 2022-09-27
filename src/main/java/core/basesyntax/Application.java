package core.basesyntax;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<Ball> ballList = new ArrayList<>();
        Lottery lt = new Lottery();
        int numberOfBalls = 3;

        while (ballList.size() != numberOfBalls) {
            ballList.add(lt.getRandomBall());
        }

        for (int i = 0; i < numberOfBalls; i++) {
            System.out.println(i + 1 + ". " + ballList.get(i));
        }
    }
}

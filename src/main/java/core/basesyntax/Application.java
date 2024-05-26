package core.basesyntax;

import java.util.Stack;

public class Application {
    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        Stack<Ball> ballStack = new Stack<>();

        for (int i = 0; i < 3; i++) {
            ballStack.push(lottery.getRandomBall());
        }

        while (!ballStack.isEmpty()) {
            System.out.println(ballStack.pop());
        }
    }
}

package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        Lottery lottery = new Lottery();
        Ball ball1 = lottery.getRandomBall();
        Ball ball2 = lottery.getRandomBall();
        Ball ball3 = lottery.getRandomBall();
        Ball[] balls = {ball1, ball2, ball3};
        for (int i = 0; i < balls.length; i++) {
            String color = ": color - " + balls[i].getColor();
            String number = ", number - " + balls[i].getNumber();
            System.out.println("Ball#" + (i + 1) + color + number);
        }
    }
}

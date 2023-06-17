package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        Lottery ballOne = new Ball();
        Lottery balTwo = new Ball();
        Lottery balThree = new Ball();
        print(ballOne.getRandomBall());
        print(balTwo.getRandomBall());
        print(balThree.getRandomBall());
    }

    public static void print(Ball ball) {
        System.out.println("Your ball have "
                + ball.getColor() + " color and number "
                + ball.getNumber());
    }
}

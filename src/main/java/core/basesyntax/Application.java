package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        Lottery[] ball = new Lottery[3];
        for(int i = 0; i < ball.length; i++) {
            ball[i] = new Lottery();
            System.out.println(ball[i].getRandomBall());
        }
    }
}

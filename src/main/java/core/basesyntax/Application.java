package core.basesyntax;

//import java.util.Arrays;
public class Application {
    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        //Ball ball1 = Lottery.getRandomBall();
        //Ball ball2 = Lottery.getRandomBall();
        //Ball ball3 = Lottery.getRandomBall();
        Lottery lottery = new Lottery();
        for (int i = 0; i < 3; i++) {
            System.out.println(lottery.getRandomBall());
        }
        //System.out.println(Lottery.getRandomBall());
        //System.out.println(Lottery.getRandomBall());
    }

}

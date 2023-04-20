package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        Ball[] balls = new Ball[]{lottery.getRandom(),
                                  lottery.getRandom(),
                                  lottery.getRandom()};
        for (Ball ball : balls) {
            System.out.println(ball);
        }
        // create three balls using class Lottery and print information about them in console
    }
}

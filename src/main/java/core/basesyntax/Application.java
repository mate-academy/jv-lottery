package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
            Lottery lottery = new Lottery();
            Ball a = lottery.getRandomBall();
            Ball b = lottery.getRandomBall();
            Ball c = lottery.getRandomBall();
            System.out.printf("%s\n%s\n%s\n", a.toString()
                                            , b.toString()
                                            , c.toString());
    }
}


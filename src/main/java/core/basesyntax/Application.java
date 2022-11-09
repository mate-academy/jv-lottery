package core.basesyntax;

public class Application {

    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        Lottery lottery1 = new Lottery();
        Lottery lottery2 = new Lottery();
        System.out.println(lottery.getRandomBall());
        System.out.println(lottery1.getRandomBall());
        System.out.println(lottery2.getRandomBall());
    }
}

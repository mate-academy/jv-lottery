package core.basesyntax;

public class Application extends Lottery {
    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        System.out.println(lottery.getRandomBall());
        System.out.println(lottery.getRandomBall());
        System.out.println(lottery.getRandomBall());
    }
}

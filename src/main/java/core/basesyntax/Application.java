package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Ball one = new Ball();
        Ball two = new Ball();
        Ball three = new Ball();
        Lottery lottery = new Lottery();
        System.out.println(one = lottery.getRandomBall());
        System.out.println(two = lottery.getRandomBall());
        System.out.println(three = lottery.getRandomBall());
    }
}

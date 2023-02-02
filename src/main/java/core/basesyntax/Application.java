package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Ball Anton = new Lottery().getRandomBall();
        Ball Maxim = new Lottery().getRandomBall();
        Ball Georgiy = new Lottery().getRandomBall();
        System.out.println(Anton);
        System.out.println(Maxim);
        System.out.println(Georgiy);
    }
}

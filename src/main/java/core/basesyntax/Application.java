package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Ball anton = new Lottery().getRandomBall();
        Ball maxim = new Lottery().getRandomBall();
        Ball georgiy = new Lottery().getRandomBall();
        System.out.println(anton);
        System.out.println(maxim);
        System.out.println(georgiy);
    }
}

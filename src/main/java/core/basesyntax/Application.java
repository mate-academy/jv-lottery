package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery newGame = new Lottery();
        System.out.println(newGame.getRandomBall().toString());
        System.out.println(newGame.getRandomBall().toString());
        System.out.println(newGame.getRandomBall().toString());
    }
}

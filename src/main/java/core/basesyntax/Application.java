package core.basesyntax;

public class Application {

    public static void main(String[] args) {
        Lottery[] lotterys = new Lottery[]{
                new Lottery().getRandomBall(),
                new Lottery().getRandomBall(),
                new Lottery().getRandomBall()
        };
        for (int i = 0; i < lotterys.length; i++) {
            System.out.println(lotterys[i].toString());
        }
    }
}
